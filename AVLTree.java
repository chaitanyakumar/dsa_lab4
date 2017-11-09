
public class AVLTree {
  Node root;

  // A utility function to get height of the tree
  int height(Node N) {
      if (N == null)
          return 0;

      return N.getHeight();
  }
  
  static AVLTree insert(AVLTree sourceTree, Node newNode) throws Exception {
    AVLTree newTree = sourceTree;

    // make sure new Node has no default values other than data
    if (newNode == null) {
      throw new Exception("Node must be a valid object with data");
    }

    if (sourceTree.root == null) {
      newTree.root = newNode;
      
      return newTree;
    }

    // start comparison
    sourceTree.insertNode(sourceTree.root, newNode);

    return newTree;
  }

  @SuppressWarnings("unchecked")
  Node insertNode(Node node, Node newNode) {
    
    if (node == null)
      return (new Node(newNode.getData()));
      
    // if current is greater than input then send to left
    if (node.getData().compareTo(newNode.getData()) > 0)
      node.setLeftChild(insertNode(node.getLeftChild(), newNode));
    else
      node.setRightChild(insertNode(node.getRightChild(), newNode));

    return node;
  }

  static void inOrder(AVLTree tree) throws Exception {
    if (tree.root == null)
      throw new Exception("AVL tree is empty");

    tree.inOrderTraverse(tree.root);

  }

  void inOrderTraverse(Node node) {
    if (node != null) {
      inOrderTraverse(node.getLeftChild());
      System.out.print(node.getData() + " ");
      inOrderTraverse(node.getRightChild());
    }
  }
}
