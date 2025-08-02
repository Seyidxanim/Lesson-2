package design_patterns_java.abstract_factory.banking;

import design_patterns_java.abstract_factory.Tester;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class QATester implements Tester {

    @Override
    public void testCode() {
        System.out.println("QA Tester test code");
    }
}
