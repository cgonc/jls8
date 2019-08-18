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

		//Some weird identifiers
		int αρετη = 0;
		int String = 34;
		String MAX_VALUE = "0\"";
		char isLetterOrDigit = 'f';

		System.out.println(αρετη);
		System.out.println(String);
		System.out.println(MAX_VALUE);
		System.out.println(isLetterOrDigit);

		//These can not be used as identifiers
		/*
		abstract continue for new switch
		assert default if package synchronized
		boolean do goto private this
		break double implements protected throw
		byte else import public throws
		case enum instanceof return transient
		catch extends int short try
		char final interface static void
		class finally long strictfp volatile
		const float native super while

		You can not define :
		int abstract = 0;
		*/

	}
}
