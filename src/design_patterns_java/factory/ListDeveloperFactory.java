package design_patterns_java.factory;


import java.util.List;

public class ListDeveloperFactory {

   //List<DeveloperFactory> list=List.of(JavaDeveloperFactory,KotlinDeveloperFactory);
    JavaDeveloperFactory javaDeveloperFactory;
    KotlinDeveloperFactory kotlinDeveloperFactory;

    List<DeveloperFactory> list=List.of(javaDeveloperFactory, kotlinDeveloperFactory);

}
