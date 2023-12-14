package Practices;


import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void m1()
	{
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(false, true);
	
		
		System.out.println("step4");
		System.out.println("step5");
	}

	private void assertEquals(boolean b, boolean c) {
		// TODO Auto-generated method stub
		
	}

	public void assertEquals(String actData, String campaignName) {
		// TODO Auto-generated method stub
		
	}

	public void assetAll() {
		// TODO Auto-generated method stub
		
	}

	

	
		
	}



