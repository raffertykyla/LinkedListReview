package linkedlistreview;

public class Node {
    public String value;
    public Node next, previous;
    public Node(String val, Node p, Node n){
        value = val;
        previous = p;
        next = n;
    }
    public int compareTo(Node b){
        return value.compareTo(b.value);
    }
}
