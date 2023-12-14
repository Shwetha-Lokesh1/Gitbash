package Practices;


import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssetEx {
	@Test
	public void m1()
	{
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		Assert.assertEquals(false, true);
		System.out.println("step4");
		System.out.println("step5");
	}
	@Test
	
	public void m2()
	{
String ExpData="Qspiders";
String ActData="Qspiders";
Assert.assertEquals(ActData, ExpData);
}
}
