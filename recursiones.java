import java.util.Scanner;

public class Recursiones1 {
	
	
public static int getfactorial(int f) {
		
		if(f == 1) {
			return 1;
		}	else {
			return f * getfactorial(f-1);
		}
	}

	public static int getfibonacci(int n) {
		
		
		if (n==1) {
			return 0;
		}else  {
			if(n==2) {
				return 1;
			}else {
				return getfibonacci(n-1)+getfibonacci(n-2);}
		}
	}
	
	static Scanner entrada = new Scanner (System.in); 
	
	public static int getmultiplicacion(int a , int b) {
		
		if (b==1) {
			return a;
		}else {
			return a + getmultiplicacion(a , b - 1);
		}
	}
	
	public static int triangulop(int k , int n) {
		if (k == n || n == 0){
			return 1;
			
		}else {
			return triangulop(k-1,n-1) + triangulop(k-1, n);
		}
			
	}
	
	
	public static void main(String[] args) {
		
		int a , b ;
		System.out.println("El Factorial es: " + getfactorial(5));
		System.out.println(getfibonacci(20));
		System.out.println("Ingresar Primer Numero A Multiplicar : ");
		a = entrada.nextInt();
		System.out.println("Ingresar Segundo Numero A Multiplicar : ");
		b = entrada.nextInt();
		System.out.println("La Multiplicacion Entre Los Dos Numeros Es : " + getmultiplicacion(a,b));
		
		int triangulo[][] = new int [20][20];
		for ( int i = 0 ; i < 20 ; i++ ) {
			for (int j = 0 ; j<=i ; j++) {
				triangulo[i][j] = triangulop(i , j);
			}
		}
		for (int i = 0 ; i < 20 ; i++ ) {
			for (int j = 0 ; j <= i ; j++ ) {
				System.out.print(triangulo[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

	

}
