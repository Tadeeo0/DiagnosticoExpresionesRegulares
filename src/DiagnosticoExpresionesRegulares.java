import java.util.Scanner;

public class DiagnosticoExpresionesRegulares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regexIdentificador = "^[A-Za-z_][A-Za-z0-9_]*$";
        String regexEntero = "^[-+]?\\d+$";
        String regexBooleano = "^(True|False)$";

        String opcionStr;
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ DE PRUEBA DE REGEX ---");
            System.out.println("1. Probar Identificador");
            System.out.println("2. Probar Entero");
            System.out.println("3. Probar Booleano");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcionStr = sc.nextLine();
            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida (debe ser un número).");
                continue;
            }

            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Ingresa el texto a validar: ");
                String entrada = sc.nextLine();

                switch (opcion) {
                    case 1:
                        if (entrada.matches(regexIdentificador)) {
                            System.out.println("Es un Identificador válido.");
                        } else {
                            System.out.println("No es un Identificador válido.");
                        }
                        break;
                    case 2:
                        if (entrada.matches(regexEntero)) {
                            System.out.println("Es un Entero válido.");
                        } else {
                            System.out.println("No es un Entero válido.");
                        }
                        break;
                    case 3:
                        if (entrada.matches(regexBooleano)) {
                            System.out.println("Es un Booleano válido.");
                        } else {
                            System.out.println("No es un Booleano válido.");
                        }
                        break;
                }
            } else if (opcion != 4) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
