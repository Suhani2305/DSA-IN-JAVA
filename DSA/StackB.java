package DSA;
// import java.util.ArrayList; // Importing ArrayList from java.util package

// public class StackB {
//     static class Stack {
//         static ArrayList<Integer> list = new ArrayList<>(); // Initialize static ArrayList to store stack elements

//         public static boolean isEmpty() {
//             return list.size() == 0; // Check if the stack is empty
//         }

//         // push
//         public static void push(int data) {
//             list.add(data); // Add an element to the stack
//         }

//         // pop
//         public static int pop() {
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = list.get(list.size() - 1); // Get the top element of the stack
//             list.remove(list.size() - 1); // Remove the top element from the stack
//             return top; // Return the top element
//         }

//         // peek
//         public static int peek() {
//             return list.get(list.size() - 1); // Return the top element without removing it
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack(); // Create a new Stack object
//         s.push(1); // Push 1 onto the stack
//         s.push(2); // Push 2 onto the stack
//         s.push(3); // Push 3 onto the stack
//         while (!s.isEmpty()) { // Loop while the stack is not empty
//             System.out.println(s.peek()); // Print the top element of the stack
//             s.pop(); // Pop the top element from the stack
//         }
//     }
// }



// // stack using ll;
// /**
//  * StackB
//  */
// public class StackB {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Stack {
//         Node head = null; // Non-static head

//         public boolean isEmpty() {
//             return head == null;
//         }

//         // push
//         public void push(int data) {
//             Node newNode = new Node(data);
//             if (isEmpty()) {
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         // pop
//         public int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         // peek
//         public int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack(); // Create a new Stack object
//         s.push(1); // Push 1 onto the stack
//         s.push(2); // Push 2 onto the stack
//         s.push(3); // Push 3 onto the stack
//         while (!s.isEmpty()) { // Loop while the stack is not empty
//             System.out.println(s.peek()); // Print the top element of the stack
//             s.pop(); // Pop the top element from the stack
//         }
//     }
// }

// // stack using collections javaframe work

// import java.util.*;
// public class StackB {
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while (!s.isEmpty()) { // Loop while the stack is not empty
//             System.out.println(s.peek()); // Print the top element of the stack
//             s.pop(); // Pop the top element from the stack
//         }
//     }

    
// }



// // push at the bottom of the stack
// import java.util.*;
// /**
//  * StackB
//  */
// public class StackB {

//     public static void pushAtBottom(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void main(String args[]){
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         pushAtBottom(s, 4);
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
// ;
//     }
// }

// // reverse of a string
// import java.util.*;
// /**
//  * StackB
//  */
// public class StackB {
//     public static String reverseString(String str){
//         Stack<Character> s = new Stack<>();
//         int idx = 0;
//         while(idx<str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }
//         StringBuilder result = new StringBuilder();
//         while(!s.isEmpty()){
//             char curr= s.pop();
//             result.append(curr);
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String str ="abc";
//         String result = reverseString(str);
//         System.out.println(result);
        
//     }
// }



// // reverse of a stack 
// // o(n) with constant memory using recursion
// /**
//  * StackB
//  */
// import java.util.*;
// public class StackB {
//     public static void pushAtBottom(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void reverseStack(Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s,top);
//     }
//     public static void printStack(Stack<Integer> s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }

//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         printStack(s);
//         reverseStack(s);
//         printStack(s);

//     }
// }




// // stock span problem
// import java.util.*;
 
// public class StackB {
//     public static void stockSpan(int stocks[], int span[]){
//         Stack<Integer> s = new Stack<>();
//         span[0]=1;
//         s.push(0);
//     for(int i =1; i<stocks.length;i++){
//         int currPrice =stocks[i];
//         while(!s.isEmpty()&& currPrice>stocks[s.peek()]){
//             s.pop();
//         }
//         if(s.isEmpty()){
//             span[i]=i+1;
//         }else{
//             int prevHight = s.peek();
//             span[i]=i-prevHight;
//         }
//         s.push(i);

//     }   
//  }
//     public static void main(String[] args) {
//         int stocks[]={100, 80,  60, 70, 60, 85, 100};
//         int span[]= new int [stocks.length];
//         stockSpan(stocks, span);
//         for(int i=0; i<span.length;i++){
//             System.out.print(span[i]+" ");
//         }
//     }

    
// }


// import java.util.*;
// /**
//  * StackB
//  */
// public class StackB {

//     public static void main(String[] args) {
//         int arr[]={6,8,0,1,3};
//         Stack<Integer> s = new Stack<>();
//         int nxtGreater[]= new int[arr.length];
//         for(int i = arr.length-1;i>=0;i--){
//             // 1 while
//             while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
//                 s.pop();
//             }
//             // 2 if-else
//             if(s.isEmpty()){
//                 nxtGreater[i]=-1;
//             }else{
//                 nxtGreater[i]=arr[s.peek()];
//             }
//             // 3 push in s
//             s.push(i);
        
//         }
//         for(int i=0;i<nxtGreater.length;i++){
//             System.out.print(nxtGreater[i]+" ");
//         }
//         System.out.println();
//     }
//     // next greater right side m 
//     //  next greater left side m 
//     // next less left side m 
//     // next less right side m 
// }






// // Valid parantheses
// import java.util.*;
// /**
//  * StackB
//  */
// public class StackB {
//     public static boolean isValid(String str){
//         Stack<Character> s = new Stack<>();
//         for(int i =0; i<str.length();i++){
//             char ch = str.charAt(i);
//             if(ch=='(' || ch=='{'||ch=='['){
//                 s.push(ch);
//             }else{
//                 // closing
//                 if(s.isEmpty()){
//                     return false;
//                 }
//                 if((s.peek()=='(' && ch==')' ) || 
//                 (s.peek()=='{' && ch=='}' )||
//                 (s.peek()=='[' && ch==']' )
//                 ) {
//                     s.pop();
//                 }else{
//                     return false;
//                 }
//             }
//         }
//         if(s.isEmpty()){
//             return true;
//         }else{
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         String str ="{{[()]{[}}}";
//         System.out.println(isValid(str));
        
//     }
// }



// // duplicate parantheses

// import java.util.*;
// /**
//  * StackB
//  */
// public class StackB {
//     public static boolean isDuplicate(String str){
//         Stack<Character> s = new Stack<>();
//         for(int i =0; i<str.length();i++){
//             char ch = str.charAt(i);
//             // closing
//             if(ch==')'){
//                 int count = 0;
//                 while( s.peek()!='('){
//                     s.pop();
//                     count++;
//                 }
//                 if(count<1){
//                     return true;    //duplicate
//                 }else{
//                     s.pop();    //openning pair
//                 }
//             }else{
//                 // opening
//                 s.push(ch);
//             }
             
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         String str = "((a+b))";
//         String str2 = "(a-b)";
//         System.out.println(isDuplicate(str2));
//         System.out.println(isDuplicate(str));
        
//     }
// }



// // Max rectangular area in histogram
// /**
//  * StackB
//  */
// import java.util.*;
// public class StackB {
//     public static void maxArea(int arr[]){
//         int maxArea =0;
//         int nsr[]=new int[arr.length];
//         int nsl[]=new int[arr.length];
    
//     // next smaller right
//         Stack<Integer> s = new Stack<>();
//         for(int i = arr.length-1;i>=0;i--){
//             // 1 while
//             while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
//                 s.pop();
//             }
//             // 2 if-else
//             if(s.isEmpty()){
//                 nsr[i]=arr.length;
//             }else{
//                 nsr[i]=s.peek();
//             }
//             // 3 push in s
//             s.push(i);
        
//         }
//     // next smaller left
//         s = new Stack<>();
//         for(int i=0; i<arr.length;i++){
//             // 1 while
//             while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
//                 s.pop();
//             }
//             // 2 if-else
//             if(s.isEmpty()){
//                 nsl[i]=arr.length;
//             }else{
//                 nsl[i]=s.peek();
//             }
//             // 3 push in s
//             s.push(i);
        
//         }
//     // current area: width = j-i-1 = nsr[i]-nsl[j]-1
//         for(int i=0;i<arr.length;i++){
//             int height = arr[i];
//             int width = nsr[i]-nsl[i]-1;
//             int currArea = height*width;
//             maxArea = Math.max(currArea, maxArea);
//         }
//         System.out.println("Max area in histogram = " + maxArea);

//     }
     
//     public static void main(String[] args) {
//         int arr[]={2,1,5,6,2,3};
//         // int arr[]={2,4};
//         maxArea(arr);

//     }
// }