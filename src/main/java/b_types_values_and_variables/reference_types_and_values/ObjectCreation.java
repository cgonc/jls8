package b_types_values_and_variables.reference_types_and_values;

class Point {

	int x, y;

	Point() {
		System.out.println("default");
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// A Point instance is explicitly created at class initialization time:
	static Point origin = new Point(0, 0);

	// A String can be implicitly created by a + operator:
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

class ObjectCreation {

	public static void main(String[] args) {
		//A Point is explicitly created using newInstance:
		Point p = null;
		try{
			p = (Point) Class.forName("b_types_values_and_variables.reference_types_and_values.Point")
							 .newInstance();
		} catch (Exception e){
			System.out.println(e);
		}

		// An array is implicitly created by an array constructor:
		Point a[] = {new Point(0, 0), new Point(1, 1)};

		// Strings are implicitly created by + operators:
		System.out.println("p: " + p);
		System.out.println("a: { " + a[0] + ", " + a[1] + " }");

		// An array is explicitly create by an array creation expression:
		String sa[] = new String[2];
		sa[0] = "he"; sa[1] = "llo";
		System.out.println(sa[0] + sa[1]);

	}

}
