package hashcode;

public class Main {

    public static void main(String[] args) {

    }


    public int hashCode(String lName){
        if(lName.length() == 0){
            return 0;
        }
        String result = "";
        for(int i = 0; i < lName.length(); i++){
            if(lName.toLowerCase().charAt(i) ==  'b' || lName.toLowerCase().charAt(i) == 'c'  ||
                    lName.toLowerCase().charAt(i) == 'd' || lName.toLowerCase().charAt(i) == 'f' ||
                    lName.toLowerCase().charAt(i) == 'g' || lName.toLowerCase().charAt(i) == 'h' ||
                    lName.toLowerCase().charAt(i) == 'j' || lName.toLowerCase().charAt(i) == 'k' ||
                    lName.toLowerCase().charAt(i) == 'l' || lName.toLowerCase().charAt(i) == 'm' ||
                    lName.toLowerCase().charAt(i) == 'n' || lName.toLowerCase().charAt(i) == 'p' ||
                    lName.toLowerCase().charAt(i) == 'q' || lName.toLowerCase().charAt(i) == 'r' ||
                    lName.toLowerCase().charAt(i) == 's' || lName.toLowerCase().charAt(i) == 't' ||
                    lName.toLowerCase().charAt(i) == 'v' || lName.toLowerCase().charAt(i) == 'w' ||
                    lName.toLowerCase().charAt(i) == 'x' || lName.toLowerCase().charAt(i) == 'z'){
                result += 1;
            }else{
                result += 0;
            }
        }
        return Integer.parseInt(result,2);
    }
}
