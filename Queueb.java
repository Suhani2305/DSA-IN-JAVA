// /**
//  * Queueb
//  */
// public class Queueb {

//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;
//         Queue(int n){
//             arr= new int[n];
//             size=n;
//             rear =-1;
//             front =-1;
//         }
//         public static boolean isEmpty(){
//             return rear == -1 && front == -1;
//         }
//         public static boolean isFull(){
//             return (rear+1)% size == front ;
//         }

//         // add   o(1)
//         public static void add(int data){
//             // if(rear == size-1){
//             if (isFull()) {
//                 System.out.println("quere is full");
//                 return;
//             }
//             // rear = rear + 1;
//             // add first element
//             if(front==-1){
//                 front = 0;
//             }
//             rear = (rear+1)%size;
//             arr[rear]=data;
//         }
//         // remove   o(n)
//         public static int remove() {
//             if(isEmpty()){
//                 System.out.println("empty quere");
//                 return -1;
//             }
//             // int front = arr[0];
//             // for(int i=0;i<rear;i++){
//             //     arr[i]=arr[i+1];
                 
//             // }
//             // rear = rear - 1;
//             // return front;

            
// //         }
// //         // peek
// //         public static int peek(){
// //             if(isEmpty()){
// //                 System.out.println("empty quere");
// //                 return -1;
// //             }
// //             return arr[0];
// //         }
// //     }
// //     public static void main(String[] args) {
// //         Queue q = new Queue(5);
// //         q.add(1);
// //         q.add(2);
// //         q.add(3);
// //         q.add(4);

// //         while(!q.isEmpty()){
// //             System.out.println(q.peek());
// //             q.remove();
// //         }

        
// //     }
// // }




// count of nodes
