import java.io.*;
public class q1{
	
	public static void main(String args[]){
		Boys arr1[] = new Boys[1000];
		input csv_files = new input();
		csv_files.csv();  
		String csvFile = "b.csv";
		String line = "";
		String csvSplit = ",";
		int i;
		int j;
		i=0;
		j=0;
		BufferedReader buff = null;
		try{
			buff = new BufferedReader(new FileReader(csvFile));
			while((line = buff.readLine() )!= null){
				String[] table1 = line.split(csvSplit);
			
				arr1[i] = new Boys();
			    arr1[i].name = table1[0];
				arr1[i].intelligent = Integer.parseInt(table1[1]);
				arr1[i].attractive = Integer.parseInt(table1[2]);
				arr1[i].min_attr_req = Integer.parseInt(table1[3]);
				arr1[i].budget = Integer.parseInt(table1[4]);
				arr1[i].gf="";
				arr1[i].sts = table1[5];
				i++;
			}
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		csvFile = "g.csv";
		csvSplit = ",";
		line = "";
		buff = null;
		Girls arr2[]=new Girls[2000];
		
		try{
			buff = new BufferedReader(new FileReader(csvFile));
			while((line = buff.readLine() )!= null){
				String[] table2 = line.split(csvSplit);
			
				arr2[j] = new Girls();
			    arr2[j].name = table2[0];
				arr2[j].attractive = Integer.parseInt(table2[1]);
				arr2[j].expenditure = Integer.parseInt(table2[2]);
				arr2[j].intelligent = Integer.parseInt(table2[3]);
				arr2[j].sts = table2[4];
				arr2[j].bf="";
				j++;
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
				if(buff != null){
					try{
						buff.close();
					}catch(IOException e){
					e.printStackTrace();
					}
				}
		}
		
		int k,l;
		String s[] = new String[100];
		int cnt = 0;
		for(k=0;k<i;k++){
			for(l=0;l<j;l++){
				if(arr1[k].is_eligible(arr2[l].expenditure,arr2[l].attractive) && arr2[l].is_eligible(arr1[k].budget) && arr2[l].sts.equals("Single")  && arr1[k].sts.equals("Single") ){
					arr1[k].gf = arr2[l].name;
					arr2[l].bf = arr1[k].name;
					arr1[k].sts = "Is_Committed";
					arr2[l].sts = "Is_Committed";
					if(arr1[k].sts.equals("Is_Committed")){
					s[cnt] = "Boy: "+ arr1[k].name +" is committed with "+"Girl: "+ arr1[k].gf  ;
					}
					cnt++;
									
				}
				
			}
		}
		
		MyLogger.logger(s,cnt);	
	}
	}
