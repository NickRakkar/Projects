package coe528.lab2;

public class Palindrome {

	public static boolean isPalindrome(String s) {
		if(s == null)
			return false;
		if(s.equals(""))
			return false;
		int a = s.length();
		int w = a-1;
		String rev;
		char word[] = new char [a];
		char revW[] = new char[a];
		word = s.toCharArray();
		for(int q = 0;q < a;q++) {
			revW[w] = word[q];
			w--;
		}
		rev = String.copyValueOf(revW);
		System.out.println(rev);
		if(rev.compareToIgnoreCase(s) == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) { 
		if(args.length == 1) { 
			if (args[0].equals("1"))
				System.out.println(isPalindrome(null));
			else if (args[0].equals("2")) 
				System.out.println(isPalindrome(""));
			else if (args[0].equals("3"))
				System.out.println(isPalindrome("deed"));
			else if (args[0].equals("4"))
				System.out.println(isPalindrome("abcd"));
		}
	}
}
