package statepattern;

public class AccountMembers implements Connection{
    @Override
    public void openConn() {
        System.out.println("Opening accountMembers con");
    }

    @Override
    public void closeConn() {
        System.out.println("Closing accountMembers con");
    }
}
