public class Insercion {

    public static void ordenar(int[] arreglo, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0, cambios = 0;
        int n = arreglo.length;

        for (int i = 1; i < n; i++) {
            int key = arreglo[i];
            int j = i - 1;

            while (j >= 0 && ((ascendente && arreglo[j] > key) || (!ascendente && arreglo[j] < key))) {
                comparaciones++;
                System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + " > " + key);
                arreglo[j + 1] = arreglo[j];
                j--;
                cambios++;

                if (mostrarPasos) {
                    mostrarEstado(arreglo, comparaciones, cambios);
                }
            }
            arreglo[j + 1] = key;
            if (j != i - 1) {
                cambios++;
                if (mostrarPasos) {
                    System.out.println("Intercambio: " + arreglo[j + 1] + " <-> " + key);
                    mostrarEstado(arreglo, comparaciones, cambios);
                }
            }
        }

        mostrarResultado(arreglo, comparaciones, cambios);
    }

    private static void mostrarEstado(int[] arreglo, int comparaciones, int cambios) {
        System.out.print("Estado actual -> ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void mostrarResultado(int[] arreglo, int comparaciones, int cambios) {
        System.out.println("--FIN DEL METODO--");
        System.out.print("Arreglo ordenado-> ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }
}
