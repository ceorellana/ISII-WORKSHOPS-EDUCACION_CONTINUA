package ec.edu.espol.workshops.second;

import org.junit.Test;
import static org.junit.Assert.*;

public class PathCoverageTest {
	CarInsurance car = new CarInsurance(null, 0, null, false, false);
	
	@Test
	public void testPathCoverageP01() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(24);
		car.setMarried(false);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(2100, basePremium, 0.0);
	}
	
	@Test
	public void testPathCoverageP02() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(24);
		car.setMarried(true);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(400, basePremium, 0.0);
	}
	
	@Test
	public void testPathCoverageP03() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(26);
		car.setMarried(true);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(400, basePremium, 0.0);
	}
	
	@Test
	public void testPathCoverageP04() {
		car.setName("Carlos");
		car.setGender("M");
		car.setAge(26);
		car.setMarried(false);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(600, basePremium, 0.0);
	}
	
	@Test
	public void testPathCoverageP05() {
		car.setName("Carlita");
		car.setGender("F");
		car.setAge(46);
		car.setMarried(true);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(300, basePremium, 0.0);
	}
	
	@Test
	public void testPathCoverageP06() {
		car.setName("Carlita");
		car.setGender("F");
		car.setAge(46);
		car.setMarried(false);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(300, basePremium, 0.0);
	}
	
	@Test
	public void testPathCoverageP07() {
		car.setName("Carlita");
		car.setGender("F");
		car.setAge(66);
		car.setMarried(true);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(400, basePremium, 0.0);
	}
	
	@Test
	public void testPathCoverageP08() {
		car.setName("Carlita");
		car.setGender("F");
		car.setAge(66);
		car.setMarried(false);
		car.setLicense(true);
		
		int basePremium = car.premiumCarInsurance(car.getAge(), car.getGender(), car.isMarried(), car.hasLicense());
		assertEquals(400, basePremium, 0.0);
	}
	
}