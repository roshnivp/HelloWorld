package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Roshni Velluva Puthanidam on 23/07/17.
 */
public class matrixZero {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        boolean firstRow =false;
        boolean firstColumn =false;
        System.out.println(a.size());
        System.out.println( a.get(0).size());

        for(int i=0; i<a.size(); i++){
            if(a.get(i).get(0)==0){
                firstColumn =true;
                break;
            }
        }
        for(int i=0; i<a.get(0).size(); i++){
            if(a.get(0).get(i)==0){
                firstRow =true;
                break;
            }
        }

        for(int i=1; i<a.size(); i++){
            for(int j=1; j<a.get(0).size(); j++){
                if(a.get(i).get(j)==0 ){

                    a.get(0).set(j,0);
                    a.get(i).set(0,0);
                }
            }
        }

        for(int i=1; i<a.size(); i++){
            for(int j=1; j<a.get(0).size(); j++){
                if(a.get(i).get(0)==0 || a.get(0).get(j)==0 ){
                    a.get(i).set(j,0);
                }
            }
        }

        if(firstColumn){
            for(int i=0; i<a.size(); i++){
                a.get(i).set(0,0);
            }
        }

        if(firstRow){
            for(int i=0; i<a.get(0).size(); i++){
                a.get(0).set(i,0);
            }

        }
    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> A =new ArrayList<>();
        A.add(0, new ArrayList<Integer>(Arrays.asList(1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0)));
        A.add(1, new ArrayList<Integer>(Arrays.asList(1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
        A.add(2, new ArrayList<Integer>(Arrays.asList(0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0)));
        A.add(3, new ArrayList<Integer>(Arrays.asList(0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1)));
        A.add(4, new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1)));
        A.add(5, new ArrayList<Integer>(Arrays.asList(1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0)));
        A.add(6, new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0)));
        A.add(7, new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1)));
        A.add(8, new ArrayList<Integer>(Arrays.asList(0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1)));
        A.add(9, new ArrayList<Integer>(Arrays.asList(1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1)));
        A.add(10, new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1)));
        A.add(11, new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)));
        A.add(12, new ArrayList<Integer>(Arrays.asList(1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1)));
        A.add(13, new ArrayList<Integer>(Arrays.asList(0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1)));
        A.add(14, new ArrayList<Integer>(Arrays.asList(1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1)));
        A.add(15, new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0)));
        A.add(16, new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0)));
        A.add(17, new ArrayList<Integer>(Arrays.asList(1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0)));
        A.add(18, new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1)));
        A.add(19, new ArrayList<Integer>(Arrays.asList(0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0)));
        A.add(20, new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0)));
        A.add(21, new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1)));
        A.add(22, new ArrayList<Integer>(Arrays.asList(1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0)));
        A.add(23, new ArrayList<Integer>(Arrays.asList(1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1)));
        A.add(24, new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0)));
        A.add(10, new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1)));
        matrixZero s= new matrixZero();
        s.setZeroes(A);
        System.out.println(A);

    }
}
