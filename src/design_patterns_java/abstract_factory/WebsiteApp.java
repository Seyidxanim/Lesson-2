package design_patterns_java.abstract_factory;

import design_patterns_java.abstract_factory.website.WebsiteTeamFactory;

public class WebsiteApp {
    public static void main(String[] args) {
        var websiteTeamFactory=new WebsiteTeamFactory();
        var developer= websiteTeamFactory.getDeveloper();
        var tester=websiteTeamFactory.getTester();
        var po=websiteTeamFactory.getProductOwner();

        System.out.println("Build website");
        developer.writeCode();
        tester.testCode();
        po.menageProduct();
    }
}
