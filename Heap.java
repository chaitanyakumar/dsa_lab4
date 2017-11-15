
public class Heap implements MyHeap {

  private Node[] heapArr;
  private int maxSize; // size of array
  private int currSize; // number of nodes in array
  Node root;

  public Heap(int max) {
    heapArr = new Node[maxSize];
    maxSize = max;
    currSize = 0;
    root = null;
  }

  @SuppressWarnings("rawtypes")
  @Override
  public Node makeHeap(Comparable value) {

    return null;
  }

  @Override
  public boolean isEmpty() {
    if (currSize == 0) {
      return true;
    } else
      return false;
  }

  @Override
  public boolean deleteMin() {
    Node min = (Node) findMin();
    boolean deleted = delete(min);
    if (deleted == true)
      return true;
    else
      return false;
  }

  @SuppressWarnings("rawtypes")
  @Override
  public boolean decreaseKey(Node key, Comparable updateValue) {

    return false;
  }

  @Override
  public boolean delete(Node del) {
    if (heapArr[currSize] == del)
      heapArr[currSize] = null;

    // decreaseKey(del, null);
    currSize--; // if deleted size gets smaller

    return false;
  }

  @Override
  public boolean union(MyHeap heap) {
    // TODO Auto-generated method stub
    return false;
  }

  @SuppressWarnings("rawtypes")
  @Override
  public Comparable findMin() {
    return (Comparable) heapArr[1];
  }

  @SuppressWarnings("rawtypes")
  @Override
  public boolean insert(Comparable value) {
    if (currSize == maxSize) // if heap is full
      return false;

    heapArr[currSize] = (Node) value;
    // adjust heap

    return true;
  }

}
