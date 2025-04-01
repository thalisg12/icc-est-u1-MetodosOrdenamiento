import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8};
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Seleccione el método de ordenamiento:");
            System.out.println("1. Burbuja");
            System.out.println("2. Selección");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");
            
            int opcion = scanner.nextInt();
            if (opcion == 5) break;
            
            System.out.println("¿Desea ver los pasos? (true/false):");
            boolean mostrarPasos = scanner.nextBoolean();
            
            System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?:");
            char orden = scanner.next().charAt(0);
            boolean ascendente = (orden == 'A' || orden == 'a');
            
            int[] arregloOriginal = arreglo.clone();  
            switch (opcion) {
                case 1:
                    Burbuja.ordenar(arregloOriginal, ascendente, mostrarPasos);
                    break;
                case 2:
                    Seleccion.ordenar(arregloOriginal, ascendente, mostrarPasos);
                    break;
                case 3:
                    Insercion.ordenar(arregloOriginal, ascendente, mostrarPasos);
                    break;
                case 4:
                    BurbujaMejorada.ordenar(arregloOriginal, ascendente, mostrarPasos);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        
        scanner.close();
    }
}
