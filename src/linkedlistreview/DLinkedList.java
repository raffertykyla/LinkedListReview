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
    public Node getNode(int element){
        Node temp = head;
        for(int i = 0; i < element; i++){
            while(temp.next != null){
                temp = temp.next;
            }
        }
        return temp;
    }
    public String get(int element){
        return getNode(element).value;
    }
    public boolean contains(String target){
        Node temp = head;
        boolean flag = false;
        while(temp.next != null){
            if(temp.value.equals(target)){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        return flag;
    }
    public void insertAfter(String target, String value){
        Node temp = head;
        if(contains(target)){
            while(temp.next != null){
                if(temp.value.equals(target)){
                    temp.next = new Node (value, temp, temp.next);
                    break;
                }
                temp = temp.next;
            }
        }else{
            addLast(value);
        }
    }
}
