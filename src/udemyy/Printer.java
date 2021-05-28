package udemyy;

public class Printer {
    private int tonerLevel = -1;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if((tonerAmount + tonerLevel)>100){
                return -1;
            }else{
                tonerLevel += tonerAmount;
                return 1;
            }
        }
        return -1;
    }

    public int printPages(int pages){
        if(duplex){
            pages = (int)Math.ceil(pages/2);
            pagesPrinted = pages;
            return pagesPrinted;
        }
        return pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
