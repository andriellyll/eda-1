public class SelectionSort {

	// Selection Sort **seleciona** o menor elemento e o coloca na primeira posição.
	// E repete esse processo até o final da sequência.
  
    public static void main(String[] args) {
    int[] valores = {9, 5, 3, 7, 6, 2, 3, 2, 4, 1};
    int[] ordenaValores = selectionSort(valores);
    System.out.println(java.util.Arrays.toString(ordenaValores)); //Saida: [1,2,2,3,3,4,5,6,7,9]
    
    //Esse não é um algoritmo estável, portanto os elementos repetidos não mantiveram a ordem (necessariamente).
  }
  
  public static int[] selectionSort(int[] valores) {
    
    int aux;
    int i = 0;
    
    
    while (i < valores.length - 1) {
      int minIndice = i;     //O primeiro elemento não ordenado é atribuido como o mínimo
      for (int j = i + 1; j < valores.length; j++){
        
          if( valores[j] < valores[minIndice]) { 
             //Se o elemento v[j] for menor que o mínimo, então o valor do minimo muda para j.
             minIndice = j;
        }    
      }
      // Por fim, troca a posição dos valores e vai para o proximo elemento.
      aux = valores[i];
      valores[i] = valores[minIndice];
      valores[minIndice] = aux;
      i++;
    }
    return valores;
  } 
}
