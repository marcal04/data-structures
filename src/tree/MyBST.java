package tree;

public class MyBST {
    private TreeNode root;

    public MyBST() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.value) {
            node.left = insertRec(node.left, value);
        } else {
            node.right = insertRec(node.right, value);
        }
        return node;

    }

    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(TreeNode node, int value) {
        if (node == null) {
            return false; // FALSO
        }
        if (value == node.value) {
            return true; // VERDADEIRO
        }
        if (value < node.value) {
            return searchRec(node.left, value);
        } else {
            return searchRec(node.right, value);
        }
    }

    public static void main(String[] args) {
        MyBST tree = new MyBST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        System.out.println(tree.search(30)); // true
        System.out.println(tree.search(40)); // true
        System.out.println(tree.search(99)); // false
    }


}
