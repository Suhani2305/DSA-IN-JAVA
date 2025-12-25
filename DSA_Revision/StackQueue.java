// class Stack {
//     int top = -1;
//     int[] arr = new int[1000];

//     void push(int x) { 
//         arr[++top] = x;
//         System.out.println("Pushed: " + x);
//     }

//     int pop() {
//         if (top == -1) {
//             System.out.println("StackUnderFlow");
//             return -1;
//         } else {
//             int x = arr[top--];
//             System.out.println("Popped: " + x);
//             return x;
//         }
//     }

//     int peek() {
//         if (top == -1) {
//             System.out.println("Stack is empty");
//             return -1;
//         } else {
//             return arr[top];
//         }
//     }

//     boolean isEmpty() {
//         return top == -1;
//     }

//     void size() {
//         System.out.println("Size of stack: " + (top + 1));
//     }
// }

// class Queue {
//     int front = -1;
//     int rear = -1;
//     int[] arr = new int[1000];

//     void enqueue(int x) {
//         if (rear == 999) {
//             System.out.println("Queue is full");
//         } else {
//             if (front == -1) front = 0;
//             arr[++rear] = x;
//             System.out.println("Enqueued: " + x);
//         }
//     }

//     int dequeue() {
//         if (front == -1 || front > rear) {
//             System.out.println("QueueUnderFlow");
//             return -1;
//         } else {
//             int x = arr[front++];
//             System.out.println("Dequeued: " + x);
//             return x;
//         }
//     }

//     int peek() {
//         if (front == -1 || front > rear) {
//             System.out.println("Queue is empty");
//             return -1;
//         } else {
//             return arr[front];
//         }
//     }

//     boolean isEmpty() {
//         return front == -1 || front > rear;
//     }

//     void size() {
//         if (isEmpty()) {
//             System.out.println("Size of queue: 0");
//         } else {
//             System.out.println("Size of queue: " + (rear - front + 1));
//         }
//     }
// }

// public class StackQueue {
//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.size();
//         System.out.println("Top element: " + s.peek());
//         s.pop();
//         s.size();
//         s.pop();
//         s.pop();
//         s.pop(); // This will show StackUnderFlow
//         s.size();
//         System.out.println("Is stack empty? " + s.isEmpty());
//         s.push(40);
//         System.out.println("Top element: " + s.peek());
//         s.size();

//         // Additional test cases
//         s.push(50);
//         s.push(60);
//         System.out.println("Top element after pushing 50 and 60: " + s.peek());
//         s.pop();
//         s.pop();
//         System.out.println("Is stack empty after popping? " + s.isEmpty());

//         Queue q = new Queue();
//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         q.size();
//         System.out.println("Front element: " + q.peek());
//         q.dequeue();
//         q.size();
//         q.dequeue();
//         q.dequeue();
//         q.dequeue(); // This will show QueueUnderFlow
//         q.size();
//         System.out.println("Is queue empty? " + q.isEmpty());
//         q.enqueue(40);
//         System.out.println("Front element after enqueueing 40: " + q.peek());
//         q.size();
//         // Additional test cases
//         q.enqueue(50);
//         q.enqueue(60);
//         System.out.println("Front element after enqueueing 50 and 60: " + q.peek());
//         q.dequeue();
//         q.dequeue();
//         System.out.println("Is queue empty after dequeuing? " + q.isEmpty());
//         q.size();
//         q.enqueue(70);
//         System.out.println("Front element after enqueueing 70: " + q.peek());
//         q.size();
//         q.dequeue();
//     }
// }


import java.util.Stack;

class StackQueue {
    // infix to postfix conversion
    public static String infixToPostfix(String exp) {
        StringBuffer result = new StringBuffer();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the scanned character is an '(', push it to the stack.
            else if (c == '(') {
                stack.push(c);
            }
            // If the scanned character is a ')', pop until '('
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop(); // Pop '('
            }
            // If operator
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c); // ✅ Correct placement
            }
        }

        // Pop all remaining operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }


    // infix to prefix conversion
    public static String infixToPrefix(String exp){
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        // Reverse the infix expression
        StringBuilder reversedExp = new StringBuilder(exp).reverse();
        for(int i =0;i<reversedExp.length();i++){
            char c = reversedExp.charAt(i);
            // If the scanned character is an operand, add it to output.
            if(Character.isLetterOrDigit(c)){
                ans.append(c);
            }
            // If the scanned character is an '(', push it to the stack.
            else if(c == ')'){
                stack.push(c);
            }
            // If the scanned character is a ')', pop until '('
            else if(c == '('){
                while(!stack.isEmpty() && stack.peek() != ')'){
                    ans.append(stack.pop());
                }
                if(!stack.isEmpty()) stack.pop(); // Pop ')'
            }
            // If operator
            else {
                while(!stack.isEmpty() && precedence(c) < precedence(stack.peek())){
                    ans.append(stack.pop());
                }
                stack.push(c); // ✅ Correct placement
            }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }

    // prefix to infix conversion
    public static String prefixToInfix(String exp) {
        Stack<String> stack = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    // postfix to infix conversion
    public static String postfixToInfix(String exp) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    // prefix to postfix conversion
    public static String prefixToPostfix(String exp) {
        Stack<String> stack = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = op1 + op2 + c;
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    // postfix to prefix conversion
    public static String postfixToPrefix(String exp) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String temp = c + op1 + op2;
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    // precedence function
    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix Expression: " + exp);
        String postfix = infixToPostfix(exp);
        System.out.println("Postfix Expression: " + postfix);
        String prefix = infixToPrefix(exp);
        System.out.println("Prefix Expression: " + prefix);
    }
}
