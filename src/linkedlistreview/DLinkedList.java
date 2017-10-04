package linkedlistreview;

public class DLinkedList {
    Node head;
    
    public DLinkedList(){
        head = null;
    }
    public void addLast(String value){
        Node temp = head;
        if(head == null){
            head = new Node(value, null, null);
        }else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(value, temp, null);
        }
    }
    public String getLast(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.value;
    }
}
