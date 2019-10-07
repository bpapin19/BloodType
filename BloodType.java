
public enum BloodType {
	//enum BloodType{O, A, B, AB};
		O("O"), A("A"), B("B"), AB("AB");
		String type;
	
		BloodType(String t) {
			type = t;
		}

		//Enum methods
		public String getType() {
			return type;
		}
}
