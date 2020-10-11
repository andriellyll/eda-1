package linear;

public class CountingSort {
    //O algoritmo do Counting Sort é O(n), mais veloz que qualquer algoritmo por comparação
    
    public static void sort(int[] array, int leftIndex, int rightIndex) {
        boolean valido = (leftIndex >= 0 && rightIndex < array.length && leftIndex < rightIndex && array != null);
        
        if(valido) {
            
            int maximum = findMaximum(array, leftIndex, rightIndex);
            
            countingSort(array, leftIndex, rightIndex, maximum);
            
        }	
    }
    
    private static void countingSort(int[] array, int leftIndex, int rightIndex, int maximum) {
        int[] contador = new int[maximum+ 1];
        
        for (int i = leftIndex; i <= rightIndex; i++) {
            contador[array[i]]++; // Em contador, para cada indice que coincide com o elemento,
                                  // é adicionado mais 1.
        }
        
        for (int i = 1; i < contador.length; i++) {
            contador[i] += contador[i - 1]; //Soma cumulativa dos elementos do array
        }
        
        int[] aux = new int[rightIndex - leftIndex + 1]; //Array auxiliar que vamos inserir ordenado
        
        for (int i = rightIndex; i >= leftIndex; i--) {
            aux[contador[array[i]] - 1] = array[i]; //Contador vai dizer quantos elementos menores ou iguais a
                                                    //array[i] existem e esse numero - 1 vai ser onde vamos inserir
                                                    //o elemento
            contador[array[i] ]--;                  //Diminuimos a quantidade de numeros menores ou iguais a array[i] não ordenados
        }
        
        populate(array, aux, leftIndex, rightIndex);
        
    }
    
    private static int findMaximum(int[] array, int leftIndex, int rightIndex) {
        int maximum = array[leftIndex];
        for (int i = leftIndex; i <= rightIndex; i++) {
            if(array[i] > (maximum))
                maximum = array[i];
        }
        
        return maximum;
    }
    
    private static void populate(int[] array, int[] aux, int leftIndex, int rightIndex) {
        for (int i = leftIndex; i <= rightIndex; i++)
            array[i] = aux[i - leftIndex];	
    }
}
