package kalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckIt {


    public void print() throws ParseException {
        String sDate1="01/04/2021";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        String retazec = date1.toString();
        System.out.println(retazec.substring(0,3));
    }

    public int calculateDays(String den, int number){
        for(int i = 0; i < 30; i++){

        }
        return 0;
    }



}
