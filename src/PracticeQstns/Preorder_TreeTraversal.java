package PracticeQstns;
import java.util.Stack;
/**
 * Created by Roshni Velluva Puthanidam on 24/03/18.
 */
public class Preorder_TreeTraversal {
    Tree_Node root;

    void iterativePreorder()
    {
        iterativePreorder(root);
    }

    // An iterative process to print preorder traversal of Binary tree
    void iterativePreorder(Tree_Node node) {

        // Base Case
        if (node == null) {
            return;
        }

        // Create an empty stack and push root to it
        Stack<Tree_Node> nodeStack = new Stack<Tree_Node>();
        nodeStack.push(root);

        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (nodeStack.empty() == false) {

            // Pop the top item from stack and print it
            Tree_Node mynode = nodeStack.peek();
            System.out.print(mynode.data + " ");
            nodeStack.pop();

            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
    }

    // driver program to test above functions
    public static void main(String args[]) {
        Preorder_TreeTraversal tree = new Preorder_TreeTraversal();
        tree.root = new Tree_Node(10);
        tree.root.left = new Tree_Node(8);
        tree.root.right = new Tree_Node(2);
        tree.root.left.left = new Tree_Node(3);
        tree.root.left.right = new Tree_Node(5);
        tree.root.right.left = new Tree_Node(2);
        tree.iterativePreorder();

    }
}
// Java program to implement iterative preorder traversal


// A binary tree node
class Tree_Node {

    int data;
    Tree_Node left, right;

    Tree_Node(int item) {
        data = item;
        left = right = null;
    }
}
