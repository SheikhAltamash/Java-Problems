import java.util.*;
import java.util.LinkedList;

public class Traversal {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node BuildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }

        public void Preorder(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }

        public void Inorder(Node root) {
            if (root == null) {
                return;
            }
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }

        public void Postorder(Node root) {
            if (root == null) {
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data + " ");
        }

        public void LevelOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println();
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node n = q.remove();
                if (n == null) {
                    System.out.println();
                    if (q.isEmpty())
                        break;
                    else {
                        q.add(null);
                    }
                } else {
                    System.out.print(n.data + " ");

                    if (n.left != null) {
                        q.add(n.left);
                    }
                    if (n.right != null) {
                        q.add(n.right);
                    }
                }
            }

        }

        public int Height(Node root) {
            if (root == null) {
                return 0;
            }
            return Math.max(Height(root.left), Height(root.right)) + 1;
        }

        public int count(Node root) {
            if (root == null) {
                return 0;
            }
            return count(root.left) + count(root.right) + 1;
        }

        public int sum(Node root) {
            if (root == null) {
                return 0;
            }

            return sum(root.left) + sum(root.right) + root.data;
        }

        public int Diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int leftDiam = Diameter(root.left);
            int rightDiam = Diameter(root.right);
            int rightht = Height(root.right);
            int leftht = Height(root.left);
            int selfht = leftht + rightht + 1;
            return Math.max(selfht, Math.max(rightDiam, leftDiam));
        }

        // Second Approach of finding Diameter of the binary tree

        static class Info {
            int diameter;
            int height;

            Info(int diameter, int height) {
                this.height = height;
                this.diameter = diameter;
            }
        }

        public Info Diameter2(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftInfo = Diameter2(root.left);
            Info rightInfo = Diameter2(root.right);
            int diameter = Math.max(leftInfo.height + rightInfo.height + 1,
                    Math.max(leftInfo.diameter, rightInfo.diameter));
            int height = Math.max(leftInfo.height, rightInfo.height) + 1;

            return new Info(diameter, height);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(root.data);
        tree.Preorder(root);
        System.out.println();
        tree.Inorder(root);
        System.out.println();
        tree.Postorder(root);
        tree.LevelOrder(root);
        System.out.println(tree.Height(root));
        System.out.println(tree.count(root));
        System.out.println(tree.sum(root));
        System.out.println(tree.Diameter(root));
        System.out.println(tree.Diameter2(root).diameter);

        // Checking if the sub tree exist in the tree
        // int nodesSubtree[]={}
    }
}
