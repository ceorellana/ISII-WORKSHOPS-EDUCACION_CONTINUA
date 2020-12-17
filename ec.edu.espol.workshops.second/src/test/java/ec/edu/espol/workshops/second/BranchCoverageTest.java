package ec.edu.espol.workshops.second;

import org.junit.Test;
import static org.junit.Assert.*;

public class BranchCoverageTest {
	CarInsurance car = new CarInsurance(null, 0, null, false, false);
	
	@Test
	public void testBranchCoverageB01() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(24);
		car.setMarried(false);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(2100, basePremium, 0.0);
	}
	
	@Test
	public void testBranchCoverageB02() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(24);
		car.setMarried(true);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(400, basePremium, 0.0);
	}
	
	@Test
	public void testBranchCoverageB03() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(26);
		car.setMarried(true);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(400, basePremium, 0.0);
	}
	
	@Test
	public void testBranchCoverageB04() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(26);
		car.setMarried(false);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(600, basePremium, 0.0);
	}
	
	@Test
	public void testBranchCoverageB05() {
		car.setName("Carlita");
		car.setGender("F");
		car.setAge(46);
		car.setMarried(true);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(300, basePremium, 0.0);
	}
	
	@Test
	public void testBranchCoverageB06() {
		car.setName("Carlita");
		car.setGender("F");
		car.setAge(66);
		car.setMarried(true);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(400, basePremium, 0.0);
	}
	
	@Test
	public void testBranchCoverageB07() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(81);
		car.setMarried(false);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(-1, basePremium, 0.0);
	}
	
	@Test
	public void testBranchCoverageB08() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(80);
		car.setMarried(false);
		car.setLicense(false);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(-1, basePremium, 0.0);
	}
	
}