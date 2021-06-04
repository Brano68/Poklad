package udemyy;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount<=100){
            if((tonerAmount + tonerLevel)>100){
                return -1;
            }else{
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        }
        return -1;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
           if(pagesToPrint%2 == 0){
               pagesToPrint /= 2;
           }else{
               pagesToPrint /= 2;
               pagesToPrint += 1;
           }
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
