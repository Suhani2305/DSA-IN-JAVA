class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class bst {
    void insert(Node root, int data) {
        if (data < root.data) {
            if (root.left == null) {
                root.left = new Node(data);
            } else {
                insert(root.left, data);
            }
        } else {
            if (root.right == null) {
                root.right = new Node(data);
            } else {
                insert(root.right, data);
            }
        }
    }

    boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        } else if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    //delete function can be added here if needed
    Node delete(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            Node temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    //print in rangee
    void printInRange(Node root, int low, int high) {
        if (root == null) {
            return;
        }
        if (root.data > low) {
            printInRange(root.left, low, high);
        }
        if (root.data >= low && root.data <= high) {
            System.out.print(root.data + " ");
        }
        if (root.data < high) {
            printInRange(root.right, low, high);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        bst tree = new bst();
        tree.insert(root, 5);
        tree.insert(root, 15);
        tree.insert(root, 3);
        tree.insert(root, 7);
        tree.insert(root, 12);
        tree.insert(root, 18);

        System.out.println("Inorder traversal of the BST:");
        tree.inorder(root);
        System.out.println();

        int searchValue = 17;
        if (tree.search(root, searchValue)) {
            System.out.println(searchValue + " is found in the BST.");
        } else {
            System.out.println(searchValue + " is not found in the BST.");
        }
        int deleteValue = 1;
        root = tree.delete(root, deleteValue);
        System.out.println("Inorder traversal after deleting " + deleteValue + ":");
        tree.inorder(root);
        System.out.println();
        int low = 10, high = 15;
        System.out.println("Values in the range [" + low + ", " + high + "]:");
        tree.printInRange(root, low, high);
        System.out.println();
    }

}
