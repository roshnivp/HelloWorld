package LeetCode;

import java.util.Stack;

public class MaxAreaRectangle {
    public static int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0)return 0;
        int m = matrix.length;
        int n= matrix[0].length;
        int maxArea = Integer.MIN_VALUE;
        int[] height =new int[n];

        for(int j=0; j<n;j++){
            if(matrix[0][j]=='1'){
                height[j]=1;
            }

        }
        maxArea = Math.max (maxArea, getMaxArea(height));



        for(int i=1; i<m;i++){
            for(int j=0; j<n;j++){
                if(matrix[i][j]=='1'){
                    height[j] +=1;
                }
                else{
                    height[j]=0;
                }
            }
            maxArea = Math.max (maxArea, getMaxArea(height));


        }



        return maxArea;
    }

    public static int getMaxArea(int[] heights){
        Stack<Integer> st = new Stack<>();
        if(heights.length==1) return heights[0];
        int top;
        int max_area =0;
        int area_for_currentTop;
        int i=0;
        while(i<heights.length){
            if(st.empty() || heights[st.peek()] <=heights[i]){
                st.push(i); //push index of arrayelements
                i++;
            }

            else{
                top = st.pop();;
                area_for_currentTop = heights[top] *(st.empty()? i:(i-st.peek()-1));

                if(max_area < area_for_currentTop ){
                    max_area =area_for_currentTop ;
                }

            }
        }

        while(st.empty()==false){
            top =  st.pop();
            area_for_currentTop = heights[top] *(st.empty()? i:(i-st.peek()-1));

            if(max_area < area_for_currentTop ){
                max_area =area_for_currentTop ;
            }
        }

        return max_area;
    }




    public static void main(String[] args){
        System.out.println(maximalRectangle(new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}}));
         //System.out.println(maximalRectangle(new char[][]{{'0','1'}}));
    }


}