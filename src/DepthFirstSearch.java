/**
 * This class searches through the tree 
 * and prints out the nodes 
 * @author Jake Holovka
 *
 */
public class DepthFirstSearch {
    Node root;
    /**
     * Empty argument constructor
     * that prints out that the class
     * was called
     */
    public DepthFirstSearch()
    {               
        System.out.println("Call DFS with root node to do a Depth First Search.");
    }
    /**
     * This method iterates through the tree
     * printing out nodes and until it reaches
     * the leaf
     * @param node
     */
     public void DFS(Node node)        {
                System.out.println(node.getData()); 
               
                if (node.getlChild()== null || node.getrChild() == null) {
                	return;
                }
                else {
                DFS(node.getlChild());
                DFS(node.getrChild());
                }

     }//end DFS

}//end class
