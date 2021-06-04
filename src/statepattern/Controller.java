package statepattern;

public class Controller {
    private static Sales sales;
    private static AccountMembers accountMembers;

    private static Connection connection;

    public Controller(){
        sales = new Sales();
        accountMembers = new AccountMembers();
    }

    public void setSalesConnection(){
        connection = sales;
    }

    public void setAccountMembersConnection(){
        connection = accountMembers;
    }

    public Connection getConnection() {
        return connection;
    }
}
