public class Seleccion {

    public static void ordenar(int[] arreglo, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0, cambios = 0;
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int aux = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if ((ascendente && arreglo[j] < arreglo[aux]) || (!ascendente && arreglo[j] > arreglo[aux])) {
                    aux = j;
                }
            }
            if (aux != i) {
                int a = arreglo[i];
                arreglo[i] = arreglo[aux];
                arreglo[aux] = a;
                cambios++;
                if (mostrarPasos) {
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
