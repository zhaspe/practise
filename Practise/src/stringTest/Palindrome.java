package stringTest;

public class Palindrome 
{
	public static String getLongestPalindrome(String s)
	{
		if(s == null || s.length() == 0) return "";
		String result = null;
		int maxPalindormeLenth = 0;
		
		for(int i = 0; i< s.length(); i++)
		{
			for(int j = 0; j< s.length(); j++)
			{
				if(isPalindrome(s, i, j))
				{
					if(j-i+1 > maxPalindormeLenth)
					{
						maxPalindormeLenth = j-i+1;
						result = s.substring(i, j+1);
					}
				}
			}
		}
		return result;
	}
	
	public static boolean isPalindrome(String s, int i, int j)
	{
		while(i<j)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	public static String getLongestPalindrome2(String s)
	{
		if(s== null || s.length() == 0) return null;
		
		int len = s.length();
		String max = "";
		for(int i=0;i<len;i++)
		{
			String s1 = getOddPalindrome(s, i);
			String s2 = getEvenPalindrome(s, i);
			String tmp = null;
			if(s1.length() > s2.length())
			{
				tmp = s1;
			}
			else
			{
				tmp = s2;
			}
			if(tmp.length() > max.length())
			{
				max = tmp;
			}
		}
		return max;
	}
	
	public static String getOddPalindrome(String s, int i)
	{
		int m = i-1,n = i+1;
		while(m>-1 && n<s.length() && s.charAt(m)==s.charAt(n))
		{
			m--;
			n++;
		}
//		if(m==-1 && n==s.length())
//		{
//			return s;
//		}
//		else if (m==-1 || n = s.length())
//		{
//			return s.substring(m+1, n);
//		}
		return s.substring(m+1, n);
		
	}
	
	public static String getEvenPalindrome(String s, int i)
	{
		int m = i,n=i+1;
		while(m>-1 && n<s.length() && s.charAt(m)==s.charAt(n))
		{
			m--;
			n++;
		}
		return s.substring(m+1,n);
	}

}
