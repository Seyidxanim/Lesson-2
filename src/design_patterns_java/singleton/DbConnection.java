package design_patterns_java.singleton;

public class DbConnection {

    private static DbConnection dbConnection;

    private static String queryHistory = "Query historu:\n";

    public static DbConnection getDbConnection() {
        if (dbConnection == null) dbConnection = new DbConnection();
        return dbConnection;
    }

    private DbConnection(){
    }

    public void  addQuery(String query){
        queryHistory+=query +"\n";
    }

    public void showQueries(){
        System.out.println(queryHistory);
    }
}
