/**
 * This class creates a nodes and 
 * lets you set and retrieve their data
 * @author Jake Holovka
 *
 */
public class Node {
	private int data;
	private Node lChild;
	private Node rChild;
	/**
	 * Preferred argument constructor 
	 * @param data
	 */
	public Node(int data)
	{
		lChild=null;
		rChild=null;
		this.data=data;
	}//end preferred argument constructor
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}//end getData
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}//end setData
	/**
	 * @return the lChild
	 */
	public Node getlChild() {
		return lChild;
	}//end getlChild
	/**
	 * @param lChild the lChild to set
	 */
	public void setlChild(Node lChild) {
		this.lChild = lChild;
	}//end setlChild
	/**
	 * @return the rChild
	 */
	public Node getrChild() {
		return rChild;
	}//end getrChild
	/**
	 * @param rChild the rChild to set
	 */
	public void setrChild(Node rChild) {
		this.rChild = rChild;
	}//end setrChild
	/**
	 * This method calls the private
	 * getHeight method to get the height
	 * of the nodes
	 * @return
	 */
	public int getHeight() {
	 return getHeight(this);
	}//end getHeight
	/**
	 * This method finds the height of the
	 * tree by finding which child side is 
	 * the longest
	 * @param node
	 * @return
	 */
	private int getHeight (Node node) {
		int height = 0;
		if (node != null)
			height = 1 + Math.max(getHeight(node.getrChild()),
								  getHeight(node.getlChild()));
		return height;					
	}//end getHeight
	/**
	 * Counts the number of nodes in the tree
	 * by counting each child branch and 
	 * adding them together
	 * @return
	 */
	public int getNumberOfNodes() {
		int leftNumber = 0;
		int rightNumber =0;
		if (lChild != null) {
			leftNumber = lChild.getNumberOfNodes();
		}
		if (rChild != null)
			rightNumber = rChild.getNumberOfNodes();
		
		return 1+ leftNumber + rightNumber;
	}//end getNumberOfNodes
	
}//end class

