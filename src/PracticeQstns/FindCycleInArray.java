package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 09/01/18.
 */
public class FindCycleInArray {
    public static void main(String[] args){
        int[] arr = new int[]{1,3,4,2,5}; //each element points to index of nexxt element
        System.out.print(isCycle(arr));
    }

    static boolean isCycle(int[] arr){
        int p= arr[0];
        int q= arr[0];


        while(true){
            if(p<0 || p >=arr.length || q< 0 ||q>=arr.length){ //boundary condition
                return false;
            }
            p = arr[p];
            if(p == q) return true;
            if(p< 0 || p >= arr.length) return false;
            p = arr[p];
            if(p == q) return true;
            q = arr[q];
            if(p == q) return true;
        }

    }
}
