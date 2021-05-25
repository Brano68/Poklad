package udemyy;

public class Main {
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{2, 5, 9, 8, 1}, {8, 9, -5, 2, 7}, {1, 8, 7, 9, 2}, {-2, 4, 0, 7, 2}};
        int r=matrix.length;
        int s=matrix[0].length;
        int number = 1;  //tu som dal 1
        int num = 1; //tu som dal 1

        System.out.println("hlavna diagonala"); //tu som pridal riadok vypisu

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                if (i == j) {
                    number *= matrix[i][j]; //tu som dal krat
                    System.out.println(number);
                }
            }
        }

        System.out.println("vedlajsia diagonala"); //tu som pridal riadok vypisu

        for(int i=0; i<r; i++){
            for(int j=s-1;j>=s-r; j--){
                if(i+j==r) {
                    num *= matrix[i][j]; //tu som pridal krat
                    System.out.println(num);
                }
            }
        }
    }
}
