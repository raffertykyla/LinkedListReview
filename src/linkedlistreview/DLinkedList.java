package linkedlistreview;

public class DLinkedList {
    Node head;
    
    public DLinkedList(){
        head = null;
    }
    //Kyla
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

    //Tom 
    public void addFirst(String value) {
        if (head != null) {
            Node temp = head;
            head = new Node(value, null, temp);
        } else {
            head = new Node(value, null, null);
        }
        
    } 
    public String getFirst() {
        return head.value;
    }
    public String toString() {
        Node temp = head;
        String text = "| ";
        while (temp != null) {
            text += temp.value + " | ";
            temp = temp.next;
        }
        return text;
    }
    public void insertAt(int ind, String val) {
        int len = 0;
        Node temp = head;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        temp = head;
        if (ind <= len && ind != 0) {
            int num = 0;
            while (num < ind -1) {
                temp = temp.next;
                num++;
            }
            temp.next = new Node(val, temp, temp.next);
        } else if (ind == 0) {
            addFirst(val);
        } else {
            addLast(val);
        }
    }
    public void insertBefore(String target, String val) {
        int len = 0;
        Node temp = head;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        temp = head;
        int num = 0;
        while (temp.next != null) {
            if (temp.next.value == target) {
                temp.next = new Node(val, temp, temp.next);
                num = -100;
                break;
            }
            temp = temp.next;
        }
        if (num != -100) {
            addLast(val);
        }
    }
}
