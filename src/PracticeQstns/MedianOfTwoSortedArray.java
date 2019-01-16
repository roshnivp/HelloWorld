package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 07/04/17.
 */
public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length ;
        int n = nums2.length ;
        int l=nums1.length+nums2.length;
        int mid =(l -1)/2 ;
        int[] new_array = new int[l];
        int k = 0;
        int i = 0;
        int j = 0;

        while(i< m && j< n && k<=mid+1){
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

        while(i< m && k<=mid+1){
            new_array[k] = nums1[i];
            i++;
            k++;
        }

        while(j<n & k<=mid+1){
            new_array[k] = nums2[j];
            j++;
            k++;
        }

        if(l%2==0) return (double) (new_array[mid] +new_array[mid+1])/2;
        return (double) (new_array[mid]);
    }
    public static void main(String[] args){
        int[] num1 =new int[]{1,2};
        int[] num2 =new int[]{3,4};
        MedianOfTwoSortedArray m= new MedianOfTwoSortedArray();
        double ans=m.findMedianSortedArrays(num1,num2);
        System.out.println(ans);
    }
}
