public class BubbleSort 
{
    static void BubbleSort1 ( int [] array )
	{
		for ( int i = 0 ; i < array.length - 1 ; i ++ )
		{
			boolean swapped = false;
			for ( int j = 0 ; j < array.length - 1 ; j++ )
			{
				if (array[j] > array[j + 1])
				{
					int swap = array [j];
					array [j] = array [j + 1];
					array [j + 1] = swap;
					swapped = true;
				}
			}
			
			if (swapped == false) 
				break;
		}
	}
	
	static void imprimirArreglo ( int array[] , int tam)
	{
		for (int i = 0 ; i < tam; i++)
		
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		   int array [] = {64, 34, 25, 12, 22, 11, 90};
		   int arrayl = array.length;
		   BubbleSort1 (array);
		   System.out.println("sorteo arreglo :");
		   imprimirArreglo(array,arrayl);
		    
        } 
    

}

