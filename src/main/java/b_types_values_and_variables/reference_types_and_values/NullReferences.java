package b_types_values_and_variables.reference_types_and_values;

public class NullReferences {

	public static void main(String[] args) {
		Object first = null;
		Object second = null;

		System.out.println("first == null: " + first == null);
		System.out.println("first == second: " + first == second);
	}
}
