package CS151.HW1;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Created by Roshni Velluva Puthanidam on 31/08/16.
 */
public class V2 {
    // TODO add other methods here
    double x;
    double y;

    public V2(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public boolean equals(V2 other) {
        // TODO add code to actually compare the magnitudes here.
        return false;
    }

    public Vector add(Vector v1,Vector v2){
        return v1;

    }


    public static void main (String[] args){

        Vector v = new Vector();
        v.add(1.1);
        v.add(2.2);
        V2 new_V2=new V2(1.1,2.2);
        Vector v1 = new Vector();
        v.add(1.5);
        v.add(2.5);
        new_V2.add(v, v1);
        String x = v.toString();
        System.out.println(x);

    }


}