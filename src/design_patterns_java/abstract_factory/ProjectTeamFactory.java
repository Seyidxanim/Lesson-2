package design_patterns_java.abstract_factory;

import design_patterns_java.abstract_factory.Developer;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProductOwner getProductOwner();
}
