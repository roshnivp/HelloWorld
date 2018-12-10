package PracticeQstns; /**
 * Created by roshni on 6/13/16.
 */
public class BinArrayFind {


    public int BinArrayFind(int array[ ], int low, int high, int
            key ) {

       if( low <= high ){

            int mid=(high + low) /2;

            if( key == array[mid])
            {
                return mid;

            }
            else if (key < array[mid]) {
                    high = mid - 1;
                    return BinArrayFind(array, low, high, key);
            }

            else {
                    low = mid + 1;
                    return BinArrayFind(array, low, high, key);
            }
       }

        return -1;
    }
    public static void main(String[] args){
        int[] a =  {2,4,6,8,10,12};
        BinArrayFind b = new BinArrayFind();

        int n= b.BinArrayFind(a,0,a.length-1,8);
        System.out.println("Element found @:"+n);
    }

}
