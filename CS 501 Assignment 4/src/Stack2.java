
public class Stack2
{
	private char[] s;
	private int top, b;
	public Stack2(int m)
	{
		b = m;
		s = new char[b];
		top = -1;
	}

	public void push(char k)
	{
		s[++top] = k;
	}

	public char pop()
	{
		return (s[top--]);
	}

	public boolean isEmpty()
	{
		return (top == -1);
	}
}
