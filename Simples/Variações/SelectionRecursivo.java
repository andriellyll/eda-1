package Variações;
/* A principal mudança nesse algoritmo para a versão iterativa é que nesse o método controla os indices
* Por tanto usamos o while, apenas verificamos se a condição é verdadeira e chama o método novamente.
*/

class SelectionRecursivo {

    public static void selectionSort(int[] valores) {

        if (valores != null) {
            selectionRecursivo(valores, 0, valores.length - 1);
        }
    }
    
    private static void selectionRecursivo(int[] valores, int i, int tamanhoArray) {   
        if (i < tamanhoArray) {
          int minIndice = i;
    
          for (int j = i + 1; j < valores.length; j++){
              if( valores[j] < valores[minIndice]) { 
                 minIndice = j;
            }    
          }
    
          swap(valores, minIndice, i);
          selectionRecursivo(valores, i++, tamanhoArray);
        }
    }

    private static void swap(int[] v, int j, int i) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
    
}
