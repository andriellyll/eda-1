package dividirConquistar;
import java.util.Arrays;
//MergeSort é um algoritmo é estavél mas não é in-place (usa memória auxiliar do tamanho da entrada)
//Desempenho: O(n*log(n)), ele é o mais veloz dentre os algoritmos de comparação porque também é Θ(n∗logn)

/* Esse algoritmo recursivo trabalha com indice para quebrar o array (porque quebrar de verdade, custa muito no desempenho)
*  no mergeSort ele divide o array em partes menores, sempre no MEIO, em seguida une (ou "conquista") no merge.
*  Por sempre quebrar no meio, pior caso e melhor caso seguem as mesma instruções, o desempenho é fixo em n*logn.
*/
public class MergeSort {

    public static void mergeSort(int[] valores) {
        if(valores != null)
        mergeSort(valores, 0, valores.length - 1);
    }

    public static void mergeSort(int[] array, int inicio, int fim) {
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
		
		//Compara entre a primeira e a segunda metade do array, até uma das partes ser totalmente inserida.
		while(i <= meio && j <= fim) {
			if(copy[i]  <= copy[j]) {
				array[k] = copy[i];
				i++;
			} else {
				array[k] = copy[j];
				j++;
			}
			
			k++;
		}
		//Se ainda faltar elementos da primeira parte para adicionar, adicione.
		while (i <= meio) {
			array[k] = copy[i];
			k++;
			i++;
		}
		//Se faltou elementos segunda parte, adicione.
		while(j <= fim) {
			array[k] = copy[j];
			k++;
			j++;
		}
		
    }
}
