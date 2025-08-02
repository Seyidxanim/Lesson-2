package design_patterns_java.abstract_factory.website;

import design_patterns_java.abstract_factory.ProductOwner;

public class WebsitePO implements ProductOwner {
    @Override
    public void menageProduct() {
        System.out.println("Website PO manage product");
    }
}
