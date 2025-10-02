
 class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}

public class BST {


    static Node insert(Node root, int data){
        Node NodeData = new Node(data);

        if(root == null){
            return NodeData;
        }

        Node parent = null;
        Node curr = root;

        while(curr != null){
            parent = curr;

            if (curr.val > data){
                curr = curr.left;
            }else if(curr.val < data){
                curr = curr.right;
            }else{
                return root;
            }
        }

        if(parent.val > data){
            parent.left =  NodeData;
        }else{
            parent.right = NodeData;
        }

        return root;
    }

   static void inorder(Node root){
        if (root != null){
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    static void preorder(Node root){
        if (root != null){
            System.out.print(root.val + " ");
            inorder(root.right);
            inorder(root.left);

        }
    }

    static void postorder(Node root){
        if (root != null){

            inorder(root.right);
            inorder(root.left);
            System.out.print(root.val + " ");

        }
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        inorder(root);
        System.out.println();
        preorder(root);

    }
}
