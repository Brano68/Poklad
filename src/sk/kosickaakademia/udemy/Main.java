package sk.kosickaakademia.udemy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //printSquareStar(10);
        //System.out.println(getLargestPrime(217));
        //faktorial(5);
        //System.out.println(getDigitCount(45632144));
        //System.out.println(reverse(-100));

        //numberToWords(45600);
        inputThenPrintSumAndAverage();
    }

    //prvocislo najvacsie najde
    public static int getLargestPrime(int number){
        if(number < 0 || number == 1){
            return -1;
        }
        int primeNumber = 0;
        int countOfDivide = 0;

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    countOfDivide++;
                }
            }
            if(countOfDivide == 2){
                primeNumber = i;
            }
            countOfDivide = 0;

        }

        if(primeNumber > 0){
            return primeNumber;
        }

        return -1;

    }

    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
            return;
        }
        char[][] pole = new char[number][number];
        //filling spaces
        for(int i = 0; i < pole.length; i++){
            for(int j = 0; j < pole[i].length; j++){
                pole[i][j] = ' ';
            }
        }

        for(int i = 0; i < pole.length; i++){
            for(int j = 0; j < pole[i].length; j++){
                //borders
                if(i == 0 || j == 0 || i == number-1 || j == number-1){
                    pole[i][j] = '*';
                }
                //radial first
                if(i == j){
                    pole[i][j] = '*';
                }
            }
        }
        //radial second
        int k = number-1;
        for(int i = 0; i < pole.length; i++){
            pole[i][k] = '*';
           k--;
        }
        //print all array
        for(int i = 0; i < pole.length; i++){
            for(int j = 0; j < pole[i].length; j++){
                System.out.print(pole[i][j]);
            }
            System.out.println();
        }


    }

    public static int faktorial(int n){
        int vysledek;
        if(n == 1)
            return 1;
        vysledek = faktorial(n-1) * n;
        return vysledek;
    }

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }
        int num = reverse(number);
        for(int i = 0; i < getDigitCount(number); i++){
            int lastDigit = num%10;
            switch (lastDigit){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            num /= 10;
        }
    }

    public static int getDigitCount(int number){
        if(number < 0) {
            return -1;
        }
        if(number < 10){
            return 1;
        }
        int countNumbers = 0;
        while(number!=0){
            countNumbers++;
            number /= 10;
        }
        return countNumbers;
    }

    public static int reverse(int number){
       int result = 0;
        while (number != 0){
            int remaind = number%10;
            result *= 10;
            result += remaind;
            number /= 10;
        }
        return result;
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double avg = 0;
        int counter = 0;
        do {
            boolean isNumber = scanner.hasNextInt();
            if(isNumber){
                counter++;
                int i = scanner.nextInt();
                sum = sum + i;
            }else{
                avg = Math.ceil(sum/counter);
                //avg = sum/counter;
                //System.out.println(avg);
                System.out.println("SUM = " + (int)sum + " AVG = " + (int)avg);
                break;
            }
        }while (true);

    }

}
