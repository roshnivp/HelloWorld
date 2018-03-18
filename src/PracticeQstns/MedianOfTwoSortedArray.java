package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 07/04/17.
 */
public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length ;
        int n = nums2.length ;
        int l=m+n;
        int mid =(l -1)/2 ;
        int[] new_array = new int[l];
        int k = 0;
        int i = 0;
        int j = 0;

        while(i< m && j< n){
            if(nums1[i]<= nums2[j]){
                new_array[k] = nums1[i];
                i++;
            }
            else{
                new_array[k] = nums2[j];
                j++;
            }
            k++ ;
        }

        while(i< m){
            new_array[k] = nums1[i];
            i++;
            k++;
        }

        while(j<n){
            new_array[k] = nums2[j];
            j++;
            k++;
        }
        if(new_array.length%2 != 0){
            return (double)new_array[mid] ;
        }
        else{
            return (new_array[mid] +new_array[mid+1])/2.0;
        }
    }
    public static void main(String[] args){
        int[] num1 =new int[]{1,2};
        int[] num2 =new int[]{3,4};
        MedianOfTwoSortedArray m= new MedianOfTwoSortedArray();
        double ans=m.findMedianSortedArrays(num1,num2);
        System.out.println(ans);
    }
}
