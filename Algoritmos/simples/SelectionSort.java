package simples;
import interfaces.Implementacao;

public class SelectionSort implements Implementacao{
  //Selection sort é in-place e não é estável;
  //Desempenho: O(n^2)
  
    /*Esse algoritmo *seleciona* o menor elemento e o coloca na primeira posição.
    * Em seguida, repete esse processo até o final da sequência.
    */ 
  
  public void Sort(int[] valores) {
    int i = 0;
    
    while (i < valores.length - 1) {
      //O primeiro elemento não ordenado é atribuido como o mínimo
      int minIndice = i;

      for (int j = i + 1; j < valores.length; j++){
          if( valores[j] < valores[minIndice]) { 
             //Se o elemento v[j] for menor que o mínimo, então o valor do minimo muda para j.
             minIndice = j;
        }    
      }

      // Por fim, troca a posição dos valores e vai para o proximo elemento.
      swap(valores, minIndice, i);
      i++;
    }
  }

  private static void swap(int[] valores, int j, int i) {
    int aux = valores[i];
      valores[i] = valores[j];
      valores[j] = aux;
  }

  public boolean testeDeEntrada(int[] v) {
     if(v == null) {
        return true;
      }else if(v.length == 0) {
        return true;
      }
      
      return false;
  }
}
