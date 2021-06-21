class Test {
	
	public Test() {
		System.out.println("Les jomp stroooiiit intu the nieeeews!");
	}

	public void message() {
		System.out.println("test");
	}

	public void ln(String s) {
		System.out.println(s);
	}
	
}

public class MainTest {
	
	public static void main(String[] args) {
		
		Test p = new Test();
		
		String var = "Hello World!";
		
		System.out.println(var);
		
		p.message();
		
		p.ln("Hello there");
		
	}
	
}