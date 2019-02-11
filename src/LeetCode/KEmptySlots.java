package LeetCode;

public class KEmptySlots {

    public static void main(String[] args){
        int[] flowers=new int[]{3,5,1,4,2};
        System.out.println(kEmptySlots(flowers,1));

    }

    public static int kEmptySlots(int[] flowers, int k) {

        int n = flowers.length;
        int[] days = new int[n];

        for(int i=0;i<n;i++){
            int day =i+1;
            days[flowers[i]-1]=day;
        }

        //make window of size k
        int left=0;
        int right= k+1;
        int ans = Integer.MAX_VALUE;
        search:while(right<n){
            for(int i=left+1;i<right;i++){
                if(days[i]<days[left] || days[i]<days[right]){
                    left=i;
                    right=i+k+1;
                    continue search;
                }
            }
            ans = Math.min(ans,Math.max(days[left],days[right]));
            left+=1;
            right=left+k+1;

        }

        return ans==Integer.MAX_VALUE?-1:ans;

    }
}
