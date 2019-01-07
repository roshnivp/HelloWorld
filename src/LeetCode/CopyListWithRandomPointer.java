package LeetCode;

import java.util.HashMap;

public class CopyListWithRandomPointer {

    HashMap<RandomListNode,RandomListNode> visited = new HashMap<>();
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null) return null;

        RandomListNode oldNode = head;
        RandomListNode newNode = new RandomListNode(oldNode.label);
        visited.put(oldNode,newNode);


        while(oldNode!=null){
            newNode.random = getClonedNodeFromMap(oldNode.random);
            newNode.next = getClonedNodeFromMap(oldNode.next);
            oldNode= oldNode.next;
            newNode= newNode.next;

        }

        return visited.get(head);

    }

    public RandomListNode getClonedNodeFromMap(RandomListNode node){

        if(node==null)return null;

        if(visited.containsKey(node)){
            return visited.get(node);
        }

        else{
            visited.put(node,new RandomListNode(node.label));
            return visited.get(node);
        }
    }


    public static void main(String[] args){
        CopyListWithRandomPointer cp =new CopyListWithRandomPointer();
        RandomListNode root = new RandomListNode(5);
        root.next=new RandomListNode(7);
        root.next.next=new RandomListNode(9);
        root.next.next.next=new RandomListNode(11);
        root.next.next.next.next=null;
        root.random=root.next.next;
        root.next.random=root;
        root.next.next.random=root.next.next.next;

        cp.copyRandomList(root);




    }


}

class RandomListNode {

     int label;
     RandomListNode next, random;
     RandomListNode(int x) { this.label = x; }
};
