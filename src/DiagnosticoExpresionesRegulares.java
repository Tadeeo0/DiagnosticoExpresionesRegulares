//Chavez Robles Maria Guadalupe
//Oliva Chavez Miguel Angel
//Tadeo Perez

import java.util.Scanner;

public class DiagnosticoExpresionesRegulares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regexIdentificador = "^[A-Za-z_][A-Za-z0-9_]*$"; // Identificadores
        String regexEntero = "^[-+]?\\d+$";                     // Enteros
        String regexBooleano = "^(True|False)$";                // Boleano
        String regexDecimal = "^[-+]?(\\d+\\.\\d+|\\d+\\.|\\.\\d+)$"; // Decimales
        String regexCadena = "^(['\"])(.*?)(\\1)$";                  // Cadenas
        String regexCaracter = "^(['\"]).(\\1)$";                    //Caracter


        String opcionStr;
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ DE PRUEBA DE REGEX ---");
            System.out.println("1. Probar Identificador");
            System.out.println("2. Probar Entero");
            System.out.println("3. Probar Booleano");
            System.out.println("4. Probar Decimal");
            System.out.println("5. Probar Cadena");
            System.out.println("6. Probar Caracter");
            System.out.println("7. Salir");
            System.out.print("Elige una opción:");


            opcionStr = sc.nextLine();
            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida (debe ser un número).");
                continue;
            }

            if (opcion >= 1 && opcion <= 6) {
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
                    case 4:
                        if (entrada.matches(regexDecimal)) {
                            System.out.println("Es un Decimal valido.");
                        }else{
                            System.out.println("No es una Decimal valido.");
                        }

                    case 5:
                        if (entrada.matches(regexCadena)) {
                            System.out.println("Es un Cadena valida.");
                            break;
                        }else{
                            System.out.println("No es una Cadena valida.");
                            break;
                        }
                    case 6:
                        if (entrada.matches(regexCaracter)) {
                            System.out.println("Es un Caracter valido.");
                            break;
                        }else {
                            System.out.println("No es una Caracter valido.");
                            break;

                        }
                }
            } else if (opcion != 7) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 7);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
