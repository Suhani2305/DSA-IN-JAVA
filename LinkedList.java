// public class LinkedList {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     // add at first
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++; // its for size of ll
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head; // link
//         head = newNode;
//     }

//     // add at last
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++; // its for size of ll
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode; // link
//         tail = newNode;
//     }

//     // print the ll
//     public void print() { // o(n)
//         if (head == null) {
//             System.out.println("Linked list is empty");
//             return;
//         }
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // add in the middle o(n)
//     public void add(int idx, int data) {
//         if (idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         Node temp = head;
//         int i = 0;
//         while (i < idx - 1) {
//             temp = temp.next;
//             i++;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//         size++;
//     }

//     // remove in a linked list -- remove first
//     public int removeFirst() {
//         if (head == null) {
//             System.out.println("Linked list is empty");
//             return Integer.MIN_VALUE;
//         } else if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }

//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }

//     public int removeLast() {
//         if (head == null) {
//             System.out.println("Linked list is empty");
//             return Integer.MIN_VALUE;
//         } else if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }

//         // To remove the last element, find the second-to-last element
//         Node prev = head;
//         for (int i = 0; i < size - 2; i++) {
//             prev = prev.next;
//         }
//         int val = tail.data; // save the value to return
//         prev.next = null; // remove the last node
//         tail = prev; // update the tail to the second-to-last node
//         size--;
//         return val;
//     }
//     public int itrSearch(int key){
//         Node temp = head;
//         int i =0;
//         while(temp!=null){
//             if(temp.data == key){    //key found
//                 return i;
//             }
//             temp =  temp.next;
//             i++;
//         }
//         // key not found
//         return -1;
//     }
//     public int helper(Node head, int key){
//         if(head==null){
//             return -1;
//         }
//         if(head.data == key){
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if(idx == -1){
//             return -1;
//         }
//         return idx+1;

//     }

//     public int recSearch(int key){
//         return helper(head, key);

        
//     }
//     public void reverse(){
//         Node prev = null;
//         Node curr = tail = head;
//         Node next;
//         while(curr!=null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr= next;
//         }
//         head = prev;
//     }

//     // find and remove nth node from end
//     // iterative approach
//     public void deleteNthfromEnd(int n){
//         int sz=0;
//         Node temp = head;
//         while(temp !=null){
//             temp = temp.next;
//             sz++;
//         }
//         if(n==sz){
//             head= head.next   ;        // remove First
//             return;
//         }
//         // sz-n
//         int i =1;
//         int iToFind = sz-n;
//         Node prev = head;
//         while(i<iToFind){
//             prev = prev.next;
//             i++;
//         }
//         prev.next = prev.next.next;
//         return;
//     }


//     // slow - fast approach
//     public Node findMid(Node head){
//         Node slow = head;
//         Node fast = head;
//         while(fast != null && fast.next != null){
//             slow = slow.next; //+1
//             fast= fast.next.next;  //+2

//         }
//         return slow; // 
//     }




//     // detecting cycle code
//     public static boolean isCycle(){
//         Node slow = head;
//         Node fast = head;
//         while(fast != null && fast.next !=null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow==fast){
//                 return true;  //cycle exits

//             }
//         }
//         return false;

//     }
//     public static void removeCycle(){
//         // detect cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;
//         while(fast != null && fast.next !=null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow==fast){
//                 cycle = true;  //cycle exits
//                 break;
//             }
//         }
//         if(cycle == false){
//             return;
//         }

//         // find meeting point 
//         slow = head;
//         Node prev = null;    //last node
//         while(slow!=fast){
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }
//         // remove cycle  -> last.next = null
//         prev.next = null;
//     }
//     public Node getMid(Node head){
//         Node slow = head;
//         Node fast = head.next;
//         while(fast!=null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;  //mid node

//     }

//     public Node mergeSort(Node head) {   //o(nlogn)
//         if (head == null || head.next == null) {
//             return head;
//         }
    
//         // Find the middle of the list
//         Node mid = getMid(head);
//         Node rightHead = mid.next;
//         mid.next = null; // Split the list into two halves
    
//         // Recursively sort the two halves
//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(rightHead);
    
//         // Merge the sorted halves
//         return merge(newLeft, newRight);
//     }
    
//     private Node merge(Node head1, Node head2) {
//         Node mergedLL = new Node(-1); // Dummy node to start the merged list
//         Node temp = mergedLL;
    
//         while (head1 != null && head2 != null) {
//             if (head1.data <= head2.data) {
//                 temp.next = head1;
//                 head1 = head1.next;
//             } else {
//                 temp.next = head2;
//                 head2 = head2.next;
//             }
//             temp = temp.next;
//         }
    
//         // If there are remaining nodes in either list, append them
//         if (head1 != null) {
//             temp.next = head1;
//         }
//         if (head2 != null) {
//             temp.next = head2;
//         }
    
//         return mergedLL.next; // Return the merged list, skipping the dummy node
//     }
//     public void zigZag(){
//         // find mid
//         Node slow = head;
//         Node fast = head.next;
//         while(fast != null && fast.next!=null){
//             slow = slow.next;
//             fast= fast.next.next;
//         }
//         Node mid = slow;

//         // reverse 2nd half
//         Node curr = mid.next;
//         mid.next = null;
//         Node prev = null;
//         Node next;
//         while(curr!=null){
//             next = curr.next;
//             curr.next = prev;
//             prev=curr;
//             curr= next;
//         }
//         Node left = head;
//         Node right = prev;
//         Node nextL, nextR;


//         // alt merge - zig _ zag merge
//         while(left!=null && right!=null){
//             nextL=left.next ;
//             left.next = right;
//             nextR = right.next;
//             right.next = nextL;
//             left = nextL;
//             right=nextR;


            
//         }
//     }


//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         // ll.print();
//         ll.addFirst(1);
//         // ll.print();
//         ll.addFirst(2);
//         // ll.print();
//         ll.addLast(3);
//         // ll.print();
//         ll.addLast(4);
//         // ll.print();
//         ll.add(2, 9);
//         ll.print();
//         ll.zigZag();
//         // ll.head = ll.mergeSort(ll.head);
//         ll.print();
//         // // ll.removeFirst();
//         // // ll.print();
//         // // ll.removeLast();
//         // ll.print();
//         // // System.out.println(ll.itrSearch(3));
//         // // System.out.println(ll.recSearch(10));
//         // // ll.reverse();
//         // // ll.print();
//         // ll.deleteNthfromEnd(3);
//         // ll.print();

//         // head= new Node(1);
//         // Node temp = new Node(2);
//         // head.next = temp;
//         // head.next.next= new Node(3);
//         // head.next.next.next= temp;
//         // // 1->2->3->2
//         // System.out.println(isCycle());
//         // removeCycle();
//         // System.out.println(isCycle());




//     }
// 


// // doubly LL
// /**
//  * LinkedList
//  */
// public class LinkedList {
//     public class Node {
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     private Node head;
//     private Node tail;
//     private int size;

//     public LinkedList() {
//         this.head = null;
//         this.tail = null;
//         this.size = 0;
//     }

//     // add
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head;
//         head.prev = newNode;
//         head = newNode;
//     }

//     // print
//     public void print() {
//         if (head == null) {
//             System.out.println("Linked list is empty");
//             return;
//         }
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " <-> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // remove
//     public int removeFirst(){
//         if(head==null){
//             System.out.println("DLL is empty");
//             return Integer.MIN_VALUE;
//         }
//         if(size==1){
//             int val = head.data;
//             head  = tail= null ;
//             size--;
//             return val;


//         }
//         int val = head.data;
//         head = head.next;
//         head.prev = null;
//         size--;
//         return val;
//     }
//     public void reverse(){
//         Node curr = head;
//         Node prev = null;
//         Node next;
//         while(curr!=null){
//             next = curr.next;
//             curr.next = prev;
//             curr.prev =next;
//             prev = curr;
//             curr=next;
//         }
//         head = prev;
//     }

//     public static void main(String[] args) {
//         LinkedList dll = new LinkedList();
//         dll.addFirst(3);
//         dll.addFirst(4);
//         dll.addFirst(9);
//         dll.addFirst(0);
//         dll.addFirst(0);
//         dll.addFirst(0);
//         dll.addFirst(0);
//         dll.addFirst(0);
//         dll.print(); // to verify the addFirst method
//         dll.removeFirst();
//         dll.reverse();
//         dll.print();

//     }
// }
