package PracticeQstns;




// JAVA code to partition a set into two subsets
// such that the difference of subset sums
// is minimum
import java.util.*;

class SubSetsMinDiff {

    // Function to find the minimum sum
    public static int findMinRec(int arr[], int i,
                                 int sumCalculated,
                                 int sumTotal)
    {
        // If we have reached last element.
        // Sum of one subset is sumCalculated,
        // sum of other subset is sumTotal-
        // sumCalculated. Return absolute
        // difference of two sums.
        if (i == arr.length-1)
            return Math.abs((sumTotal-sumCalculated) -
                    sumCalculated);


        // For every item arr[i], we have two choices
        // (1) We do not include it first set
        // (2) We include it in first set
        // We return minimum of two choices
        return Math.min(findMinRec(arr, i +1, sumCalculated
                        + arr[i], sumTotal),
                findMinRec(arr, i+1,
                        sumCalculated, sumTotal));
    }

    // Returns minimum possible difference between
    // sums of two subsets
    public static int findMin(int arr[], int n)
    {
        // Compute total sum of elements
        int sumTotal = 0;
        for (int i = 0; i < n; i++)
            sumTotal += arr[i];

        // Compute result using recursive function
        return findMinRec(arr, 0, 0, sumTotal);
    }


    //find subset of given sum

    public static boolean isThereSubSetSum(int arr[], int sum, int sumCalculated,int i){
        if(i>arr.length-1)return false;
        if(sum==sumCalculated){
            return true;
        }
        else{
            return isThereSubSetSum(arr,sum,sumCalculated+arr[i],i+1) ||isThereSubSetSum(arr,sum,sumCalculated,i+1);
        }
    }
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = {3, 1, 4, 2, 2, 1};
        int n = arr.length;
//        System.out.print("The minimum difference"+
//                " between two sets is " +
//                findMin(arr, n));

        System.out.println("is There SubSet Sum:"+isThereSubSetSum(arr,6,0,0));
    }
}

// This code is contributed by Arnav Kr. Mandal.
