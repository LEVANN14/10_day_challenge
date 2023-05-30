package Link;

import java.util.*;

public class Link {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		GenerateLink gl=new GenerateLink();
		System.out.println("Enter link to get shortened version or exit to exit");
		
		while(true) {
		String input_link=sc.next();

		if(input_link.toLowerCase().equals("exit")) {
			break;
		}
		
		System.out.println(gl.generate(input_link));

		}
		
		



		
	}

}
