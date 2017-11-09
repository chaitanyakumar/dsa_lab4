
public class AVLTree {
  Node root;

  static AVLTree insert(AVLTree sourceTree, Node newNode) throws Exception {
    AVLTree newTree = sourceTree;

    // make sure new Node has no default values other than data
    if (newNode == null) {
      throw new Exception("Node must be a valid object with data");
    }

    if (sourceTree.root == null) {
      newNode.height = 0;
      newNode.left = null;
      newNode.right = null;
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
      return (new Node(newNode.data));
      
    // if current is greater than input then send to left
    if (node.data.compareTo(newNode.data) > 0)
      node.left = insertNode(node.left, newNode);
    else
      node.right = insertNode(node.right, newNode);

    // increase height
    node.height += 1;

    return node;
  }

  static void inOrder(AVLTree tree) throws Exception {
    if (tree.root == null)
      throw new Exception("AVL tree is empty");

    tree.inOrderTraverse(tree.root);

  }

  void inOrderTraverse(Node node) {
    if (node != null) {
      inOrderTraverse(node.left);
      System.out.print(node.data + " ");
      inOrderTraverse(node.right);
    }
  }
}
