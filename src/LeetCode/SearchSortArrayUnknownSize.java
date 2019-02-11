package LeetCode;

public class SearchSortArrayUnknownSize {
//    public int search(ArrayReader reader, int target) {
//        if(target==reader.get(0))return 0;
//        int high = 1;
//
//        while(reader.get(high)<target){
//            high<<=1;
//        }
//        int low = high>>1;
//
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(target == reader.get(mid))return mid;
//            else if(target < reader.get(mid)) high = mid-1;
//            else{
//                low=mid+1;
//            }
//        }
//        return -1;
//    }
}
