package design_patterns_java.abstract_factory.website;

import design_patterns_java.abstract_factory.Developer;
import design_patterns_java.abstract_factory.ProductOwner;
import design_patterns_java.abstract_factory.ProjectTeamFactory;
import design_patterns_java.abstract_factory.Tester;


public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new WebsitePO();
    }
}
