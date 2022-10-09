/**
 * This class creates and tests a tree
 *  with nodes and searches through it
 * @author Jake Holovka
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root);
		
		System.out.println("Height of Tree " +aTree.getHeight());
		System.out.println("Number of Nodes "+ aTree.getNumberOfNodes());
	}//end main
	
}//end class

