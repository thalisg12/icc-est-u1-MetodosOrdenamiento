public class MetodoInsercion {

    public void insertionSort(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            System.out.println("\nEstado actual del arreglo:");
            mostrarArreglo(arreglo);
            System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            System.out.println("Compara aux" + aux + " en la posición " + j);

            while (j >= 0 && arreglo[j] > aux) {
                arreglo[j + 1] = arreglo[j];
                System.out.println("Mueve arreglo[" + j + "] a arreglo[" + (j + 1) + "]");
                j--;
            }
            arreglo[j + 1] = aux;
            System.out.println("Inserta aux" + aux + " en la posición " + (j + 1) + "\n");

            System.out.println("Estado actual del arreglo:");
            mostrarArreglo(arreglo);
        }
    }

    public void mostrarArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}

