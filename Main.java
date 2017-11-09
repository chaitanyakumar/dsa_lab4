
public class Main {

  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub

    AVLTree tree = new AVLTree();
    
    /* Constructing tree given in the above figure */
    System.out.println("1st node");
    tree = AVLTree.insert(tree, new Node(20));
    System.out.println("2nd node");
    tree = AVLTree.insert(tree, new Node(10));
    System.out.println("3rd node");
    tree = AVLTree.insert(tree, new Node(30));

    
    System.out.println("Root Node" + tree.root.data + " , height " + tree.root.height);
    System.out.println("Root left" + tree.root.left.data + " , height " + tree.root.left.height);
    System.out.println("Root right" + tree.root.right.data + " , height " + tree.root.right.height);
    
    //print in order traversal
    AVLTree.inOrder(tree);
    
  }
}
