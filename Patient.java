/* Brandon Papin
 * CPSC 223J
 * Week08 Nested Classes
 * Create a patient class with a blood type nested class
 */

public class Patient {

	private int ID_number;
	private int age;
	
	//nested class to get blood type and the sign
		private class BloodData {
			private BloodType blood_type = BloodType.O;
			private RhFactor Rh_Factor = RhFactor.NEGATIVE;
				
			//default constructor
			public BloodData() {
				BloodType blood_type = BloodType.O;
				RhFactor Rh_Factor = RhFactor.NEGATIVE;
			}
			
			//overloaded constructor
			public BloodData(RhFactor Rh, BloodType bData) {
			    Rh_Factor = Rh;
				blood_type = bData;
			}
		}
		
	private BloodData blood = new BloodData();
	
	//default constructor
	public Patient () {
		ID_number = 0;
		age = 0;
		//blood = new BloodData();
	}
	//default constructor with parameters
	public Patient(int ID_number, int age, RhFactor Rh, BloodType bloodType) {
		this.ID_number = ID_number;
		this.age = age;
		blood.blood_type = bloodType;
		blood.Rh_Factor = Rh;
		//blood = new BloodData(bloodType, Rh);
	}
	public void displayBlood() {
		System.out.println(blood.blood_type.getType() + blood.Rh_Factor.getSign());
	}
	public int getID() {
		return ID_number;
	}
	public int getAge() {
		return age;
	}
	
}
