package bst;


public class Node<T extends Comparable<?>> {
    public Node<T> left, right, next;
    public T data;
    public boolean visit;

    public Node(T data) {
        this.data = data;
        left=right=next=null;
        visit=false;
    }
    

}
