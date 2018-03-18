package DesignPattern.FactoryPattern;

/**
 * Created by Roshni Velluva Puthanidam on 13/10/16.
 */
public class TestClientFactory {
    public static void main(String[] args) {
        ProductFactory pf = new ProductFactory();
        Product prod;
        prod=pf.createProduct("B");
        prod.writeName("roshni");
        prod=pf.createProduct("A");
        prod.writeName("roshni");
    }
}
