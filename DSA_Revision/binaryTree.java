import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Node class for the Binary Tree
// class TreeNode {
//     int val;
//     TreeNode left, right;

//     TreeNode(int val) {
//         this.val = val;
//         this.left = null;
//         this.right = null;
//     }
// }

// // Binary Tree class
// class binaryTree {
//     TreeNode root;

//     // Level-wise insertion (not BST)
//     public void insert(int val) {
//         TreeNode newNode = new TreeNode(val);

//         if (root == null) {
//             root = newNode;
//             return;
//         }

//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);

//         while (!queue.isEmpty()) {
//             TreeNode current = queue.poll();

//             if (current.left == null) {
//                 current.left = newNode;
//                 return;
//             } else {
//                 queue.offer(current.left);
//             }

//             if (current.right == null) {
//                 current.right = newNode;
//                 return;
//             } else {
//                 queue.offer(current.right);
//             }
//         }
//     }

//     // Level Order Traversal
//     public void levelOrderTraversal() {
//         if (root == null) return;

//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);

//         System.out.print("Level Order: ");
//         while (!queue.isEmpty()) {
//             TreeNode current = queue.poll();
//             System.out.print(current.val + " ");

//             if (current.left != null) queue.offer(current.left);
//             if (current.right != null) queue.offer(current.right);
//         }
//         System.out.println();
//     }

//     // In-order Traversal (Left, Root, Right)
//     public void inOrder(TreeNode node) {
//         if (node == null) return;
//         inOrder(node.left);
//         System.out.print(node.val + " ");
//         inOrder(node.right);
//     }

//     // Pre-order Traversal (Root, Left, Right)
//     public void preOrder(TreeNode node) {
//         if (node == null) return;
//         System.out.print(node.val + " ");
//         preOrder(node.left);
//         preOrder(node.right);
//     }

//     // Post-order Traversal (Left, Right, Root)
//     public void postOrder(TreeNode node) {
//         if (node == null) return;
//         postOrder(node.left);
//         postOrder(node.right);
//         System.out.print(node.val + " ");
//     }

//     // Iterative Pre-order
//     public void iterativePreOrder() {
//         if (root == null) return;

//         Stack<TreeNode> stack = new Stack<>();
//         stack.push(root);

//         System.out.print("Iterative Pre-order: ");
//         while (!stack.isEmpty()) {
//             TreeNode current = stack.pop();
//             System.out.print(current.val + " ");

//             if (current.right != null) stack.push(current.right);
//             if (current.left != null) stack.push(current.left);
//         }
//         System.out.println();
//     }

//     // Iterative In-order
//     public void iterativeInOrder() {
//         if (root == null) return;

//         Stack<TreeNode> stack = new Stack<>();
//         TreeNode current = root;

//         System.out.print("Iterative In-order: ");
//         while (current != null || !stack.isEmpty()) {
//             while (current != null) {
//                 stack.push(current);
//                 current = current.left;
//             }
//             current = stack.pop();
//             System.out.print(current.val + " ");
//             current = current.right;
//         }
//         System.out.println();
//     }

//     // Iterative Post-order (using two stacks)
//     public void iterativePostOrder() {
//         if (root == null) return;

//         Stack<TreeNode> stack = new Stack<>();
//         Stack<Integer> output = new Stack<>();
//         stack.push(root);

//         while (!stack.isEmpty()) {
//             TreeNode current = stack.pop();
//             output.push(current.val);

//             if (current.left != null) stack.push(current.left);
//             if (current.right != null) stack.push(current.right);
//         }

//         System.out.print("Iterative Post-order: ");
//         while (!output.isEmpty()) {
//             System.out.print(output.pop() + " ");
//         }
//         System.out.println();
//     }

//     // Iterative Post-order (One Stack)
//     public void iterativePostOrderOneStack() {
//         if (root == null) return;

//         Stack<TreeNode> stack = new Stack<>();
//         TreeNode current = root;
//         TreeNode lastVisited = null;

//         System.out.print("Iterative Post-order (One Stack): ");
//         while (!stack.isEmpty() || current != null) {
//             if (current != null) {
//                 stack.push(current);
//                 current = current.left;
//             } else {
//                 TreeNode peekNode = stack.peek();
//                 if (peekNode.right != null && lastVisited != peekNode.right) {
//                     current = peekNode.right;
//                 } else {
//                     System.out.print(peekNode.val + " ");
//                     lastVisited = stack.pop();
//                 }
//             }
//         }
//         System.out.println();
//     }

//     // Height of tree
//     public int height(TreeNode root) {
//         if (root == null) return 0;

//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);

//         return Math.max(leftHeight, rightHeight) + 1;
//     }

//     // Main method
//     public static void main(String[] args) {
//         binaryTree bt = new binaryTree();

//         bt.insert(1);
//         bt.insert(2);
//         bt.insert(3);
//         bt.insert(4);
//         bt.insert(5);
//         bt.insert(6);

//         bt.levelOrderTraversal();

//         System.out.print("In-order: ");
//         bt.inOrder(bt.root);
//         System.out.println();

//         System.out.print("Pre-order: ");
//         bt.preOrder(bt.root);
//         System.out.println();

//         System.out.print("Post-order: ");
//         bt.postOrder(bt.root);
//         System.out.println();

//         bt.iterativePreOrder();
//         bt.iterativeInOrder();
//         bt.iterativePostOrder();
//         bt.iterativePostOrderOneStack();

//         System.out.println("Height of the tree: " + bt.height(bt.root));
//     }
// }

// import java.util.*;

// class TreeNode {
//     int val;
//     TreeNode left, right;
    
//     TreeNode(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }

//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

// public class binaryTree {

//     boolean isLeaf(TreeNode node) {
//         return node.left == null && node.right == null;
//     }

//     void addLeft(TreeNode node, List<Integer> list) {
//         TreeNode current = node.left;
//         while (current != null) {
//             if (!isLeaf(current)) {
//                 list.add(current.val);
//             }
//             if (current.left != null) {
//                 current = current.left;
//             } else {
//                 current = current.right;
//             }
//         }
//     }

//     void addRight(TreeNode root, List<Integer> list) {
//         TreeNode current = root.right;
//         List<Integer> temp = new LinkedList<>();
//         while (current != null) {
//             if (!isLeaf(current)) {
//                 temp.add(current.val);
//             }
//             if (current.right != null) {
//                 current = current.right;
//             } else {
//                 current = current.left;
//             }
//         }
//         for (int i = temp.size() - 1; i >= 0; i--) {
//             list.add(temp.get(i));
//         }
//     }

//     void addLeaves(TreeNode node, List<Integer> list) {
//         if (node == null) return;
//         if (isLeaf(node)) {
//             list.add(node.val);
//             return;
//         }
//         addLeaves(node.left, list);
//         addLeaves(node.right, list);
//     }

//     List<Integer> printBoundary(TreeNode root) {
//         List<Integer> list = new LinkedList<>();
//         if (root == null) return list;

//         if (!isLeaf(root)) {
//             list.add(root.val);
//         }

//         addLeft(root, list);
//         addLeaves(root, list);
//         addRight(root, list);

//         return list;
//     }

//     void printBoundaryTraversal(TreeNode root) {
//         List<Integer> boundary = printBoundary(root);
//         for (int val : boundary) {
//             System.out.print(val + " ");
//         }
//         System.out.println();
//     }

//     // Example usage
//     public static void main(String[] args) {
//         binaryTree bt = new binaryTree();
        
//         /*
//                1
//               / \
//              2   3
//             / \   \
//            4   5   6
//               / \   
//              7   8 
//         */
        
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.left.right = new TreeNode(5);
//         root.left.right.left = new TreeNode(7);
//         root.left.right.right = new TreeNode(8);
//         root.right.right = new TreeNode(6);

//         bt.printBoundaryTraversal(root);  // Output: 1 2 4 7 8 6 3
//     }
// }

//vertical order traversal of binary tree

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class binaryTree {

    static class Pair {
        TreeNode node;
        int col;
        Pair(TreeNode node, int col) {
            this.node = node;
            this.col = col;
        }
    }

    public static List<List<Integer>> vertical(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));
        int minCol = 0, maxCol = 0;

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            TreeNode node = pair.node;
            int col = pair.col;

            map.computeIfAbsent(col, k -> new ArrayList<>()).add(node.val);

            if (node.left != null) {
                queue.offer(new Pair(node.left, col - 1));
                minCol = Math.min(minCol, col - 1);
            }
            if (node.right != null) {
                queue.offer(new Pair(node.right, col + 1));
                maxCol = Math.max(maxCol, col + 1);
            }
        }

        for (int i = minCol; i <= maxCol; i++) {
            result.add(map.get(i));
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */
        TreeNode root = new TreeNode(1,
                            new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                            new TreeNode(3, new TreeNode(6), new TreeNode(7)));

        List<List<Integer>> verticalOrder = vertical(root);
        for (List<Integer> level : verticalOrder) {
            System.out.println(level);
        }
    }
}