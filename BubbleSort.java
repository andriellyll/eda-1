// Algoritmo de ordenação mais simples. Carrega o maior elemento para o final da sequência (em cada iteração )..
// In place, estável, e péssimo na prática por fazer muita comparação e muitas trocas.

import java.util.Arrays;

class BubbleSort {
public static void main(String[] args) {
    int[] numeros = {7, 1, 8, 3, 6, 3, 5};
    bubbleSort(numeros)
    System.out.println(Arrays.toString(numeros));
    //Saída: [1,3,3,5,6,7,8]. É um algoritmo estável portanto a ordem dos 3s foi preservada. 
  }


  public static void bubbleSort(int[] v) {
    int ultimoOrdenado  = v.length - 1;
    boolean troca = true;
    
    while (troca) {  
      for (int i = 0; i <= ultimoOrdenado - 1; i++) { 
      //Percorre a sequência do começo ao último elemento ordenado diversas vezes.
        
       troca = false;
        
       if (v[i + 1] < v[i]) { //Se o próximo elemento é menor que o atual: troca.
          int aux = v[i + 1];
          v[i + 1] = v[i];
          v[i] = aux;
          troca = true;
        }
      }
      ultimoOrdenado = ultimoOrdenado - 1;
    }
  }
}
