package design_patterns_java.singleton;

public class Main {
    public static void main(String[] args) {
       /*   evvelki usul
       var dbConnection=DbConnection.getDbConnection();
        dbConnection.addQuery("First Query");
        dbConnection.addQuery("Second Query");
        dbConnection.showQueries();
        System.out.println(dbConnection);

        var dbConnection2=DbConnection.getDbConnection();
        System.out.println(dbConnection2);
        */


        // daha sade usul threadlar ile de islenir
        Connection.INSTANCE.addQuery("First Query");
        Connection.INSTANCE.addQuery("Second Query");
        Connection.INSTANCE.showQueries();

    }
}
