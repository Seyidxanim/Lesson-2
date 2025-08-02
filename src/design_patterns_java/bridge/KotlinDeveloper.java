package design_patterns_java.bridge;

public class KotlinDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Write Kotlin code");
    }
}
