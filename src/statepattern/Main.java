package statepattern;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        String connection = "sales";

        if(connection.equals("sales")){
            controller.setSalesConnection();
        }

        //connection = "accountMembers";

        if(connection.equals("accountMembers")){
            controller.setAccountMembersConnection();
        }

        controller.getConnection().openConn();

    }
}
