package main;

public class Main {
	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG       ";
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2,9);
		String s6 = original.replace('a','x');
		String s7 = original.replace("abc","xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s1 + "-");
		System.out.println("toUpperCase: -" + s2 + "-");
		System.out.println("Trim: -" + s3 + "-");
		System.out.println("substring(2): -" + s4 + "-");
		System.out.println("substring(2,9): -" + s5 + "-");
		System.out.println("replace(a,x): -" + s6 + "-");
		System.out.println("replace(abc,xy): -" + s7 + "-");
		System.out.println("indexof: -" + i + "-");
		System.out.println("lastindexof: -" + j + "-");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}
}
