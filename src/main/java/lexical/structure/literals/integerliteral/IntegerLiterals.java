package lexical.structure.literals.integerliteral;

public class IntegerLiterals {

	public static void main(String[] args) {
		int decimalIntegerLiteral = 999;

		int hexIntegerLiteral = 0x3E7; //999
		System.out.println(decimalIntegerLiteral - hexIntegerLiteral);

		int octalIntegerLiteral = 01747; //999
		System.out.println(decimalIntegerLiteral - octalIntegerLiteral);

		int binaryIntegerLiteral = 0b1111100111; //999
		System.out.println(decimalIntegerLiteral - binaryIntegerLiteral);

		int binaryInterWithUnderScoresLiteral = 0b0011_1110_0111; //999
		System.out.println(decimalIntegerLiteral - binaryInterWithUnderScoresLiteral);

		long longIntegerLiteral = 999L;
		System.out.println(decimalIntegerLiteral - longIntegerLiteral);

		int decimalUnderscoreLiteral = 99_9;
		System.out.println(decimalIntegerLiteral - decimalUnderscoreLiteral);

		int largestDecimalIntegerLiteral = 2147483647; //2^31 -1
		System.out.println((largestDecimalIntegerLiteral + 1) + (largestDecimalIntegerLiteral + 1));
		System.out.println(-2147483648 + largestDecimalIntegerLiteral + 1); //2147483648 this can appear in just unary minus operator

		long largestDecimalLongLiteral = 9223372036854775807L; //2^63 -1
		System.out.println(-9223372036854775808L + largestDecimalLongLiteral + 1);

	}

}
