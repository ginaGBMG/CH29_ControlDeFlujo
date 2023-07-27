// Part 1: Commission Calculator
import java.util.Scanner;
public class CommissionCalculator {
		public static void main(String[] args) {
		//*in* - objeto scaner 
			Scanner in = new Scanner(System.in);
		System.out.print("Comisión por venta:");
		int total = in.nextInt();
		// below N/A - 0F
		float comision = 0F; 
		//variables a usar
		 if (total >= 10000) { 
			 comision= 0.3F*total; 
			 //100% * 1000 / %
			 //70777 *.20
			}else if (total >= 5000) { 
				 comision= 0.2F*total; 				
			}else if (total >= 1000) {
				 comision= 0.1F*total; 				
			} //else 
			System.out.print("comision="+comision);
			in.close();
				}
		} 