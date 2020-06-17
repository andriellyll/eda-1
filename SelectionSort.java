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
    
    
    while (i < valores.length) {
      int menor_indice = i;
      for (int j = i + 1; j < valores.length; j++){
        if( valores[j] < valores[menor_indice]) {
          
          aux = valores[menor_indice];
          valores[menor_indice] = valores[j];
          valores[j] = aux;
        
        }
      } 
      i++;
    }
    return valores;
  } 
}