import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] valores) {
        if(valores != null)
        mergeSort(valores, 0, valores.length - 1);
    }

    private static void mergeSort(int[] array, int inicio, int fim) {
        if(inicio < fim) {
			int meio = (inicio + fim)/2;
			
			mergeSort(array, inicio, meio);
			mergeSort(array, meio + 1, fim);
			
            merge(array, inicio, meio, fim);
		}
    }

    private static void merge(int[] array, int inicio, int meio, int fim) {
        int[] copy = Arrays.copyOf(array, array.length);
		
		int i = inicio;
		int j = meio + 1;
		
		int k = inicio;
		
		while(i <= meio && j <= fim) {
			if(copy[i]  >= copy[j]) {
				array[k] = copy[i];
				i++;
			} else {
				array[k] = copy[j];
				j++;
			}
			
			k++;
		}
		
		while (inicio <= meio) {
			array[k] = copy[i];
			k++;
			i++;
		}
		
		while(j <= fim) {
			array[k] = copy[j];
			k++;
			j++;
		}
		
    }
}
