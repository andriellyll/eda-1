package linear;

public class ExtendedCountingSort {
    //Semelhante ao Counting Sort porém esse ordena também números negativos
    //O algoritmo do Extended Counting Sort é O(n), mais veloz que qualquer algoritmo por comparação
    
    public static void sort(int[] array, int leftIndex, int rightIndex) {
		boolean valido = (leftIndex >= 0 && rightIndex < array.length && leftIndex < rightIndex);
		
		if(valido) {
			
			int maximum = findMaximum(array, leftIndex, rightIndex);
			int minimum = findMinimum(array,leftIndex, rightIndex);
			
			extendedCountingSort(array, leftIndex, rightIndex, maximum, minimum);
			
		}	
	}


	private static void extendedCountingSort(int[] array, int leftIndex, int rightIndex, int maximum, int minimum) {
		int[] contador = new int[maximum - minimum + 1];
		
		for (int i = leftIndex; i <= rightIndex; i++) {
            contador[array[i] - minimum]++; // Em contador, para cada indice que coincide com o elemento + |minimo|,
                                            // é adicionado mais 1.
		}
		
		for (int i = 1; i < contador.length; i++) {
			contador[i] += contador[i - 1]; //Soma cumulativa dos elementos do array
		}
		
		int[] aux = new int[rightIndex - leftIndex + 1]; //Array auxiliar que vamos inserir ordenado
		
		for (int i = rightIndex; i >= leftIndex; i--) {
            aux[contador[array[i] - minimum] - 1] = array[i]; //Contador vai dizer quantos elementos menores ou iguais a
                                                              //array[i] existem e esse numero - 1 vai ser onde vamos inserir
                                                              //o elemento
			contador[array[i] - minimum]--;                   //Diminuimos a quantidade de numeros menores ou iguais a array[i] não ordenados
		}
		
		populate(array, aux, leftIndex, rightIndex);
		
	}


	private static int findMaximum(int[] array, int leftIndex, int rightIndex) {
		int maximum = array[leftIndex];
		for (int i = leftIndex; i <= rightIndex; i++) {
			if(array[i] > maximum)
				maximum = array[i];
		}
		
		return maximum;
	}
	private static int findMinimum(int[] array, int leftIndex, int rightIndex) {
		int minimum = array[leftIndex];
		for (int i = leftIndex; i <= rightIndex; i++) {
			if(array[i] < (minimum))
				minimum = array[i];
		}
		return minimum;
	}

	
	private static void populate(int[] array, int[] aux, int leftIndex, int rightIndex) {
		for (int i = leftIndex; i <= rightIndex; i++)
			array[i] = aux[i - leftIndex];	
	}
}
