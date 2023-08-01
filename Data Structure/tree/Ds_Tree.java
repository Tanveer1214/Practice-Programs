package com.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int key) {
        data = key;
        left = right = null;
    }
}

public class Ds_Tree {
    Node root;

    public Ds_Tree() {
        root = null;
    }


    public void bstNode(int data) {
        Node newNode = new Node(data);
        if(root == null) {
            root = newNode;
            return;
        }
        Node temp = root;
        while (temp.right != newNode || temp.left != newNode) {
            // this condition will check for left.
            if(newNode.data < temp.data) {
                if(temp.left == null) {
                    temp.left = newNode;
                    break;
                }
                else {
                    temp = temp.left;
                }
            }
            // this condition will check for right.
            if(newNode.data > temp.data) {
                if(temp.right == null) {
                    temp.right = newNode;
                    break;
                }
                else {
                    temp = temp.right;
                }
            }

        }
    }

    public Node searchValue(Node root, int data) {
        if(root == null || root.data == data) {
            return root;
        }
        if(root.data < data) {
            return searchValue(root.right,data); // it will not check below lines because return keyword
        }
        return searchValue(root.left,data);
    }

    public void Search(Node root, int data) {
        Node node = searchValue(root,data);
        if(node == null) {
            System.out.println("\nValue not found");
        }
        else {
            System.out.println("\n"+node.data+" Value found in Tree");
        }
    }

    public Node deleteNode(Node root, int data) {
        if(root == null) {
            return null;
        }
        if(data < root.data) {
            root.left = deleteNode(root.left,data);
        }
        else if(data > root.data) {
            root.right = deleteNode(root.right,data);
        }
        else {
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteNode(root.right,data);
        }
        return root;
    }
    int minValue(Node root) { // this function is part of deleteNode function to find minimum value.
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            if(temp == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(temp.data +" ");
                if(temp.left != null) {
                    q.add(temp.left);
                }
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int left = countOfNodes(root.left);
        int right = countOfNodes(root.right);
        return left + right + 1;
    }

    public int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int ls = sumOfNodes(root.left);
        int rs = sumOfNodes(root.right);
        return ls + rs + root.data;
    }

    public int countLeafNodes(Node root, int n) {
        if(root.left == null && root.right == null) {
            return n+1;
        }
        assert root.left != null;
        n = countLeafNodes(root.left,n);
        n = countLeafNodes(root.right,n);
        return n;
    }

    public int height(Node root) {
        if(root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right) + 1;
    }

    public boolean isIdentical(Node r1, Node r2) {
        if(r1 == null && r2 == null) {
            return true;
        }
        return (r1 != null && r2 != null) && (r1.data == r2.data) &&
                isIdentical(r1.left, r2.left) &&
                isIdentical(r1.right, r2.right);
    }

    public static void main(String[] args) {
        Ds_Tree tree = new Ds_Tree();
        tree.bstNode(15);
        tree.bstNode(10);
        tree.bstNode(5);
        tree.bstNode(11);

        tree.bstNode(20);
        tree.bstNode(25);
        tree.bstNode(18);

        System.out.println("Nodes in Tree "+tree.countOfNodes(tree.root));
        System.out.println("Leaf Nodes in Tree "+tree.countLeafNodes(tree.root,0));
        System.out.println("Sum of Tree "+tree.sumOfNodes(tree.root));
        System.out.println("Height of Tree is "+tree.height(tree.root));
        System.out.println(tree.isIdentical(tree.root,tree.root));
        tree.Search(tree.root,18);
        tree.deleteNode(tree.root,18);
        tree.levelOrder(tree.root);
    }
}