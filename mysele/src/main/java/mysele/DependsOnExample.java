package mysele;

import org.testng.annotations.Test;

public class DependsOnExample {
	@Test
	public void insert() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("inserting demo data");

	}
	
	@Test(dependsOnMethods="insert")
	public void select() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("selecting demo data");
	}
	
	@Test(dependsOnMethods="select")
	public void update() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("updating demo data");
	}
	
	@Test(dependsOnMethods="update")
	public void delete() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("deleting demo data");
	}

}
