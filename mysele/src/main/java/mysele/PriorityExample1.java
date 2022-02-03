package mysele;

import org.testng.annotations.Test;

public class PriorityExample1 {
	@Test
	public void c_method()
	{
		System.out.println("C method");
	}

	@Test
	public void b_method()
	{
		System.out.println("B method");
	}
	@Test
	public void a_method()
	{
		System.out.println("A method");
	}
	@Test
	public void e_method()
	{
		System.out.println("E method");
	}
	@Test
	public void d_method()
	{
		System.out.println("D method");
	}
}
