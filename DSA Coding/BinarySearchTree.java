class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    // Insert a new value into the BST
    Node insert(Node root, int value) {
        // Base case: if tree is empty, create a new node
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // If value is smaller, go left
        if (value < root.data)
            root.left = insert(root.left, value);

        // If value is larger, go right
        else if (value > root.data)
            root.right = insert(root.right, value);

        // If equal, ignore duplicates (optional)
        return root;
    }

    // Search for a value in the BST
    boolean search(Node root, int key) {
        // Base case: root is null (empty tree or reached leaf)
        if (root == null)
            return false;

        // If the key matches the root node's data
        if (root.data == key)
            return true;

        // If key is smaller, search left
        if (key < root.data)
            return search(root.left, key);

        // If key is greater, search right
        return search(root.right, key);
    }

    // Inorder traversal (for checking)
    void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Main method for testing
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        System.out.print("Inorder traversal (sorted): ");
        bst.inorder(bst.root);
        System.out.println();

        // Search test
        int key = 40;
        if (bst.search(bst.root, key))
            System.out.println(key + " found in the tree");
        else
            System.out.println(key + " not found in the tree");
    }
}



