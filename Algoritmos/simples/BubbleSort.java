package simples;
// Algoritmo de ordenacao mais simples. Carrega o maior elemento para o final da sequencia (em cada iteracao ).
// In place, estavel, e pessimo na pratica por fazer muita comparacoes e muitas trocas.
// Desempenho: O(n^2)

import interfaces.Implementacao;

public class BubbleSort implements Implementacao{

  public void Sort(int[] v) {
	  if(testeDeEntrada(v)) {
		  return;
	  }
    int ultimoOrdenado  = v.length - 1;
    while (0 < ultimoOrdenado) {  
      //Percorre a sequencia do comeco ao ultimo elemento ordenado diversas vezes.
      for (int i = 0; i <= ultimoOrdenado - 1; i++) { 

        //Se o proximo elemento for menor que o atual: troca. 
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
  
  public  boolean testeDeEntrada(int[] v) {
	  if(v == null) {
		  return true;
	  }else if(v.length == 0) {
		  return true;
	  }
	  
	  return false;
  }
  
}
