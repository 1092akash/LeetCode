public class BinaryTree {
    Node root;
  BinaryTree()
  {
     root=null;  
  }
  void preorder(Node node)
  {
    if(node==null){
        return;
    }
    System.out.println(node.key);
    preorder(node.left);{
      
  }
    preorder(node.right);
  }
  void inorder(Node node)
  {
    if(node==null)
        return;
    inorder(node.left);
    System.out.println(node.key);
    inorder(node.right);
  }
  void postorder(Node node)
  {
    if(node==null)
        return;
    postorder(node.left);
    postorder(node.right);
    System.out.println(node.key);
   
  }
  public static void main(String []args)
  {
    BinaryTree te=new BinaryTree();
    te.root=new Node(1);
    te.root.left=new Node(2);
    te.root.right=new Node(3);
    te.root.left.left=new Node(5);
    te.root.left.right=new Node(6);
    System.out.println("preorder traverse =");
    te.preorder(te.root);
    System.out.println("inorder traverse =");
    te.inorder(te.root);
    System.out.println("postorder traverse =");
    te.postorder(te.root);
    te.postorder(null);
  }
    
}
class Node
{
    Node left;
    Node right;
    int key;
  public Node(int item)
  {
   key=item;
   left=right=null;
  }
}