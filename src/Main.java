import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            mostrarMenu();
            option = leerOpcion(scanner);

            System.out.println("Elegiste la opcion: " + option);
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