package stringTest;

public class StringMain {

	public static void Test()
	{
		System.out.println("longest palindrome in abccbaaaaaaaa: " + Palindrome.getLongestPalindrome("abccbaaaaaaaa"));
		System.out.println("longest palindrome in abccbaaaa: " + Palindrome.getLongestPalindrome("abccbaaaa"));
		System.out.println("longest palindrome in abcdefgfedcdd: " + Palindrome.getLongestPalindrome("abcdefgfedcdd"));
		
		System.out.println("longest palindrome in abccbaaaaaaaa: " + Palindrome.getLongestPalindrome2("abccbaaaaaaaa"));
		System.out.println("longest palindrome in abccbaaaa: " + Palindrome.getLongestPalindrome2("abccbaaaa"));
		System.out.println("longest palindrome in abcdefgfedcdd: " + Palindrome.getLongestPalindrome2("abcdefgfedcdd"));
	}
}
