public class QuickSort {
    // QuickSort é in-place mas não é estavel.
    // Desempenho: Θ(n*logn) mas no pior caso é O(n^2) e nesse sentido ele perde para o MergeSort.

    /* O algoritmo do QuickSort trabalha com quebrar o array em varios pedaços até ter apenas 1 elemento.
    * Mas diferente do Merge, essa quebra é aleatória, através da escolha do pivô.
    * Assim o algoritmo tem duas partes: 
    * Particionamento - escolher o pivô e inserir na posição correta do array.
    * Repetir isso até todos estarem estarem na posição correta.
    */

    public static void quickSort(int[] valores) {
        if(valores != null)
        quickSort(valores, 0, valores.length - 1);
    }

    public static void quickSort(int[] array, int inicio, int fim){
        if(inicio < fim){
            int pivot = escolhePivo(array, inicio, fim);

            quickSort(array, inicio, pivot - 1);
            quickSort(array, pivot + 1, fim);
        }
    }

    private static int escolhePivo(int[] array, int inicio, int fim) {
        int pivot = array[inicio];
        int i = inicio;  //Esse é o indice do ultimo elemento menor ou igual ao pivo

        for (int j = inicio + 1; j <= fim; j++) {
            if(array[j] <= pivot) {
                i++;                       //Achamos um elemento menor ou igual, então vamos pro espaço ao lado.
                swap(array, i, j);
            }
        }
        swap(array, inicio, i);              //Achamos todos os menores, então a ultima posição naturalmente
        return i;                          // é onde o pivô deveria estar inserido, trocamos e dizemos que
                                           // essa posição já está ordenada.
    }

    private static void swap(int[] valores, int j, int i) {
        int aux = valores[i];
          valores[i] = valores[j];
          valores[j] = aux;
      }
}
