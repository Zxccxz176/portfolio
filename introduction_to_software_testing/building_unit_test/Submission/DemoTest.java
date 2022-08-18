

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;

public class DemoTest {
 @Test
 public void test_is_triangle_1 () {
  assertTrue (Demo.isTriangle (3,4,5));
}
 @Test
 public void test_is_triangle_2 () {
  assertTrue (Demo.isTriangle (10,5,13));
}
 @Test
 public void test_is_triangle_3 () {
  assertTrue (Demo.isTriangle (3,15,15));
}
 @Test
 public void test_is_triangle_4 () {
  assertTrue (Demo.isTriangle (4,8,9));
}
 @Test
 public void test_is_triangle_5 () {
  assertTrue (Demo.isTriangle (5,5,5));
}
 @Test
 public void test_is_NOT_triangle_1 () {
  assertFalse (Demo.isTriangle (3,18,12));
}
 @Test
 public void test_is_NOT_triangle_2 () {
  assertFalse (Demo.isTriangle (1,5,19));
}
 @Test
 public void test_is_NOT_triangle_3 () {
  assertFalse (Demo.isTriangle (2,4,15));
}
 @Test
 public void test_is_NOT_triangle_4 () {
  assertFalse (Demo.isTriangle (1,1,10));
}
 @Test
 public void test_is_NOT_triangle_5 () {
  assertFalse (Demo.isTriangle (1,1,2));
}
 @Test
 public void test_is_NOT_triangle_6 () {
  assertFalse (Demo.isTriangle (-1,2,3));
}
 @Test
 public void test_is_NOT_triangle_7 () {
  assertFalse (Demo.isTriangle (-15,15,2));
}
 @Test
 public void test_is_NOT_triangle_8 () {
  assertFalse (Demo.isTriangle (-3,18,-12));
}

/*
@Test
public void test_main_program_1 () {
	ByteArrayInputStream in = new ByteArrayInputStream ("5\n12\n13\n").getBytes ());
	System.setIn(in);
	ByteArrayOutputStream out = new ByteArrayOutputStream ();
	System.setOut (new PrintStream (out));
	String consoleOutput = "Enter side 1:\n";
	consoleOutput += "Enter side 2:\n";
	consoleOutput += "Enter side 3:\n";
	consoleOutput += "This is a triangle:\n";
	assertEquals(consoleOutput, out.toString());
}
*/
}
