
public class myll {
    public static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;
    public static int size;
    public void addFirst(int d){
    node n = new node(d);
    size++;
    if(head == null){
        head = tail = n;
    } else {
        n.next = head;
        head = n;
    }
}


    public void printll(){
        node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return;
        }
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        myll list = new myll();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.printll();
    }
}
