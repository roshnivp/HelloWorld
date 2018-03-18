/**
 * Created by Roshni Velluva Puthanidam on 10/10/16.
 */
import java.util.*;

class Foo {
    private int x = 10;

    public int getX() {
        return x;
    }

    private static int y;

    public static void callMeMaybe() {
        System.out.println("Static method");
        //System.out.println(this.x); // Fails, "this" is not available in
        //static context.
    }
    public void setX(int x) { this.x = x; }
}
public class Module1 {
    public static void main(String[] args) {
        //        // Shallow copy demo
        Foo obj1; // = new Foo();
        Foo obj2 = new Foo();

        obj1 = obj2;
        obj2.setX(20);
        System.out.println("X value = " + obj1.getX());

        int[] a = new int[100];
        a[0] = 13;
        a[1] = 26;
        System.out.println("a.length = " + a.length); // read-only access
        //.length -- 100
        //       
       //         //a[100] = 13; // throws ArrayOutOfBounds exception at runtime

        int[][] grid1 = new int[100][100]; // allocate a 100x100 array
        System.out.println("grid1.length = " + grid1.length); // Notice length
        //== 100 since it's really just a 1D array.
        grid1[0][1] = 10;

        int temp;
        int[][] grid = new int[10][];

        for (int i = 0; i < grid.length; i++) {
            grid[i] = new int[i];
            System.out.println(grid[i].length);
            }

        Foo.callMeMaybe(); //Can call without an object
        Foo.callMeMaybe(); // or with one. Your choice.
        }
}
