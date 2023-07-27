//Part 2: Movie Discounts
import java.util.Scanner; 
public class MovieDiscounts {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Aplicación del descuento:"); 
	int edad = in.nextInt();
	float precio = 7f;
if (edad >= 60) { 
		 precio= precio*0.45f; 
		}else if (edad <= 5) { 
			 precio= precio*0.4f; 
		}
		System.out.print("precio="+precio);
		in.close();
			}
	} 