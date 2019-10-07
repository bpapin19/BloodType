
public enum RhFactor {
		POSITIVE('+'), NEGATIVE('-');
		
		char sign;
	
		//enum constructor
		RhFactor(char s) {
			sign = s;
		}
		
		//Enum methods
		public char getSign() {
			return sign;
		}
}
