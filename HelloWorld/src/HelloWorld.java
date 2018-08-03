public class HelloWorld {

	/**
	 * 
	 */
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String args[]) 
	{
		HelloWorld helloWorld = new HelloWorld();

		System.out.println("Hello World" + " " + helloWorld.getName(args[0], args[1]));
	}

	public String getName(String firstName1, String firstName2) {
		
		return firstName1 + " " + firstName2;
		
		
	}

}

