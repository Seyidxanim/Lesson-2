package design_patterns_java.abstract_factory;


import design_patterns_java.abstract_factory.banking.BankingTeamFactory;

public class BankingApp {
    public static void main(String[] args) {
        var bankingTeamFactory= new BankingTeamFactory();
        var developer =bankingTeamFactory.getDeveloper();
        var tester=bankingTeamFactory.getTester();
        var po=bankingTeamFactory.getProductOwner();

        System.out.println("Building banking app ");

        developer.writeCode();
        tester.testCode();
        po.menageProduct();
    }
}
