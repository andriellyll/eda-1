// Insertion Sort é estável e in-place que possui melhor desempenho que Selection e Bubble Sort.

  public static void InsertionSort(int[] v) {

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
