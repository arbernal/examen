package test11;

class Outer {
	static class Inner {
		public final String text = "Inner";
	}
}

class InnerClassAccess {
	public static void main(String[] args) {
		System.out.println( new Outer.Inner().text);
	}
}
