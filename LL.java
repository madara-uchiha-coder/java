public class LL {
    private node head;
    private int size;
    private node tail;
    public LL(){
        this.size=0;
    }
    class node {
    private int value;
    private node next;
    
    node(int value){
        this.value=value;

    }
    node(int value,node next){
         this.value=value;
          this.next=next;
    }}
    
public void insertfirst(int a){
    node node = new node(a);
    node.next=head;
    head=node;
    if(tail==null) tail=head;
    size++;
}
public void insertlast(int a){
    if(tail==null) {insertfirst(a);}
    else{
        node node = new node(a);
        tail.next = node;
       tail =node;
        size++;
    }
}

public void insert(int a,int index){
    if(index==0){ insertfirst(a);
        return;
    }
    if(index == size){
        insertlast(a);
        return;
    }
    node temp =  head;
for(int i = 1 ; i<index;i++){
    temp=temp.next;
}
node node = new node(a,temp.next);
temp.next=node;
size++;
}
public void print(){
    node temp = head;
    while(temp!=null){
        System.out.print(temp.value+"->");
        temp=temp.next;
    }
     System.out.print("end");
}
public void removefirst(){
    head=head.next;
    if(head==null) tail=null;
    size--;
}
public void removelast(){
    if(size<=1){ removefirst(); return ; }
    node secondlast=ref(size-2);
   tail= secondlast;
   tail.next=null;
   size--;
}
public node ref(int index){
    node node = head;
    for(int i = 0 ; i<index;i++){
        node=node.next;
    }
    return node;
}
public void remove(int index){
    if(index == 0 ) removefirst();
    if(index==size-1) removelast();
    node temp = ref(index-1);
    temp.next=ref(index).next;
    size--;
}

}
