package recursivos;


public class BubbleRecursivo {

    public static void bubbleSort(int[] valores) {

        if (valores != null) {
            bubbleRecursivo(valores, 0, valores.length - 1);
        }
    }

    public static void bubbleRecursivo(int[] valores, int i, int j) {
        
        if (i < j) {  
          //Percorre a sequência do começo ao último elemento ordenado diversas vezes.
          for (int k = 0; k <= j - 1; k++) { 
    
            //Se o próximo elemento é menor que o atual: troca. 
              if (valores[k + 1] < valores[k]) { 
                swap(valores, k, k + 1);
              } 
          }
          bubbleRecursivo(valores, i, j--);
        }
      }
    
      private static void swap(int[] v, int i, int j) {
        if (v != null) {
          int aux = v[j];
          v[j] = v[i];
          v[i] = aux;
        }
      }
    
}
