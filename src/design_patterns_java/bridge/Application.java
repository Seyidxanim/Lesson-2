package design_patterns_java.bridge;

public abstract class Application {// bridge hisse
    private final Developer developer;// birlesdiren hisse

    public Application(Developer developer){
        this.developer=developer;
    }

    public abstract void developApplication();

    public  Developer getDeveloper(){
        return developer;
    }
}
