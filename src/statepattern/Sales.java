package statepattern;

public class Sales implements Connection{
    @Override
    public void openConn() {
        System.out.println("Opening sales con");
    }

    @Override
    public void closeConn() {
        System.out.println("Closing sales con");
    }

    public void printt(){
        System.out.println("AHOJ");
    }
}
