
public class BinaryTree
{
	private treeNode root;
	public BinaryTree()
	{
		root = null;
	}

	public void insertelem(String str)
	{
		Convert c =new Convert(str);
		str = c.Post();
		Stack1 st = new Stack1(str.length());
		str = str + "#";
		int i =0;
		char symbol = str.charAt(i);
		treeNode newNode;
		while (symbol != '#')
		{
			if (symbol >= '0' && symbol <= '9' || symbol >= 'A' && symbol <= 'Z' || symbol >= 'a' && symbol <= 'z')
			{
				newNode = new treeNode(symbol);
				st.push(newNode);
			}
			
			else if (symbol == '+' || symbol == '-' || symbol == '/' || symbol == '*')
			{
				treeNode pt1 = st.pop();
				treeNode pt2 = st.pop();
				newNode = new treeNode(symbol);
				newNode.leftChild = pt2;
				newNode.rightChild = pt1;
				st.push(newNode);
			}
			
			symbol = str.charAt(++i);
		}
		
		root = st.pop();
	}

	public void traverseTree(int choice)
	{
		switch (choice)
		{
			case 1:
			System.out.print("Preorder Traversal:");
			preorder(root);
			break;

			case 2:
			System.out.print("Inorder Traversal:");
			inorder(root);
			break;

			case 3:
			System.out.print("Postorder Traversal:");
			postorder(root);
			break;

			default:
			System.out.println("Invalid choice");
		}
	}
	
	private void preorder(treeNode root)
	{
		if (root != null)
		{
			root.display();
			preorder(root.leftChild);
			preorder(root.rightChild);
		}
	}

	private void inorder(treeNode root)
	{
		if (root != null)
		{
			inorder(root.leftChild);
			root.display();
			inorder(root.rightChild);
		}
	}

	private void postorder(treeNode root)
	{
		if (root != null)
		{
			postorder(root.leftChild);
			postorder(root.rightChild);
			root.display();
		}
	}
}