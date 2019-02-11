package LeetCode;

public class RLEIterator { //run-length encoding

    int[] arr;
    int index;
    public RLEIterator(int[] A){ //even index refers how many times nex element present in the actual array
        arr = A;
        index = 0; //refers starting index
    }

    public int next(int n) { //n is the number elements to be pop out
        while(index<arr.length && n>arr[index]){
            n = n - arr[index]; //decrement the n by current number
            index+=2; //index is pointed to next counter
        }
        if(index>=arr.length-1){ //refers the last element in the arr,no more next is possible
            return -1;
        }
        arr[index] = arr[index]-n;
        return arr[index+1]; //points to actual element
    }

    public static void main(String[] args){
        RLEIterator itr = new RLEIterator(new int[]{1,2,3,4,2,5});
        System.out.println(itr.next(2));
        System.out.println(itr.next(2));
        System.out.println(itr.next(1));
    }
}
