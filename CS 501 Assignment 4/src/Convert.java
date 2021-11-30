
public class Convert
{
	private Stack2 sta;
	private String str1;
	private String str2 = "";
	public Convert (String str)
	{
		str1 = str;
		sta = new Stack2(str.length());
	}

	public String Post()
	{
		for (int i=0; i < str1.length(); i++)
		{
			char ch = str1.charAt(i);
			switch(ch)
			{
				case '+':
				case '-':
				operator(ch, 1);
				break;
				case '*':
				case '/':
				operator(ch, 2);
				break;
				case '(':
				sta.push(ch);
				break;
				case ')':
				Parenthesis();
				break;
				default:
				str2 = str2 + ch;
			}
		}
		
		while(!sta.isEmpty())
				str2 = str2 + sta.pop();
		
		return str2;
		
	}
	
	private void operator(char opThis, int prec1)
	{
		while (!sta.isEmpty())
		{
			char opTop = sta.pop();
			if (opTop == '(')
			{
				sta.push(opTop);
				break;
			}
				
			else
			{
				int prec2;
				if (opTop == '+' || opTop == '-')
					prec2 = 1;
				else
					prec2 = 2;
				if (prec2 < prec1)
				{
					sta.push(opTop);
					break;
				}
				
				else
					str2 = str2 + opTop;
			}
		}

		sta.push(opThis);
	}
	
	private void Parenthesis()
	{
		while (!sta.isEmpty())
		{
			char ch = sta.pop();
			if (ch == '(')
				break;
			else
				str2 = str2 +ch;
		}
	}
}
