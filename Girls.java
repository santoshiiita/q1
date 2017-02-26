public class Girls {
	String name;
	int attractive;
	int expenditure;
	int intelligent;
	String bf;
	String sts;
	

	boolean is_eligible(int budget){
	if (this.expenditure <= budget) {
			return true;
		}
	else {
			return false;
		}
	}
	
}
