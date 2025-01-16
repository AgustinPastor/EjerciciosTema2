public class Ejercicios_WHILE_DOWHILE {

//EJERCICIOS WHILE-DO WHILE
    //Ejercicio 1
        /*
Leer números enteros hasta introducir un 0. El programa obtendrá la suma de todos
los números positivos. (SumarPositivos)

public static void main(String[] args) {
    System.out.println("Introduce un número:");
    Scanner scanner=new Scanner(System.in);
    int numero= scanner.nextInt();
    int sumarPositivos=0;

    if (numero>0){
        sumarPositivos+=numero;
    }
    while (numero!=0){
        System.out.println("Introduce un número:");
        numero= scanner.nextInt();
       if (numero>0){
        sumarPositivos+=numero;
       }
    }
        System.out.println("La suma de numeros positivos es: "+sumarPositivos);

}

     */
    //Ejercicio 2
        /*
        Calcúlese el mínimo común múltiplo de dos números entre 1 y 100. Para obtener el mcm se tomará uno de los
        valores introducidos y se irá multiplicando por 1, 2, 3, etc, hasta que el valor obtenido sea múltiplo del
        otro número, que sería el valor buscado. (MinimoComunMultiplo)


public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Introduce el primer numero:");
    int num1= scanner.nextInt();
    System.out.println("Introduce el segundo numero:");
    int num2= scanner.nextInt();

   if (num1<1 || num1>100 || num2<1 || num2>100 ) {
    System.out.println("Los números deben estar entre 1 y 100");
    return;
   }
   int mcm=num1;
   int multiplicador=1;

   while (mcm%num2!=0) {
       mcm = num1 * multiplicador;
       multiplicador++;
   }

    System.out.printf("El mcm entre %d y %d es %d",num1,num2,mcm);





}

         */
    //Ejercicio 3
        /*
    Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0. El programa mostrará cada uno de
    los datos generados y obtendrá el mayor de los números generados. (MayorNumero)


public static void main(String[] args) {
    int aleatorio;
    int max=0;

    do {
        aleatorio= (int) (Math.random()*101);
        System.out.println(aleatorio);
            if (aleatorio>max){
                max=aleatorio;
            }
   } while (aleatorio!=0);

        System.out.println("El maximo numero generado es "+max);

}

     */
    //Ejercicio 5
        /*
        Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en una variable.
        El sistema irá pidiendo números al usuario hasta que coincida con el aleatorio generado
        (en caso de no coincidir mostrará el mensaje "Lo siento, intentalo de nuevo").
        Cuando coincida el sistema deberá mostar el mensaje "Enhorabuena, has acertado el número en 5 intentos" (Adivina)


    public static void main(String[] args) {
        int aleatorio=(int)(Math.random()*21);
        int numero;
        int intentos=0;
        do {
            System.out.println("Intenta adivinar el número:");
            Scanner scanner=new Scanner(System.in);
            numero= scanner.nextInt();
            intentos++;
            if (aleatorio!=numero){
            System.out.println("Lo siento, intentalo de nuevo");
            }

        }while (aleatorio!=numero);

            System.out.printf("Enhorabuena, has acertado el número en %d intentos",intentos);

    }

         */
    //Ejercicio 6
        /*
    6. Modifica el ejercicio anterior para que una vez adivinado el número
    el sistema muestre el siguiente mensaje: "Quieres volver a jugar (S/N)":
        - En caso de introducir N la aplicación se detendrá
        - En caso de introducir S la aplicación empezará de nuevo
        (generando un aleatorio, pidiendo números hasta acertar el generado, etc...)
        Cuando el usuario acierte el número generado se mostrará un mensaje diciendo si ha superado el record
        de intentos (si ha hecho menos intentos que las veces anteriores) (AdivinaRecord)


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int aleatorio;
        int intentosAnteriores=1000;
        char respuesta;

        do {
        aleatorio=(int)(Math.random()*21);
        int numero;
        int intentos=0;
        System.out.println("Intenta adivinar el número:");
            do {
                System.out.println("Introduce un número:");
                numero= scanner.nextInt();
                intentos++;
                if (aleatorio!=numero){
                    System.out.println("Lo siento, intentalo de nuevo");
                }

            }while (aleatorio!=numero);

        System.out.printf("Enhorabuena, has acertado el número en %d intentos\n", intentos);

        if (intentos<intentosAnteriores){
            System.out.println("¡Nuevo récord! Lo has adivinado en menos intentos que la vez anterior.");
            intentosAnteriores=intentos;
        }
        System.out.print("Quieres volver a jugar(S/N):");
            respuesta=scanner.next().charAt(0);

        } while (respuesta == 'S' || respuesta == 's');


        System.out.println("Gracias por jugar.");
        System.out.println("Cerrando el programa...");



    }

         */
    //Ejercicio 7
        /*
        Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente formato
        - Bienvenido a la aplicación del menú - 1. Opción1 - 2. Opción2 - 3. Opción3 - 4. Opción4
        - 5. Salir - Introduce la opción seleccionada
        Una vez mostrado la última línea, el sistema esperará a que el usuario introduzca un dato.
        Dependiendo de la opción seleccionada aparecerá un mensaje por pantalla que ponga "La opción seleccionada es X".
        En el caso de meter una diferente pondrá "opción no contemplada".
        El programa se repetiría hasta que introduzca el 5 (MenuSimple)

    public static void main(String[] args) {

         int opcion=0;
         Scanner scanner=new Scanner(System.in);
        do {
                System.out.println("Bienvenido a la aplicación del menú:");
                System.out.println("\t1.Opción 1");
                System.out.println("\t2.Opción 2");
                System.out.println("\t3.Opción 3");
                System.out.println("\t4.Opción 4");
                System.out.println("\t5.Salir");
                System.out.print("Introduce la opción que quieras realizar:");
                opcion = scanner.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("La opción seleccionada es 1");
                        break;
                    case 2:
                        System.out.println("La opción seleccionada es 2");
                        break;
                    case 3:
                        System.out.println("La opción seleccionada es 3");
                        break;
                    case 4:
                        System.out.println("La opción seleccionada es 4");
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.print("opción no contemplada");
                        break;

                }
        }while (opcion!=5);

        System.out.print("Fin del menú");

    }
         */
    //Ejercicio 8
        /*Modifica el ejercicio anterior para hacer una calculadora. Nada más ejecutar se mostrarán
        las opciones disponibles - Bienvenido a la aplicación de calculos - Introduce operando uno:
        - Introduce operando dos: - 1. Sumar - 2. Restar - 3. Multiplicar - 4. Dividir - 5. Módulo - 6. Salir -
        Selecciona la operacion que quieres realizar.
        Al seleccionar una de las opciones el sistema realizará la operación correspondiente y mostrará el resultado
        por pantalla de la siguiente forma "El resultado de la operación es:".
        Una vez terminada la operación volverá a mostrar el menú y pedir dos números nuevos. (MenuCalculo)

public static void main(String[] args) {

    int opcion=0;
    double num1=0.0;
    double num2=0.0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Bienvenido a la aplicación de cálculos:");
    do {
        System.out.println("\t1.Sumar");
        System.out.println("\t2.Restar");
        System.out.println("\t3.Multiplicar");
        System.out.println("\t4.Dividir");
        System.out.println("\t5.Módulo");
        System.out.println("\t6. Salir");
        System.out.print("Selecciona la opción que quieres realizar:");
        opcion = scanner.nextInt();
        if (opcion>0 && opcion<6){
        System.out.print("Indica el primer numero:");
        num1 = scanner.nextDouble();
        System.out.print("Indica el segundo numero:");
        num2 = scanner.nextDouble();
        }
        switch (opcion){
            case 1:
                double suma=num1+num2;
                System.out.println("El resultado de la operación es: "+suma);
                break;
            case 2:
                double resta=num1-num2;
                System.out.println("El resultado de la operación es: "+resta);
                break;
            case 3:
                double multi=num1*num2;
                System.out.println("El resultado de la operación es: "+multi);
                break;
            case 4:
                double dividir=num1/num2;
                System.out.println("El resultado de la operación es: "+dividir);
                break;
            case 5:
                double modulo=num1%num2;
                System.out.println("El resultado de la operación es: "+modulo);
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.print("Opción no contemplada");
                break;
        }
    }while (opcion!=6);

    System.out.print("Fin del menú");
}
*/
    //Ejercicio 9
        /*
        3. Modifica el ejercicio 9 para hacer una calculadora de cambios de base. Nada más ejecutar se mostrarán
        las opciones disponibles - Bienvenido a la aplicación de cambios de base
    - Introduce el número que quieres cambiar de base:
    - Pasar a base2
    - Pasar a base8
    - Pasar a base16
    - Salir
    - Selecciona la base a la que quieres pasar
    Al introducir un número el sistema comprobará que es mayor que 0. En caso de no serlo mostrará el mensaje
    "No válido, introduce otro", esperando una nueva introducción de datos. Una vez introducido, al seleccionar una
    de las opciones el sistema realizará la conversión correspondiente y mostrará el resultado por pantalla de la
    siguiente forma "El número XX en base10 es igual que XX en baseXX". Una vez terminada la operación volverá a
    mostrar el menú y pedir un número. (MenuBases)

    public static void main(String[] args) {

        int opcion = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicación de cálculos:");
        do {
            System.out.println("\t1.Pasar a base2");
            System.out.println("\t2.Pasar a base8");
            System.out.println("\t3.Pasar a base16");
            System.out.println("\t4. Salir");
            System.out.print("Selecciona la base a la que quieras pasar:");
            opcion = scanner.nextInt();
            if (opcion > 0 && opcion < 4) {
                System.out.print("Indica el numero:");
                num = scanner.nextInt();
            }
            switch (opcion) {
                case 1:
                    String base2 = Integer.toBinaryString(num);
                    System.out.println("El numero en base 2 es:" +base2);
                    break;
                case 2:
                    String base8 = Integer.toOctalString(num);
                    System.out.println("El numero en base 8 es:" +base8);
                    break;
                case 3:
                    String base16 = Integer.toHexString(num).toUpperCase();
                    System.out.println("El numero en base 16 es:" +base16);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.print("Opción no contemplada");
                    break;
            }
        } while (opcion != 4);

        System.out.print("Fin del menú");
 */


    }













