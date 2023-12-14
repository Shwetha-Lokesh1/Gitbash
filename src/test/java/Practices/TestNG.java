package Practices;

import org.testng.annotations.Test;



public class TestNG {
	@Test(groups={"SanityTest", "SmokeTest"})

	public void createProduct()
	{
		System.out.println("Product Created");
	}
	@Test(dependsOnMethods="createProduct")
	//or @Test(invocationCount=2)
	//or @Test(priority=2)
	
	//c=modify and delete depend on create product
public void modifyproduct()
{
	System.out.println("Product modified");
}

	@Test(enabled=false)
	
public void deleteProduct()
{
	System.out.println("Product Deleted");	
}

}

