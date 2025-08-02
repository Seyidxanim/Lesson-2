package design_patterns_java.abstract_factory.banking;


import design_patterns_java.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write code");
    }
}
