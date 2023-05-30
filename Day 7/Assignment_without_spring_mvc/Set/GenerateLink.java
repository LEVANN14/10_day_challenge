package Link;

import java.util.*;

public class GenerateLink {
	
	String input_string;
	
	Set<String> link_hm=new HashSet<>();
	
	public GenerateLink(String input_string) {
		
		
		
		this.input_string=input_string;
		
		
		
	}
	public GenerateLink() {
		
	}
	

	
	
	public String generate(String input_string) {
		String output="";
		

			
		String c= input_string.replace("www.","");
		String[] arrS=c.split("[.]");
		
		
		while(true) {
		
		String second_part=arrS[0];
		int string_length=second_part.length();
		int st=0;
		for(st=0;st<string_length-2;st++) {
			output=output+second_part.charAt(st);
			
		}
		output=output+".";
		for(;st<string_length;st++) {
			output=output+second_part.charAt(st);
		}
		
		output=output+"/";
		
		for(int i=0;i<6;i++) {
			
			int rand1=1+(int)(Math.random()*(2));
			
			if(rand1==1) {
			int rand=65+(int)(Math.random()*(91-65));
			output=output+(char)rand;
			}
			else {
				int rand=97+(int)(Math.random()*(123-97));
				output=output+(char)rand;
			}

		}
		if(link_hm.contains(output)==false) {
			break;
		}
		}
		link_hm.add(output);
		
		

		
		return output;
		
		

		
	}

}
