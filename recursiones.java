import java.io.*;

/**
 * Codigos Recursivos en lenguaje de programacion java de : 
 * (1)M.C.D. Euclides
 * (2)Factorial
 * (3)Serie De Fibonacci
 * (4)Triangulo De Pascal
 * (5)Multiplicacion
 * (6)La inversa de una cadena de caracteres
 * @author ColocarSuNombre
 */
public class Recursiones_1 {

	/**
	 * Maximo Comun Divisor entre dos numero enteros positivos a y b, en donde se resta el mayor “a” con el menor “b”
	 * @param a
	 * @param b
	 * @return 
	 */
	public int mcd_euclides(int a, int b)
	{
		if (b==0)
			return a ;
		else
			return mcd_euclides(b, a % b);
		
	}
	
	
	/**
	 * Factorial De Un Numero 
	 * @param x
	 * @return Resultado Del Factorial 
	 */
	public int factorial(int x)
	{
		if(x == 1) {
			return 1;
		}	else {
			return x * factorial(x-1);
		}
	}
	
	
	/**
	 * Serie De Fibonacci
	 * @param x
	 * @return se suman de a 2, a partir de 0 y 1.
	 */
	public int fibonacci(int x)
	{
		if (x==1) {
			return 0;
		}else  {
			if(x==2) {
				return 1;
			}else {
				return fibonacci(x-1)+fibonacci(x-2);}
		}
	}
	
	

	/**
	 * Triangulo De Pascal
	 * @param n
	 * @param k
	 * @return Retorna La Secuencia Del triangulo De Pascal
	 */
	public int pascal(int k, int n)
	{
		if (k == n || n == 0){
			return 1;
			
		}else {
			return pascal(k-1,n-1) + pascal(k-1, n);
		}
	}
	
	
	/**
	 * Matriz que almacena cada digito del triangulo de pascal
	 * @return Imprime la secuencia en orden en piramide
	 */
	public String print_pascal()
	{
		String pascal_matrix = "";
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j <= i; j++)
				pascal_matrix += pascal(i, j) + "\t";
			
			pascal_matrix += "\n";
		}
		
		return pascal_matrix;
	}
	
	
	/**
	 * Multiplicacion Entre Dos Numeros
	 * @param n
	 * @param x
	 * @return Resultado del Producto De Dos Numeros
	 */
	public int multiplicacion(int n, int x)
	{
		if (x==1) {
			return n;
		}else {
			return n + multiplicacion(n , x - 1);
		}
	}
	
	
	/**
	 * Invierte Una serie de Cadenas De Caracteres
	 * @param cadena
	 * @return Retorna Una Serie De Caracteres de manera inversa
	 */
	public String inversa_cadena(String cadena)
	{
		if (cadena.length() <= 1)
			   return cadena;
		else 
			   return inversa_cadena(cadena.substring(1))+ cadena.charAt(0);
	}
		
	
	/**
	 * Imprime Resultados Para cada Una de las funciones en la consola  
	 * @param args
	 */
	public static void main(String[] args)
	{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
		Recursiones_1 recurrencias = new Recursiones_1();
	
		try
		{
			//Aca puede probar los resultados de sus recurrencias
			bw.write(recurrencias.factorial(15) + "\n"); // respuesta: 2004310016
			
			bw.write(recurrencias.fibonacci(25) + "\n"); // respuesta: 75025
			
			bw.write(recurrencias.multiplicacion(654, 97) + "\n"); // respuesta: 63438
			
			bw.write(recurrencias.mcd_euclides(369, 1218) + "\n"); // respuesta: 3
			
			bw.write(recurrencias.inversa_cadena("asdfghjkl") + "\n"); // respuesta: lkjhgfdsa
			
			bw.write(recurrencias.print_pascal() + "\n");
			/*
			 * 1	
			 * 1	1	
			 * 1	2	1	
			 * 1	3	3	1	
			 * 1	4	6	4	1	
			 * 1	5	10	10	5	1	
			 * 1	6	15	20	15	6	1	
			 * 1	7	21	35	35	21	7	1	
			 * 1	8	28	56	70	56	28	8	1	
			 * 1	9	36	84	126	126	84	36	9	1
			 */
			
			bw.flush();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
