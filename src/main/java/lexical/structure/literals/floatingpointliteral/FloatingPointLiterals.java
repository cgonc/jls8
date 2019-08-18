package lexical.structure.literals.floatingpointliteral;

public class FloatingPointLiterals {

	public static void main(String[] args) {
		float basicFloatingPointLiteral = 999.99F;
		float basicSmallFloatingPointLitral = 0.99F;

		System.out.println(basicFloatingPointLiteral - basicSmallFloatingPointLitral);
		float basicSmallFloatingPointWithENotation = 99E-2F;
		System.out.println(basicFloatingPointLiteral - basicSmallFloatingPointWithENotation);

		float largestFloatingPointLiteral = 3.4028235e38f;
		System.out.println(largestFloatingPointLiteral - largestFloatingPointLiteral);
		System.out.println(largestFloatingPointLiteral + largestFloatingPointLiteral);

		float smallestFloatingPointLiteral = 1.40e-45f;
		System.out.println(smallestFloatingPointLiteral - smallestFloatingPointLiteral);

		double largestDoubleLiteral = 1.7976931348623157e308d;
		System.out.println(largestDoubleLiteral + largestDoubleLiteral);

		double smallestDoubleLiteral = 4.9e-324d;
		System.out.println(smallestDoubleLiteral - smallestDoubleLiteral);
	}
}
