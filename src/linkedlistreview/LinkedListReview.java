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
        System.out.println(list.contains("this"));
        System.out.println(list.contains("no"));
        
        System.out.println("------------------------------");
        
            //insertAfter
        list.insertAfter("this", "really");
        list.insertAfter("no", "properly");
        System.out.println(list.getLast());
        
        System.out.println("------------------------------");
        
        
        //Tom Testing
            //addFirst & getFirst
        list.addFirst("two");
        list.addFirst("one");
        System.out.println(list.getFirst());

        System.out.println("------------------------------");
            //toString
        System.out.println(list.toString());
        
        System.out.println("------------------------------");
            //insertAt
        list.insertAt(3, "actually");
        System.out.println(list.toString());
        
        System.out.println("------------------------------");
            //insertBefore
        list.insertBefore("this", "wow");
        System.out.println(list.toString());
        
        System.out.println("------------------------------");
        
        list.insertBefore("ths", "impressive");
        System.out.println(list.toString());
    }
    
}
