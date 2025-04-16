import java.util.Objects;
import java.util.Scanner;
import java.time.LocalDate;

// Bot que haga calculos aritmeticos, Cambio de unidades y hable mediante ciertos comandos
public class Bot {
    /* Prueba 1
    public static void Operaciones(int num1, int num2, int num1res, int num2res, int num1mul, int num2mul, int num1div, int num2div){
        int suma = num1+num2;
        int resta = num1res-num2res;
        int multi = num1mul*num2mul;
        int divi = num1div/num2div;
        int resto = num1div%num2div;
    }
     */
    public static void Operaciones(int num1, int num2) {
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int divi = num2 != 0 ? num1 / num2 : 0; // division entre 0 no
        int resto = num2 != 0 ? num1 % num2 : 0; // resto entre 0 no

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multi);
        System.out.println("La división es: " + divi);
        System.out.println("El resto es: " + resto);
    }
    public static void CambioUnidades(int valor, int tipo) {
        switch (tipo) {
            case 1: // Kilómetros a metros
                System.out.println(valor + " km son " + (valor * 1000) + " m");
                break;
            case 2: // Metros a kilómetros
                System.out.println(valor + " m son " + (valor / 1000.0) + " km");
                break;
            case 3: // Celsius a Fahrenheit
                System.out.println(valor + " °C son " + ((valor * 9 / 5) + 32) + " °F");
                break;
            case 4: // Fahrenheit a Celsius
                System.out.println(valor + " °F son " + ((valor - 32) * 5 / 9) + " °C");
                break;
            default:
                System.out.println("Tipo de conversión no válido.");
        }
    }

    public static void Comandos(String o){
        System.out.println("1.Hola\n2.Fecha");
    }

    //Main Class
    public static void main(String[] args){
        while (true){
            Scanner n = new Scanner(System.in);
            System.out.println("1.Operaciones Aritmeticas\n2.Cambio de unidades\n3.Hablar\n4.Salir");
            System.out.print("Selecciona una opcion: ");
            int opc = n.nextInt();
            if(opc == 1){
                System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
                System.out.print("¿Que operacion desea realizar?: ");
                int op = n.nextInt();
                /* Prueba
                switch (op){
                    case 1:
                        System.out.print("Introduce un numero: ");
                        int num1 = n.nextInt();
                        System.out.print("Introduce otro numero: ");
                        int num2 = n.nextInt();
                        Operaciones(num1, num2);
                        System.out.print("La suma es: ", suma);
                    case 2:
                        System.out.print("Introduce un numero: ");
                        int num1res = n.nextInt();
                        System.out.print("Introduce otro numero: ");
                        int num2res = n.nextInt();
                        Operaciones(num1res, num2res);
                        //Resta
                    case 3:
                        System.out.print("Introduce un numero: ");
                        int num1mul = n.nextInt();
                        System.out.print("Introduce otro numero: ");
                        int num2mul = n.nextInt();
                        Operaciones(num1mul, num2mul);
                        //multi
                    case 4:
                        System.out.print("Introduce un numero: ");
                        int num1div = n.nextInt();
                        System.out.print("Introduce otro numero: ");
                        int num2div = n.nextInt();
                        Operaciones(num1div, num2div);
                        //divi
                        //resto divi
                    case 5:
                        System.out.print("Saliendo del programa...");
                        break;
                }
                 */
                switch (op) {
                    case 1:
                        System.out.print("Introduce un número: ");
                        int num1 = n.nextInt();
                        System.out.print("Introduce otro número: ");
                        int num2 = n.nextInt();
                        Operaciones(num1, num2);
                        break;

                    case 2:
                        System.out.print("Introduce un número: ");
                        int num1res = n.nextInt();
                        System.out.print("Introduce otro número: ");
                        int num2res = n.nextInt();
                        Operaciones(num1res, num2res);
                        break;

                    case 3:
                        System.out.print("Introduce un número: ");
                        int num1mul = n.nextInt();
                        System.out.print("Introduce otro número: ");
                        int num2mul = n.nextInt();
                        Operaciones(num1mul, num2mul);
                        break;

                    case 4:
                        System.out.print("Introduce un número: ");
                        int num1div = n.nextInt();
                        System.out.print("Introduce otro número: ");
                        int num2div = n.nextInt();
                        Operaciones(num1div, num2div);
                        break;

                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } else if(opc == 2){
                System.out.println("1.KM a M\n2.M a KM\n3.Celsius a Farenheit\n4.Farenheit a Celsius\n5.Salir");
                System.out.print("Selecciona una opcion: ");
                int op = n.nextInt();
                switch (op){
                    case 1:
                        System.out.print("Introduce el número de KM: ");
                        int km = n.nextInt();
                        CambioUnidades(km, 1);
                    case 2:
                        System.out.print("Introduce el número de M: ");
                        int m = n.nextInt();
                        CambioUnidades(m, 2);
                    case 3:
                        System.out.print("Introduce el número de Grados Celsius: ");
                        int c = n.nextInt();
                        CambioUnidades(c, 3);
                    case 4:
                        System.out.print("Introduce el número de Grados Fahrenheit: ");
                        int f = n.nextInt();
                        CambioUnidades(f, 4);
                    case 5:
                        System.out.print("Saliendo del programa...");
                        break;
                }
            } else if(opc == 3){
                System.out.print("¿Deseas ver los comandos que funcionan?: ");
                String o = n.next();
                if(Objects.equals(o, "Si") || Objects.equals(o, "si")){
                    Comandos(o);
                }
                System.out.print("Preguntale algo al bot: ");
                String ask = n.next();
                if(Objects.equals(ask, "Hola") || Objects.equals(ask, "hola")){
                    System.out.println("Hola :3");
                } else if(Objects.equals(ask, "Fecha") || Objects.equals(ask, "fecha")){
                    LocalDate fecha = LocalDate.now();
                    System.out.println(fecha);
                }
            } else if(opc == 4){
                System.out.print("Saliendo del programa...");
                break;
            } // End if Opc
        } // End While
    }
}
