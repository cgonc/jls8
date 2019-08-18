package lexical.structure.literals.stringliteral;

public class StringLiterals {

	public static void main(String[] args) {
		String hello = "Hello", lo = "lo";
		System.out.print((hello == "Hello") + " "); //true
		System.out.print((Other.hello == hello) + " "); //true
		System.out.print((lexical.structure.literals.stringliteral.other.Other.hello == hello) + " "); //true
		System.out.print((hello == ("Hel" + "lo")) + " "); //true
		System.out.print((hello == ("Hel" + lo)) + " "); //false
		System.out.print((hello.equals("Hel" + lo)) + " "); //true
		System.out.println(hello == ("Hel" + lo).intern()); //true

		/*
		• Literal strings within the same class (§8 (Classes)) in the same package (§7 (Packages))
		represent references to the same String object (§4.3.1).
		• Literal strings within different classes in the same package represent references to the
		same String object.
		• Literal strings within different classes in different packages likewise represent references
		to the same String object.
		• Strings computed by constant expressions (§15.28) are computed at compile time and
		then treated as if they were literals.
		• Strings computed by concatenation at run time are newly created and therefore distinct.
		• The result of explicitly interning a computed string is the same string as any pre-existing
		literal string with the same contents.
		*/

		System.out.println("Hell\blo");
		System.out.println("Hell\tlo");
		System.out.println("Hell\nnewline");
		System.out.println("Hell\flo");
		System.out.println("Hell\rlo");
		System.out.println("Hell\"lo");
		System.out.println("Hell\'lo");
		System.out.println("Hell\\lo");

	}
}

class Other {

	static String hello = "Hello";
}