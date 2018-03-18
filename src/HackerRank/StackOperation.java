package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by Roshni Velluva Puthanidam on 21/07/16.
 */
public class StackOperation {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */

        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> track = new Stack<Integer>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int arr_i = 0; arr_i <n; arr_i++)
        {
            int command=in.nextInt();
            if (command == 1) {
                int numToPush = in.nextInt();//THE NUMBER AFTER THE COMMAND ONE
                st.push(numToPush);
                if (max <= numToPush) {
                    max = numToPush;
                    track.push(max);
                }

            }
            else if (command==2) {
                int poppedItem = st.pop();
                //IN THIS CASE WE ARE REMOVING THE ELEMENT PRESENT AT THE TOP OF THE STACK
                if (poppedItem == track.peek()) {
                    track.pop();
//                    if (track.size() > 0) {
//                        max = track.peek();
//                    } else {
//                        max = Integer.MIN_VALUE;
//                    }
                }
            }
            else if (command==3){

                System.out.println( track.peek());
            }

            }

    }




}
