package PracticeQstns;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Roshni Velluva Puthanidam on 24/03/18.
 */
public class PostOrder_TreeTraversal {
    Tree_Node root;
    ArrayList<Integer> list = new ArrayList<Integer>();

    // An iterative function to do postorder traversal
    // of a given binary tree
    ArrayList<Integer> postOrderIterative(Tree_Node node)
    {
        Stack<Tree_Node> S = new Stack<Tree_Node>();

        // Check for empty tree
        if (node == null)
            return list;
        S.push(node);
        Tree_Node prev = null;
        while (!S.isEmpty())
        {
            Tree_Node current = S.peek();

            /* go down the tree in search of a leaf an if so process it
            and pop stack otherwise move down */
            if (prev == null || prev.left == current ||
                    prev.right == current)
            {
                if (current.left != null)
                    S.push(current.left);
                else if (current.right != null)
                    S.push(current.right);
                else
                {
                    S.pop();
                    list.add(current.data);
                }

                /* go up the tree from left node, if the child is right
                   push it onto stack otherwise process parent and pop
                   stack */
            }
            else if (current.left == prev)
            {
                if (current.right != null)
                    S.push(current.right);
                else
                {
                    S.pop();
                    list.add(current.data);
                }

                /* go up the tree from right node and after coming back
                 from right node process parent and pop stack */
            }
            else if (current.right == prev)
            {
                S.pop();
                list.add(current.data);
            }

            prev = current;
        }

        return list;
    }

    // Driver program to test above functions
    public static void main(String args[])
    {
        PostOrder_TreeTraversal tree = new PostOrder_TreeTraversal();

        // Let us create trees shown in above diagram
        Tree_Node root = new Tree_Node(1);
        root.left = new Tree_Node(2);
        root.right = new Tree_Node(3);
        root.left.left = new Tree_Node(4);
        root.left.right = new Tree_Node(5);
//        root.right.left = new Tree_Node(6);
//        root.right.right = new Tree_Node(7);

        ArrayList<Integer> mylist = tree.postOrderIterative(root);

        System.out.println("Post order traversal of binary tree is :");
        System.out.println(mylist);
    }
}
