package lambda2;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        /*
        Calculate calculate = (a,b)-> a * b;
        double result = calculate.calc(5,10);
        System.out.println(result);
        calculate=(a,b)->{return a>b?a:b;};
        System.out.println(calculate.calc(5,10));

        Calculate calculate2 = (a,b)-> a-b; //{return a-b; }
        print(5,8,calculate2);


         */
        Tax tax = (a)-> a*1.20;
        printEurWithTax(41.40,tax);
    }

    private static void print(int a, int b, Calculate calculate){
        System.out.println(calculate.calc(a,b));
    }


    private static void printEurWithTax(double value, Tax tax){
        double result = tax.calcTax(value);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(result) + " €");
    }

}
