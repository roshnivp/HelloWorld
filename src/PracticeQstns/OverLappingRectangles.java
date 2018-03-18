package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 09/01/18.
 */
public class OverLappingRectangles {

    static int findOverlappingArea(int r1bx,int r1by,int r1tx,int r1ty,int r2bx,int r2by,int r2tx,int r2ty){
        int area =0;
        int width = getWidth(r1bx,r1tx,r2bx,r2tx);
        int height = getHeight(r1by,r1ty,r2by,r2ty);
        if(width<=0 || height<=0) return 0;
        area = width * height;
        return area;
    }

    static int getWidth(int r1bx,int r1tx,int r2bx,int r2tx){
        return (Math.min(r1tx,r2tx) - Math.max(r1bx,r2bx) );
    }
    static int getHeight(int r1by,int r1ty,int r2by,int r2ty){
        return (Math.min(r1ty,r2ty) - Math.max(r1by,r2by) );
    }

    public static void main(String[] args){
        System.out.print(findOverlappingArea(2,1,5,5,3,2,5,7));
    }
}
