@SuppressWarnings("rawtypes")
public class Node{
  
  Comparable data;
  int height;
  
  Node(Object value)
  {
    data = (Comparable) value;    
  }
  
  Node left;
  Node right;
}
