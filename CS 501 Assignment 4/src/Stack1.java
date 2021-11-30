
public class Stack1
{
	private treeNode[] s;
	private int top, b;
	public Stack1(int m)
	{
		b = m;
		s = new treeNode[b];
		top = -1;
	}

	public void push(treeNode k)
	{
		s[++top] = k;
	}

	public treeNode pop()
	{
		return (s[top--]);
	}

	public boolean isEmpty()
	{
		return (top == -1);
	}
}