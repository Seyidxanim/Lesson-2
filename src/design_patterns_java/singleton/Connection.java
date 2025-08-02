package design_patterns_java.singleton;

public enum Connection {
    INSTANCE;

    private static String queryHistory="Query History:\n";

    public  void addQuery(String query){
        queryHistory+=query +"\n";
    }

    public void showQueries(){
        System.out.println(queryHistory);
    }
}
