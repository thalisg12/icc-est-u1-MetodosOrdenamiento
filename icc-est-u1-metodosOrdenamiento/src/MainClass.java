public class MainClass {
    public static void main(String[] args) {
        int[] arregloListado = { 64, 25, 12, 22, 11 };

        // METODO SELECCION
        System.out.println("METODO SELECCION");
        System.out.print("Arreglo Original: ");
        MetodoSeleccion metodoSeleccion = new MetodoSeleccion();
        metodoSeleccion.printArray(arregloListado);

        metodoSeleccion.ordenarAscendente(arregloListado);
        System.out.print("Arreglo Ordenado Ascendente: ");
        metodoSeleccion.printArray(arregloListado);

        metodoSeleccion.ordenar(arregloListado, false);
        System.out.print("Arreglo Ordenado Descendente: ");
        metodoSeleccion.printArray(arregloListado);

        // METODO INSERCION
        System.out.println("\nMETODO INSERCION");
        System.out.print("Arreglo Original: ");
        MetodoInsercion metodoInsercion = new MetodoInsercion();
        metodoInsercion.mostrarArreglo(arregloListado);

        System.out.println("\nArreglo Ordenado con Pasos:");
        metodoInsercion.insertionSort(arregloListado);

        // METODO BURBUJA
        System.out.println("\nMETODO BURBUJA");
        System.out.print("Arreglo Original: ");
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja();
        metodoBurbuja.imprimirArreglo(arregloListado);

        metodoBurbuja.ordenar(arregloListado, true);
        System.out.print("\nArreglo Ordenado Ascendente: ");
        metodoBurbuja.imprimirArreglo(arregloListado);

        metodoBurbuja.ordenar(arregloListado, false);
        System.out.print("\nArreglo Ordenado Descendente: ");
        metodoBurbuja.imprimirArreglo(arregloListado);
    }
}