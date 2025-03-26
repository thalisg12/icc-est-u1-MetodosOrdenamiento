public class MetodoBurbuja {
    public void ordenar(int[] arreglo, boolean isDes) {
        if (isDes == true) {
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = i + 1; j < arreglo.length; j++) {
                    // System.out.println("i="+i+" j= "+ j);
                    if (arreglo[i] > arreglo[j]) {
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
            }
        } else {
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = i + 1; j < arreglo.length; j++) {
                    // System.out.println("i="+i+" j= "+ j);
                    if (arreglo[i] < arreglo[j]) {
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
            }
        }
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i += 1) {

            System.out.print(arreglo[i] + "- ");
        }
    }
}