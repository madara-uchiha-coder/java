public class linkedlistclass {
    private node head;
    private node tail;
    private int size;
    public linkedlistclass(){
        this.size=0;
    }
    public void insertfirst(int n){
        node node=new node(n);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;

        }
        size++;
    }
 private class node{
    private int value;
    private node next;

public node(int value){
    this.value=value;
}
public node(int value,node next){
    this.value=value;
    this.next=next;
}
} 
}
