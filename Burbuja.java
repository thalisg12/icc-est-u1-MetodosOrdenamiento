public class Burbuja {

    public static void ordenar(int[] arreglo, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0, cambios = 0;
        int n = arreglo.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                comparaciones++;
                System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + " > " + arreglo[j + 1]);
                if ((ascendente && arreglo[j] > arreglo[j + 1]) || (!ascendente && arreglo[j] < arreglo[j + 1])) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambios++;
                    intercambio = true;
                    if (mostrarPasos) {
                        System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                        mostrarEstado(arreglo, comparaciones, cambios);
                    }
                }
            }
            if (!intercambio) break;
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

