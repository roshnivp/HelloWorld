package LeetCode;

public class SearchInRotatedArray {

    public static int searchElement(int[] arr,int target){
        int start =0;
        int end =arr.length-1;

        if(arr.length==0) return -1;

        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[start] <=arr[mid]) {
                if (target < arr[mid] && target >=arr[start]) {
                    end = mid - 1;
                }
                else{
                    start = mid+1;
                }
            }

            else{
                if(target>arr[mid]&& target<arr[end]){
                    start = mid+1;
                }
                else{
                    end= mid-1;
                }
            }



        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = new int[]{3,1};

        System.out.println(searchElement(arr,1));
    }
}
