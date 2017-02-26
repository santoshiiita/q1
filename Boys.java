public class Boys {
	String name;
	int intelligent;
	int attractive;
	int min_attr_req;
	int budget;
	String gf;
	String sts;
	


	boolean is_eligible(int expense,int attar){
		if (this.budget >= expense && this.min_attr_req <= attar){
			return true;
		}else{
			return false;
		}
			
		}
	}
