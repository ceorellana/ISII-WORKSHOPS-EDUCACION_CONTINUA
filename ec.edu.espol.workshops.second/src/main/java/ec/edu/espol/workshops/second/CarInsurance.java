package ec.edu.espol.workshops.second;

import java.util.Scanner;

public class CarInsurance {
	
	private String name = "";
	
	private int age = 0;
	
	private String gender = "";
	
	private boolean married = false;
	
	private boolean license = false;
	
	public CarInsurance(String name, int age, String gender, boolean married, boolean license) {
		this.name = name;
		this.age = age; 
		this.gender = gender;
		this.married = married;
		this.license = license;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	public void setLicense(boolean license) {
		this.license = license;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public boolean isMarried() {
		return married;
	}
	
	public boolean hasLicense() {
		return license;
	}

	public int premiumCarInsurance(int age, String gender, boolean married, boolean license) {
		int basePremium = 400;
		
		if ((age > 80) || !license) {
			return -1;
		}
		
		if ((gender.equals("M")) && (!married) && (age < 25)) {
			basePremium += 1500;	
		}
		
		if ((gender.equals("F")) || (married)) {
			basePremium -= 200;
		}
		
		if ((age >= 45) && (age < 65)) {
			basePremium -= 100;
		}

		return basePremium;
		
	}
	
	public static String validateInput(Scanner sc, String type, String flavorText) {
		String input = "";
		
		System.out.println(flavorText); //NOPMD
		input = sc.nextLine();
		
		if ((type.equals("Number"))) {
			try {
				Integer.parseInt(input);
			} catch (NumberFormatException e) {
				return "-1";
			}
		}
		return input;
	}

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		int op = 0;
		String name = "";
		int age = 0;
		String gender = "";
		boolean isMarried = false;
		boolean hasLicense = false;
		
		name = validateInput(inputReader, "String", "Nombre: ");
		age = Integer.parseInt(validateInput(inputReader, "Number", "Edad: "));
		if ((age == -1)) {
			age = 85;
		}
		
		op = Integer.parseInt(validateInput(inputReader, "Number", "Sexo:\n1) "
				+ "Masculino\n2) Femenino"));
		switch (op) {
		case 1:
			gender = "M";
			break;
		case 2:
			gender = "F";
			break;
		default:
			age = 85;
			break;
		}

		op = Integer.parseInt(validateInput(inputReader, "Number", "¿Es casado?:\n1) "
				+ "Si\n2) No"));
		switch (op){
		case 1:
			isMarried = true;
			break;
		case 2:
			isMarried = false;
			break;
		default:
			age = 85;
			break;
		}
		
		op = Integer.parseInt(validateInput(inputReader, "Number", 
				"¿Tiene licencia válida?:\n1) "
				+ "Si\n2) No"));
		switch (op) {
		case 1:
			hasLicense = true;
			break;
		case 2:
			hasLicense = false;
			break;
		default:
			age = 85;
			break;
		}

		inputReader.close();
		
        CarInsurance c1 = new CarInsurance(name, age, gender, isMarried, hasLicense);
        int premiumValue = c1.premiumCarInsurance(c1.getAge(), c1.getGender(), 
        		c1.isMarried(), c1.hasLicense());
		System.out.println(c1.getName() + "'s car insurance is " + premiumValue);
    }

}