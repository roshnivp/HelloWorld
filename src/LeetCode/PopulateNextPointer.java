package LeetCode;

public class PopulateNextPointer {
    public void connect(TreeLinkNode root) {
        connect(root, null);
    }

    public void connect(TreeLinkNode node, TreeLinkNode rightLink) {
        if(node != null) {
            node.next = rightLink;

            connect(node.left, node.right);
            if (rightLink != null) {
                connect(node.right, rightLink.left);
            } else {
                connect(node.right, null);
            }
        }
    }

    public static void main(String[] args){
        TreeLinkNode node = new TreeLinkNode(8);
        node.left = new TreeLinkNode(5);
        node.right = new TreeLinkNode(10);
        node.left.left = new TreeLinkNode(3);
        node.left.right = new TreeLinkNode(7);
        node.right.left = new TreeLinkNode(12);
        PopulateNextPointer p = new PopulateNextPointer();
        p.connect(node);
    }
}

class TreeLinkNode {
     int val;
     TreeLinkNode left, right, next;
     TreeLinkNode(int x) { val = x; }
}