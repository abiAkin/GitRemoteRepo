import static org.junit.Assert.*;
import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testGetNameWhenEqual() {
		HelloWorld helloWorld = new HelloWorld();
		
		String firstName1 = "Abigail";
		String firstName2 = "Akinhanmi";
		String result = helloWorld.getName(firstName1, firstName2);
		assertEquals("Names are equal", result, firstName1 + " " + firstName2);
	}
	
	@Test
	public void testGetNameWhenNotEqual() 
	{
		HelloWorld helloWorld = new HelloWorld();
		
		String name1 = "Charlie";
		String name2 = "Phipps";
		String result = helloWorld.getName(name1, name2);
		assertEquals("Names not equal", result, name1 + " " + name2);
	}
}
