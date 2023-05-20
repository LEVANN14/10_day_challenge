package array_prac;

import java.util.HashMap;
import java.util.Map;

public class pascal_triangle {
	
	//The Memoization implementation
	static Map <Integer,Integer> hm=new HashMap<>();
	
	public static int fact(int num) {
		
		if(num<2) {
			return 1;
		}
		
		if(hm.containsKey(num)) {
			return(hm.get(num));
		}
		
		int result=num*fact(num-1); //Recursion in order to call the same function again.
		hm.put(num, result); //Memoization implementation to not calculate already calculated values
		
		return (result);
		
	}
	
	public static void main(String args[]) {
		
		//Hardcoded the size of the candle
		int n=6;



		
		
		
		for(int i=0;i<=n;i++) {
			for(int k=i;k<n;k++) {
				System.out.print(" \t");
			}


			for(int j=0;j<=i;j++) {
				//Pascal triangle uses the combination formula nCr = (n!)/((n-r)!(r!)) -> This can be used to calculate the values
				System.out.print((fact(i)/(fact(i-j)*fact(j)))+"\t");  //Creating the pascal Triangle


				System.out.print(" \t");

				
			}

			

			System.out.println();
		}
	}
	
}
