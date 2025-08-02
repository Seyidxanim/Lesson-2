package design_patterns_java.abstract_factory.banking;

import design_patterns_java.abstract_factory.Developer;
import design_patterns_java.abstract_factory.ProductOwner;
import design_patterns_java.abstract_factory.ProjectTeamFactory;
import design_patterns_java.abstract_factory.Tester;



public class BankingTeamFactory implements ProjectTeamFactory {


    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new BankingPO();
    }
}
