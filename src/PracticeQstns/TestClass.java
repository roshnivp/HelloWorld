package PracticeQstns;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Roshni Velluva Puthanidam on 20/10/16.
 */
public abstract class TestClass {

    public void draw(){
        System.out.println("inner");
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10; i++)
            list.add(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next( );
            it.remove();
            if (it.hasNext()) it.next( );
        }
        System.out.println(list);


    }
}
class Test1 extends TestClass{
    public void draw(){
        System.out.println("outer");
    }
}