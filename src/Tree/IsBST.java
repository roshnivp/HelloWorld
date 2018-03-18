package Tree;
/**
 * Created by roshni on 6/17/16.
 */
public class IsBST {
    public static Node prevNode = null;
    Node root;
    // method 1: do inOrder and check if it is in ascending order
    // doesnt work in case of duplicates
    public boolean IsBST1(Node root) {
        if (root != null) {
            if (!IsBST1(root.left)) {
                return false;
            }
            if (prevNode != null && prevNode.data >= root.data) {
                return false;
            }
            prevNode = root;
            return IsBST1(root.right);
        }

        return true;
    }

    // //method 2
// The max-Min solution
    public boolean IsBST2(Node root, int min, int max) {
        if(root!=null){
            if(root.data<min||root.data>max){
                return false;
            }
            return IsBST2(root.left,min,root.data)&&IsBST2(root.right,root.data,max);
        }
        return true;
    }

  Node lowestCommonAncestor(Node root, Node p, Node q) {
    if(root == null || root == p || root == q) return root;
    Node left = lowestCommonAncestor(root.left, p, q);
    Node right = lowestCommonAncestor(root.right, p, q);
    if(left!=null&&right!=null) return root;
    return left == null ? right : left;
}


    public void inOrder(Node root,int k){
        if(root!=null){
            inOrder(root.left,k);
            System.out.println(" "+root.data);
            inOrder(root.right,k);
        }
    }
    //sum of the nodes
    double sum( Node root )
    {
        double mySum, leftSum, rightSum;
        if ( root == null ) {
            mySum = 0;        // PracticeQstns.StackOperation for the base case
            return mySum;     // Return solution
        } else  {
                leftSum  = sum( root.left );      // Solve smaller problem 1
                rightSum = sum( root.right );     // Solve smaller problem 2
                mySum = root.data + leftSum + rightSum;
                // Solve my problem using
                // solution of smaller problem
                return mySum;     // Return solution
            }
        }


        //create a bst from sorted array

     Node sortedArrayToBST(int a[],int start,int end){
        /* Base Case */
         Node root;
        if (start>end){
            return null;
        }
         /* Get the middle element and make it root */
        int mid=(start+end)/2 ;
        root=new Node(a[mid]);
         /* Recursively construct the left subtree and make it
         left child of root */
        root.left=sortedArrayToBST(a,start,mid-1);
         /* Recursively construct the right subtree and make it
         left child of root */
        root.right=sortedArrayToBST(a,mid+1,end);
        return root;

     }
    //second smallest
     int mystery(Node n) {
        if(n==null)
            throw new IllegalArgumentException();
        if(n.left == null)
            return leftmost(n.right);
        if(n.left.left == null && n.left.right == null)
            return n.data;
         return mystery(n.left);
     }
// return leftmost descendant of n static
     int leftmost(Node n) {
       if(n==null)
            throw new IllegalArgumentException();
       if(n.left == null) return n.data;
         return leftmost(n.left);
     }
    //depth of bst
    int depth2(Node node){
        if(node == null)
            return 0;
        int left = depth2(node.left);
        int right = depth2(node.right);

        int x = left > right ? left+1 : right+1;
        return x;
    }

    public static void main(String[] args){
        IsBST i=new IsBST();
        int a[]=new int[]{5,8,12,13,15,18,19,25,30,35,56,60,62,67,76};
        int n=a.length;
        Node node=i.sortedArrayToBST(a,0,n-1);
        i.inOrder(node,5);
        Node nn=i.lowestCommonAncestor(node,node.right.left.left,node.right.left);
        System.out.println("Lowest common ancestor is:"+nn.data);
        int x=i.depth2(node);
        System.out.println("depth is:"+x);
        int d=i.mystery(node);
        System.out.println("second smallest:"+d);
        double sum= i.sum(node);
        System.out.println("sum is:"+sum);
//        Node root=new Node(20);
//        root.left = new Node(10);
//        root.right = new Node(30);
//        root.left.left = new Node(5);
//        root.left.right = new Node(15);
//        root.right.left = new Node(25);
//        root.right.right = new Node(35);
//        System.out.println("Tree is ");
//        i.inOrder(root);
//        System.out.println();
//        System.out.println("is Tree BST ?? METHOD 1 : " + i.IsBST1(root));
//        System.out.println("is Tree BST ?? METHOD 2 : "
//                + i.IsBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
//        root.left.right.right = new Node(40);
//        System.out.println("Tree is ");
//        i.inOrder(root);
//        System.out.println();
//        System.out.println("is Tree BST ?? METHOD 1 : " + i.IsBST1(root));
//        System.out.println("is Tree BST ?? METHOD 2 : "
//                + i.IsBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        }
}
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}