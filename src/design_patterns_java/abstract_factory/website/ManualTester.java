package design_patterns_java.abstract_factory.website;

import design_patterns_java.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester test code");
    }
}
