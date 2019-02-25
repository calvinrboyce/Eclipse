
public class BST {
		BstNode rootNode;
		
		public BST(int i) {
			rootNode = new BstNode(i);
		}
		
		public void addNode(int i) {
			BstNode currentNode = rootNode;
			boolean running = true;
			do {
				BstNode curLeftNode = currentNode.leftNode;
				BstNode curRightNode = currentNode.rightNode;
				int curIntData = currentNode.intData;
				
				if (i>curIntData) {
					if (curRightNode == null) {
						currentNode.rightNode = new BstNode(i);
						running = false;
					} else {
						currentNode = curRightNode;
					}
				} else {
					if (curLeftNode == null) {
						currentNode.leftNode = new BstNode(i);
						running = false;
					} else {
						currentNode = curLeftNode;
					}
				}
			} while(running);
		}
		
		public void traverseAndPrint(BstNode currentNode) {
			System.out.print("data = " + currentNode.intData);
			
			if (currentNode.leftNode == null) {
				System.out.print("\tleft = null");
			} else {
				System.out.print("\tleft = " + (currentNode.leftNode).intData);
			}
			
			if (currentNode.rightNode == null) {
				System.out.print("\tright = null");
			} else {
				System.out.print("\tright = " + (currentNode.rightNode).intData);
			}
			System.out.println("");
			
			if (currentNode.leftNode != null)
				traverseAndPrint(currentNode.leftNode);
			
			if (currentNode.rightNode != null)
				traverseAndPrint(currentNode.rightNode);
		}
		
		public boolean find(int i) {
			BstNode currentNode = rootNode;
			boolean running = true;
			boolean out = false;
			do {
				BstNode curLeftNode = currentNode.leftNode;
				BstNode curRightNode = currentNode.rightNode;
				int curIntData = currentNode.intData;
				
				if (i>curIntData) {
					if (curRightNode == null) {
						running = false;
					} else {
						currentNode = curRightNode;
					}
				} else if(i<curIntData) {
					if (curLeftNode == null) {
						running = false;
					} else {
						currentNode = curLeftNode;
					}
				} else {
					running = false;
					out = true;
				}
			} while(running);
			
			return out;
		}
		
}
