
import java.util.ArrayList;
import java.util.List;



public class Tree {
    TreeNode root;

    Tree(int rootData){
        root = new TreeNode(rootData);
    }

    class TreeNode{
        int data;
        List<Tree> children;
        TreeNode(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }

       public void addchild(TreeNode child){
           // children.add(child);
        }


    }

    void printTree(TreeNode node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        for (Tree child : node.children) {
          //  printTree(child);
        }
    }
    public static void main(String[] args) {
        Tree tree = new Tree(1);
//        TreeNode child1 = new TreeNode(2);
//        TreeNode child2 = new TreeNode(3);
//        tree.root.addChild(child1);
//        tree.root.addChild(child2);
//
//        child1.addChild(new TreeNode(4));
//        child1.addChild(new TreeNode(5));
//        child2.addChild(new TreeNode(6));

        System.out.println("Tree traversal (Preorder):");
    }
}
