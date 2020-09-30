// Algoritmo de ordenação mais simples. Carrega o maior elemento para o final da sequência (em cada iteração ).
// In place, estável, e péssimo na prática por fazer muita comparação e muitas trocas.
// Desempenho: O(n^2)


class BubbleSort {

  public static void bubbleSort(int[] v) {
    int ultimoOrdenado  = v.length - 1;
    while (0 < ultimoOrdenado) {  
      //Percorre a sequência do começo ao último elemento ordenado diversas vezes.
      for (int i = 0; i <= ultimoOrdenado - 1; i++) { 

        //Se o próximo elemento é menor que o atual: troca. 
          if (v[i + 1] < v[i]) { 
            swap(v, i, i + 1);
          } 
      }
      ultimoOrdenado--;
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
