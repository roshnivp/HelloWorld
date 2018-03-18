package DesignPattern.FactoryPattern;

/**
 * Created by Roshni Velluva Puthanidam on 13/10/16.
 */
public class ProductB extends Product{




    public void writeName(String name) {

        StringBuilder str=new StringBuilder().append(name);
        System.out.println("My reversed name is :"+str.reverse());
    }
}
