import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();

        int opcion = 0;
        while (opcion != 9) {
            System.out.println("********** MENU **********");
            System.out.println("1. Ingresar un carro al parqueadero");
            System.out.println("2. Dar salida a un carro del parqueadero");
            System.out.println("3. Informar los ingresos del parqueadero");
            System.out.println("4. Consultar la cantidad de puestos disponibles");
            System.out.println("5. Avanzar el reloj del parqueadero");
            System.out.println("6. Cambiar la tarifa del parqueadero");
            System.out.println("7. Modificar el tiempo del parqueadero");
            System.out.println("8. Salir");
            System.out.println("***************************");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la placa del carro: ");
                    String placa = scanner.next();
                    System.out.print("Ingrese la hora de llegada: ");
                    int horaLlegada = scanner.nextInt();
                    int resultadoIngreso = parqueadero.entrarCarro(placa);
                    String mensajeIngreso = obtenerMensajeResultado(resultadoIngreso);
                    System.out.println(mensajeIngreso);
                    break;

                case 2:
                    System.out.print("Ingrese la placa del carro a sacar: ");
                    String placaSalida = scanner.next();
                    int resultadoSalida = parqueadero.sacarCarro(placaSalida);
                    String mensajeSalida = obtenerMensajeResultado(resultadoSalida);
                    System.out.println(mensajeSalida);
                    break;

                case 3:
                    int ingresos = parqueadero.darMontoCaja();
                    System.out.println("Los ingresos del parqueadero son: " + ingresos);
                    break;

                case 4:
                    int puestosDisponibles = parqueadero.calcularPuestosLibres();
                    System.out.println("La cantidad de puestos disponibles es: " + puestosDisponibles);
                    break;

                case 5:
                    parqueadero.avanzarHora();
                    System.out.println("El reloj del parqueadero ha sido avanzado");
                    break;

                case 6:
                    System.out.print("Ingrese la nueva tarifa del parqueadero: ");
                    int nuevaTarifa = scanner.nextInt();
                    parqueadero.cambiarTarifa(nuevaTarifa);
                    System.out.println("La tarifa del parqueadero ha sido cambiada");
                    break;

                case 7:
                    System.out.print("Ingrese la nueva hora del parqueadero: ");
                    int avanzarHora = scanner.nextInt();
                    parqueadero.avanzarHora();
                    System.out.println("La hora del parqueadero ha sido modificada");
                    break;

                case 8:
                    System.out.print("Ingrese la nueva hora del parqueadero: ");
                    int avanzarHora = scanner.nextInt();
                    parqueadero.avanzarHora();
                    System.out.println("La hora del parqueadero ha sido modificada");
                    break;

                case 9:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }

    private static String obtenerMensajeResultado(int resultado) {
        switch (resultado) {
            case 1:
                return "El carro ha sido ingresado exitosamente al parqueadero";
            case -1:
                return "No hay puestos disponibles en el parqueadero";
            case -2:
                return "El carro ya se encuentra en el parqueadero";
            case -3:
                return "El parqueadero está cerrado";
            case 0:
                return "El carro ha salido exitosamente del parqueadero";
            case -4:
                return "El carro no se encuentra en el parqueadero";
            default:
                return "Resultado desconocido";
        }
    }
}
