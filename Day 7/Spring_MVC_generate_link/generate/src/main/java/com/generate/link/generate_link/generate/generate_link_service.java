package com.generate.link.generate_link.generate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class generate_link_service {
	
	@Autowired
	generate_link_db genDB;
	
	
	public String generateShort(String ip_lnk) {
		List<link_table> isthere= genDB.findByinputLink(ip_lnk);
		if(isthere.isEmpty()) {
			String op=generateLink(ip_lnk);
			return (op);
		}
		else {
			for (link_table g : isthere) {
				return g.getOutput_link();
				
			}
		}
		return null;
		
		
		
	}
	
	
	
	public String generateLink(String input_string) {
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
		
		List<link_table> op_String_Chk=genDB.findByoutputLink(output);
		if(op_String_Chk.isEmpty()) {
			break;
		}

		}
		
		link_table g=new link_table();
		g.setinputLink(input_string);
		g.setOutput_link(output);
		genDB.save(g);
		
		

		
		return output;
		

		
	}

}
