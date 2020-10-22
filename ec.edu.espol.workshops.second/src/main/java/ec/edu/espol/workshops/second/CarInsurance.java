package ec.edu.espol.workshops.second;

public class CarInsurance {
	
	private String name = "" ;
	
	private int age = 0 ;
	
	private String gender = "" ;
	
	private boolean married = false ;
	
	public CarInsurance(String name, int age, String gender, boolean married) {
		this.name = name ;
		this.age = age ; 
		this.gender = gender ;
		this.married = married ;
	}

	public void setName(String name) {
		this.name = name ;
	}
	
	public void setAge(int age) {
		this.age = age ;
	}
	
	public void setGender(String gender) {
		this.gender = gender ;
	}
	
	public void setMarried(boolean married) {
		this.married = married ;
	}
	
	public String getName() {
		return name ;
	}
	
	public int getAge() {
		return age ;
	}
	
	public String getGender() {
		return gender ;
	}
	
	public boolean isMarried() {
		return married ;
	}

	public int premiumCarInsurance(int age, String gender, boolean married) {
		int base_premium = 500 ;
		
		if( (age > 80) ) {
			return -1 ;
		}
		
		if( (gender.equals("M")) && (!married) && (age < 25) ) {
			base_premium += 1500 ;	
		}
		
		if( (gender.equals("F")) || (married) ) {
			base_premium -= 200 ;
		}
		
		if( (age < 45) && (age < 65) ) {
			base_premium -= 100 ;
		}

		return base_premium ;
		
	}
	
	public static void main(String[] args) {
        CarInsurance c1 = new CarInsurance("Emilio", 25, "M", false);
        int premium_Emilio = c1.premiumCarInsurance(c1.getAge(), c1.getGender(), c1.isMarried());
		System.out.println(c1.getName() + "'s car insurance is " + premium_Emilio);
    }

}