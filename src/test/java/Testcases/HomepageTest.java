package Testcases;

import java.io.IOException;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Homepage;

public class HomepageTest extends TestBase {
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		TestBase tbase= new TestBase();
		tbase.Base_url();
		
	}
	@Test(description="This is login validate")
	public void Validate() throws IOException, InterruptedException {
		
		
		Homepage hpage= new Homepage();	
		hpage.HomepageforBuying();
		
		
		
		//add content, manage tests etc

		
	}

}
