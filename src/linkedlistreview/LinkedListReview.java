package linkedlistreview;

public class LinkedListReview {

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        
        //Kyla Testing
            //addLast and getLast
        list.addLast("this");
        System.out.println(list.getLast());
        list.addLast("works");
        System.out.println(list.getLast());
        
        System.out.println("------------------------------");
        
            //getNode and get
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        
        System.out.println("------------------------------");
        
            //contains
        System.out.println(list.contains(list.getNode(0)));
        
        //Tom Testing
    }
    
}
