import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ordenamiento ordenamiento = new Ordenamiento();
        Busqueda busqueda = new Busqueda();
        
        int[] arreglo = null;
        int opcion;

        do {
            System.out.println("\n---- MENÚ ----");
            System.out.println("1. Generar arreglo aleatorio (20 números)");
            System.out.println("2. Ordenar arreglo (Quicksort)");
            System.out.println("3. Buscar número (Búsqueda Binaria)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    arreglo = new int[20];
                    System.out.println("Lista original:");
                    for (int i = 0; i < arreglo.length; i++) {
                        arreglo[i] = (int) (Math.random() * 50 + 1);
                    }
                    imprimirArreglo(arreglo);
                    break;
                    
                case 2:
                    if (arreglo != null) {
                        ordenamiento.quicksort(arreglo, 0, arreglo.length - 1);
                        System.out.println("Arreglo ordenado:");
                        imprimirArreglo(arreglo);
                    } else {
                        System.out.println("Por favor, genere el arreglo primero (Opción 1).");
                    }
                    break;
                    
                case 3:
                    if (arreglo != null) {
                        System.out.print("Ingrese el número que desea buscar: ");
                        int numeroBuscado = sc.nextInt();
                        int indice = busqueda.binaria(arreglo, numeroBuscado, 0, arreglo.length - 1);
                        
                        if (indice != -1) {
                            System.out.println("Número encontrado en la posición " + indice);
                            
                            int mitad = arreglo.length / 2;
                            if (indice < mitad) {
                                System.out.println("El número se encuentra en el lado IZQUIERDO del arreglo.");
                            } else {
                                System.out.println("El número se encuentra en el lado DERECHO del arreglo.");
                            }
                        } else {
                            System.out.println("El número no se encuentra en el arreglo.");
                        }
                    } else {
                        System.out.println("Por favor, genere y ordene el arreglo primero.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
        
        sc.close();
    }

    
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}