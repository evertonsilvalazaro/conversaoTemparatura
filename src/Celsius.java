import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		double celcius, fahrenheit;
		System.out.println("Digite a temparatura em graus celcius");
		celcius=teclado.nextDouble();
		fahrenheit=(celcius*1.8)+32;
		
		System.out.println(celcius +" graus celcius é "+fahrenheit+" fahrenheit");
		
         teclado.close();
	}

}
