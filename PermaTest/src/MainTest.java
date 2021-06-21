class Test  {
	
	public Test() {
		System.out.println("Les jomp stroooiiit intu the nieeeews");
	}
		
	public void message() {
		System.out.println("test");
	}
	
	public void printLine(String s) {
		System.out.println(s);
	}
	
}


public class MainTest {
	
	public static void main(String[] args) {
		
		Test test = new Test();
		
		String var = "Hello World!";
		
		System.out.println(var);
		
		test.message();
		
		test.printLine("Hello there" );
		
	}
	
}
