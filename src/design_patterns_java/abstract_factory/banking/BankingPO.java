package design_patterns_java.abstract_factory.banking;

import design_patterns_java.abstract_factory.ProductOwner;

public class BankingPO implements ProductOwner {
    @Override
    public void menageProduct() {
        System.out.println("Banking PO mange product");
    }
}
