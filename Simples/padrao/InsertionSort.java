package padrao;
public class InsertionSort {
	// Insertion Sort é estável e in-place
	// Possui melhor desempenho que Selection e Bubble Sort para pequenas entradas.
	// Desempenho: O(n^2)

	/*O maior diferencial do Insertion Sort é que ele não precisa interar sobre todo o
	* vetor n vezes, em todas as iterações. Assim que ele acha a posição do elemento no
	* array, ele para.
	*/

    public static void insertionSort(int[] v) {

		for (int j = 1; j < v.length; j++) { //Assumindo que o primeiro elemento(v[0]) está ordenado, compara a partir do segundo. 
			int chave = v[j]; // chave é o elemento que está sendo extraído.
			int i = j - 1;
			
			//Intera sobre todos os elementos já ordenados 
			while ((i >= 0) && (v[i] > chave)) {
				v[i+1] = v[i]; // Move todos maiores que chave à direita
				i--;
			}
			v[i+1] = chave;
		}
	}
}
