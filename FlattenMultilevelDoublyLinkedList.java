import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}

 
class FlattenMultilevelDoublyLinkedList{
    public Node flatten(Node current) {
        Stack<Node> stack = new Stack<>();
        Node head = current;
        while(head!=null || !stack.isEmpty()){
            if(head.child!=null){
                if(head.next !=null)
                    stack.push(head.next);
                head.next = head.child;
                head.child.prev = head;
                head.child = null;
            }
            else if(head.next == null && !stack.isEmpty()){
                head.next = stack.pop();
                head.next.prev = head;
            }
            head = head.next; 
        }
        return current;
    }
}