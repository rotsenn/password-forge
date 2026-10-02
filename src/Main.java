import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            mostrarMenu();
            option = leerOpcion(scanner);

            switch (option) {
                case 1 -> System.out.println("Generar pendiente");
                case 2 -> System.out.println("Evaluar: pendiente");
                case 3 -> System.out.println("Hasta luego");
                default -> System.out.println("Opción incorrecta");
            }
        } while (option != 3);
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("""
            Elige una opción - Digita: 
            1. Generar.
            2. Evaluar.
            3. Salir.
        """);
    }

    public static int leerOpcion(Scanner scanner) {
        System.out.print("Opción: ");
        int opcionLeida = scanner.nextInt();
        return opcionLeida;
    }
}