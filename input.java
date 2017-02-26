import java.io.*;
import java.util.*;
public class input {
	    void csv(){
		try{
			FileWriter boy = new FileWriter("b.csv");
			FileWriter girl = new FileWriter("g.csv");
			int j;
			Random boy_rand = new Random();
			Random girl_rand = new Random();
			for(j=0;j<=20;j++){
				boy.write("B"+j+","+boy_rand.nextInt(10)+","+boy_rand.nextInt(10)+","+boy_rand.nextInt(10)+","+boy_rand.nextInt(1000)+","+"Single"+"\n");
			}
			for(j=0;j<=7;j++){
				girl.write("G"+j+","+girl_rand.nextInt(10)+","+girl_rand.nextInt(1000)+","+girl_rand.nextInt(10)+","+"Single"+"\n");
			}
			boy.close();
			girl.close();
		}catch(IOException e){		
		
		}
	
		
}
	    
}
