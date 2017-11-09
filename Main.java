
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

    
    System.out.println("Root Node" + tree.root.getData());
    System.out.println("Root left" + tree.root.getLeftChild().getData() );
    System.out.println("Root right" + tree.root.getRightChild().getData());
    
    //print in order traversal
    AVLTree.inOrder(tree);
    
  }
}
