import java.io.*;

public class ExpressionTree
{
	public static void main(String args[]) throws IOException
	{
		String ch = "y";
		DataInputStream ip = new DataInputStream(System.in);
		System.out.println("Binary Tree Output");
		while (ch.equals("y"))
		{
			BinaryTree bt = new BinaryTree();
			System.out.print("Enter the expression:");
			String a = ip.readLine();
			bt.insertelem(a);
			bt.traverseTree(1);
			System.out.println("");
			bt.traverseTree(2);
			System.out.println("");
			bt.traverseTree(3);
			System.out.println("");
			System.out.print("Enter y to continue and n to exit ");
			ch = ip.readLine();
		}
	}
}

