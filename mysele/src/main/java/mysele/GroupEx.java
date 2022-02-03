package mysele;

import org.testng.annotations.Test;

public class GroupEx {
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("SANITY");
	}
	@Test(groups= {"sanity"})
	public void test10()
	{
		System.out.println("SANITY");
	}
	@Test(groups= {"sanity"})
	public void test11()
	{
		System.out.println("SANITY");
	}
	@Test(groups= {"regression"})
	public void test2()
	{
		System.out.println("Regression");
	}
	
	@Test(groups= {"sanity","regression"})
	public void test3()
	{
		System.out.println("SANITY,Regression");
	}
	
	@Test(groups= {"regression"})
	public void test4()
	{
		System.out.println("Regression");
	}
	@Test(groups= {"regression"})
	public void test5()
	{
		System.out.println("Regression");
	}
	@Test(groups= {"sanity","regression"})
	public void test6()
	{
		System.out.println("SANITY,Regression");
	}
	@Test(groups= {"sanity","regression"})
	public void test7()
	{
		System.out.println("SANITY,Regression");
	}
	
}
