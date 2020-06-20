public class InsertionSort {
	// Insertion Sort é estável e in-place que possui melhor desempenho que Selection e Bubble Sort.
  
    public static void main(String[] args) {
    int[] valores = {9, 5, 3, 7, 6, 2, 3, 2, 4, 1};
    insertionSort(valores);
    System.out.println(java.util.Arrays.toString(valores)); //Saida: [1,2,2,3,3,4,5,6,7,9]
    }

    public static void insertionSort(int[] v) {

	for (int j = 1; j < v.length; j++) { //Assumindo que o primeiro elemento(v[0]) está ordenado, compara a partir do segundo. 
		int chave = v[j]; // chave é o elemento que está sendo extraído.
		int i = j - 1;
	       //Intera sobre todos os elementos já ordenados 
		while ((i >= 0)&&(v[i] > chave)) {
			v[i+1] = v[i]; // Move todos maiores que chave à direita
			i--;
		}
	      v[i+1] =chave;
	   }
	}
}
