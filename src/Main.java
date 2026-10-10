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
                case 2 -> {
                    System.out.println("Evaluar: pendiente");
                    
                    String contrasenia = leerContrasenia(scanner);

                    if (tieneNumero(contrasenia)) {
                        System.out.println("Contraseña: " + "*****" + " --> Cumple!!");
                    } else {
                        System.out.println("Contraseña: " + "*****" + " --> No Cumple!!");
                    }
                }
                case 3 -> System.out.println("Hasta luego!");
                default -> System.out.println("Opción incorrecta");
            }
            System.out.println();
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
        int opcionLeida = 0;
        System.out.print("Opción: ");

        if (scanner.hasNextInt()) {
            opcionLeida = scanner.nextInt();
            System.out.println("Se ha ingresado la opción: " + opcionLeida);
        } else {
            scanner.next();
        }
        scanner.nextLine();
        return opcionLeida;

    }

    public static String leerContrasenia(Scanner scanner) {
        System.out.print("Contraseña: ");

        String contraseniaIn = scanner.nextLine();

        return contraseniaIn;
    }

    public static boolean tieneNumero(String contrasenia) {
        for (int i = 0; i < contrasenia.length(); i++) {
            char digito = contrasenia.charAt(i);
            
            if (Character.isDigit(digito)) {
                return true;
            }
        }
        return false; 
    }

    public static boolean tieneMayuscula(String contrasenia) { return true ; }

    public static boolean tieneSimbolo(String contrasenia) { return true ; }

    public static boolean hasLenMin(String contrasenia) { return true ; }

}