package ec.edu.espol.workshops.second;

import org.junit.Test;
import static org.junit.Assert.*;

public class StatementCoverageTest {
	CarInsurance car = new CarInsurance(null, 0, null, false, false);
	
	@Test
	public void testStatementCoverageS01() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(24);
		car.setMarried(false);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(2100, basePremium, 0.0);
	}
	
	@Test
	public void testStatementCoverageS02() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(81);
		car.setMarried(false);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(-1, basePremium, 0.0);
	}
	
	@Test
	public void testStatementCoverageS03() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(80);
		car.setMarried(false);
		car.setLicense(false);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(-1, basePremium, 0.0);
	}
	
}
