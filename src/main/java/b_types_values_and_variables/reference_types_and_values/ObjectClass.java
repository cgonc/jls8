package b_types_values_and_variables.reference_types_and_values;

class MyObject {

	int val = 0;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destroying the object");
	}

	protected MyObject clone() throws CloneNotSupportedException {
		MyObject clone = new MyObject();
		clone.val = this.val;
		return clone;
	}

	public boolean equals(MyObject obj) {
		return (this.val == obj.val);
	}
}

public class ObjectClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		MyObject myObject = new MyObject();
		myObject.val = 5;
		MyObject clone = myObject.clone();
		System.out.println("a.equals(clone) : " + myObject.equals(clone));

		String s1 = "s";
		String s2 = "s";
		System.out.println("s1.equals(s2) : " + s1.equals(s2));

	}
}
