package recursivos;

public class InsertionRecursivo {

    public static void insertionSort(int[] valores) {

        if (valores != null) {
            insertionRecursivo(valores, 0, valores.length - 1);
        }
    }
    
    public static void insertionRecursivo(int[] valores, int indiceInicial, int tamanhoArray) {
        int j = indiceInicial + 1;
		if(indiceInicial < tamanhoArray) {
			while ((j > 0) && ( valores[j] < valores[j - 1])) {
				
				swap(valores, j, j - 1);
                j--;
                
			}
			insertionRecursivo(valores, indiceInicial + 1, tamanhoArray);
		}
    }

    private static void swap(int[] v, int j, int i) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
