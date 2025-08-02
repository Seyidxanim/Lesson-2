package design_patterns_java.factory;

import java.util.ArrayList;
import java.util.List;

import static design_patterns_java.factory.ProgrammingLanguage.*;

public class Software {
    public static void main(String[] args) {

        var developerFactory=createDeveloperFactoryByLanguage(PYTHON);
        var developer=developerFactory.createDeveloper();
        developer.writeCode();


    }

    private static DeveloperFactory createDeveloperFactoryByLanguage(ProgrammingLanguage programmingLanguage){
        return switch (programmingLanguage){
            case JAVA-> new JavaDeveloperFactory();
            case KOTLIN -> new KotlinDeveloperFactory();
            case PYTHON -> new PythonDeveloperFactory();
        };
    }
}
