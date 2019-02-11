package LeetCode;
import java.util.HashSet;

public class DupSubTrees {
    // Java program to find if there is a duplicate
// sub-tree of size 2 or more.


        static char MARKER = '$';

        // This function returns empty string if tree
        // contains a duplicate subtree of size 2 or more.
        public static String dupSubUtil(TNode root, HashSet<String> subtrees)
        {
            String s = "";

            // If current node is NULL, return marker
            if (root == null)
                return s + MARKER;

            // If left subtree has a duplicate subtree.
            String lStr = dupSubUtil(root.left,subtrees);
            if (lStr.equals(s))
                return s;

            // Do same for right subtree
            String rStr = dupSubUtil(root.right,subtrees);
            if (rStr.equals(s))
                return s;

            // Serialize current subtree
            s = s + root.data + lStr + rStr;

            // If current subtree already exists in hash
            // table. [Note that size of a serialized tree
            // with single node is 3 as it has two marker
            // nodes.
            if (s.length() > 3 && subtrees.contains(s))
                return "";

            subtrees.add(s);
            return s;
        }

        //Function to find if the Binary Tree contains duplicate
        //subtrees of size 2 or more
        public static String dupSub(TNode root)
        {
            HashSet<String> subtrees=new HashSet<>();
            return dupSubUtil(root,subtrees);
        }

        public static void main(String args[])
        {
            TNode root = new TNode('A');
            root.left = new TNode('B');
            root.right = new TNode('C');
            root.left.left = new TNode('D');
            root.left.right = new TNode('E');
            root.right.right = new TNode('B');
            root.right.right.right = new TNode('E');
            root.right.right.left= new TNode('D');
            String str = dupSub(root);
            if(str.equals(""))
                System.out.print(" Yes ");
            else
                System.out.print(" No ");
        }
    }

    // A binary tree Node has data,
// pointer to left child
// and a pointer to right child

//This code is contributed by Gaurav Tiwari


