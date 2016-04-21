package judge;

import java.util.*;

public class First12{
	public static void main(String[] args) 
	{
		SS obj = new SS();
		System.out.println(obj.solution("ABABABABABCCA"));	
	}
}
class SS
{
	public String solution(String s)
	{
		Stack<Character> st = new Stack<Character>();
		char a[] = s.toCharArray();
		st.push(a[0]);
		char peek;
		int i=1;
		while(i<s.length())
		{
				peek = (char)st.peek();
				if(peek == 'A' && ((a[i]!='B') && (a[i]!='A')))
				{
					st.push(a[i]);
				}
				else if(peek == 'C' && ((a[i]!='B') && (a[i]!='C')))
				{
					st.push(a[i]);
				}
				else if(peek == 'B')
				{
					if(a[i]=='A')
					{
						st.pop();
						st.push(a[i]);
					}
					else
					{
						st.push(a[i]);
					}
				}
				i++;
		}
		StringBuilder str = new StringBuilder();
		while(!st.empty())
		{
			str.append(st.pop());
		}
		return str.reverse().toString();
	}
}