package lexical.structure;

public class Identifiers {

	public static void main(String[] args) {
		System.out.println(Character.isJavaIdentifierStart('d'));
		System.out.println(Character.isJavaIdentifierStart('+'));
		System.out.println(Character.isJavaIdentifierStart('&'));

		System.out.println(Character.isJavaIdentifierPart('+'));
		System.out.println(Character.isJavaIdentifierPart('_'));
		System.out.println(Character.isJavaIdentifierPart('&'));
		System.out.println(Character.isJavaIdentifierPart('\''));

	}
}
