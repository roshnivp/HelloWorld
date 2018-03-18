/**
 * Created by Roshni Velluva Puthanidam on 19/10/16.
 */
public class Outer {
    private  int a;
    private void increment() {
        a++;
        }
    private class Inner extends Object {
        private int b;
        private Inner(int initB) {
            b = initB;
            }
        private void demo() {// access our own ivar
            System.out.println("Inside Inner b: " + b);
           //             // access the ivar of our outer object
            System.out.println("Inside Inner a: " + a);
           //             // message send can also go to the outer object
            increment();
            /*
            Outer.this refers to the outer object, so could say
            Outer.this.a or Outer.this.increment()
            */
            }
        }
//        // Nested class is like an inner class, but
  //              // wihout a pointer to the outer object.
  //              // (uses the keyword "static")
            private static class Nested {
                    private int c;
                    void demo() {
                        c = 11; // this works
                         System.out.println("Inside Nested c: " + c);
           //     //        //a = 13; // no does not compile --
           //             // nested object does not have pointer to outer object
            }
        }

    public void test() {
        a = 10;
        Inner i1 = new Inner(1);
        Inner i2 = new Inner(2);
        i1.demo(); // output: b 1, a 10
        i2.demo(); // b 2, a 11
      //        
        Nested n = new Nested();
        n.demo();
        }




    public static void main(String[] args) {
        Outer o = new Outer();
        //        // Obscure syntax to create an inner object
       //         // not from within an outer method. Consider never
       //         // doing this.
       //        
       Inner i3 = o.new Inner(6);
        i3.demo();
        Nested n = new Nested();
        n.demo();

        o.test();
        }
}
