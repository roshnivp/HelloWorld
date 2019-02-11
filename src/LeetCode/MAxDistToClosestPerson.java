package LeetCode;

public class MAxDistToClosestPerson {
    public static int maxDistToClosest(int[] seats) {
       int n= seats.length;
       int ans = 0;
       int i=0;
       for(int j=0;j<n;j++){

           if(seats[j]==1){
               if(i==0) {
                   ans= Math.max(ans,j-i);//it works if we have zeroes at initial positions (prefix zeroes)
               }
               else{
                   ans = Math.max(ans,(j-i+1)/2);//mid of the group of  0's
               }
               i=j+1;

           }

       }

       ans = Math.max(ans,n-i);//take care of zeroes in last positions (suffix zeros)
       return ans;

    }

    public static void main(String[] args){
        System.out.println(maxDistToClosest(new int[]{0,0,0,0,1,0,1,0,0,0}));
    }
}
