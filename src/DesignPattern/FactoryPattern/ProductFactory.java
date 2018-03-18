package DesignPattern.FactoryPattern;

/**
 * Created by Roshni Velluva Puthanidam on 13/10/16.
 */
public class ProductFactory {

    Product createProduct(String type){
        if(type=="B"){
            return  new ProductB();
        }
        else{
            return new ProductA();
        }
    }
}
