package design_patterns_java.factory;

public class PythonDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
