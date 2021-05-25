package dochadzkavskole;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        int milan = 22615101;

        //z cisla do dvojkovej sustavy

        System.out.println("---MILAN---");
        String numberInBinary = Integer.toBinaryString(milan);
        int j = 1;
        for(int i = numberInBinary.length()-1; i >= 0; i--){
            String sDate2= j+"/05/2021";
            Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
            if(numberInBinary.charAt(i) == '0'){
                System.out.println(j + ". Nebol v praci");
            }else{
                System.out.println(j + ". Bol v praci " + date2.toString().substring(0,3));
            }
            j++;
        }

        System.out.println();
        System.out.println("---EVA---");

        //instancia kalendara
        Calendar calendar = Calendar.getInstance();

        //maximalny pocet dni
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Max Day: " + maxDay);

        String result = "";
        //prechadzanie vsetkych dni a zistenie aky bol den
        for(int i = 1; i <= maxDay; i++){
            String sDate1= i+"/05/2021";
            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            String retazec = date1.toString();
            String substring = retazec.substring(0,3);
            //System.out.println(retazec.substring(0,3));
            if(substring.equals("Mon")){
                result =  "1" + result;
            }else if(substring.equals("Wed")){
                result = "1" + result;
            }else if(substring.equals("Fri")){
                result = "1" + result;
            }else{
                result = "0" + result;
            }
        }
        System.out.println(result);

        int decimal=Integer.parseInt(result,2);
        System.out.println(decimal);

    }

}
