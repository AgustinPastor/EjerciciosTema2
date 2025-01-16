public class Ejercicios_SWITCH {

//EJERCICIOS SWITCH
    //Ejercicio 1
             /*
        Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7
        y muestre el día de la semana correspondiente utilizando una sentencia switch.

        public static void main(String[] args) {
            System.out.println("Seleccione el numero del dia de la semana que quiera:");
            Scanner scanner = new Scanner(System.in);
            int numDiaSemana= scanner.nextInt();


            switch (numDiaSemana){
                case 1:
                    System.out.println("1. Lunes");
                    break;
                case 2:
                    System.out.println("2. Martes");
                    break;
                case 3:
                    System.out.println("3. Miercoles");
                    break;
                case 4:
                    System.out.println("4. Jueves");
                    break;
                case 5:
                    System.out.println("5. Viernes");
                    break;
                case 6:
                    System.out.println("6. Sabado");
                    break;
                case 7:
                    System.out.println("7. Domingo");
                    break;

            } if (numDiaSemana<1 || numDiaSemana>7){
                System.out.println("El numero introducido debe estar entre el 1 y el 7. Prueba de nuevo.");
            }




        }
    */
    //Ejercicio 2
             /*
        Crea un programa que permita al usuario ingresar un carácter y luego determine si es una vocal o una consonante
        utilizando una sentencia switch

    public static void main(String[] args) {
        System.out.println("Introduce un caracter:");
        Scanner scanner=new Scanner(System.in);
        String caracter=scanner.nextLine();
        if (caracter.length()!=1){
            System.out.println("No es un caracter válido");
        }

        switch (caracter){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Es una vocal");
                break;
        default:
            if (Character.isLetter(caracter.charAt(0))){
                System.out.println("Es una consonante");
            }else {
                System.out.println("No es un caracter válido");
            }
        }
    }
    */
    //Ejercicio 3
             /*
    Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch, determine si es par o impar.

        public static void main(String[] args) {
            System.out.println("Introduce un numero entero:");
            Scanner scanner=new Scanner(System.in);
            int numEntero= scanner.nextInt();

            switch (numEntero%2) {
                case 0:
                    System.out.println("El numero es par");
                    break;
                case 1:
                    System.out.println("El numero es impar");
                    break;
                default:
                    System.out.println("El numero no es adecuado. Prueba de nuevo");
                    break;

            }
        }

    */
    //Ejercicio 4
             /*
            Realiza un programa que solicite al usuario ingresar un mes (como un número del 1 al 12)
            y muestre la cantidad de días que tiene ese mes, considerando años no bisiestos.

        public static void main(String[] args) {
            System.out.println("Introduce el numero del mes para saber los días que tiene:");
            Scanner scanner=new Scanner(System.in);
            int numMes=scanner.nextInt();


            switch (numMes){
                case 1,3,5,7,8,10,12:
                    System.out.println("Este mes tiene 31 días");
                    break;
                case 2:
                    System.out.println("Este mes tiene 28 días");
                    break;
                case 4,6,9,11:
                    System.out.println("Este mes tiene 30 días");
                    break;
                default:
                    System.out.println("Número no válido. Pruebe otro mes.");
                    break;

            }




        }

    */
    //Ejercicio 5
             /*
        Escribe un programa que pida al usuario ingresar un número del 1 al 12
        y muestre el nombre del mes correspondiente utilizando una sentencia switch.

        public static void main(String[] args) {
            System.out.println("Escribe el número para saber el mes del año");
            Scanner scanner=new Scanner(System.in);
            int numMes= scanner.nextInt();

            switch (numMes){
                case 1:
                    System.out.println("Enero");
                    break;
                case 2:
                    System.out.println("Febrero");
                    break;
                case 3:
                    System.out.println("Marzo");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Mayo");
                    break;
                case 6:
                    System.out.println("Junio");
                    break;
                case 7:
                    System.out.println("Julio");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setiembre");
                    break;
                case 10:
                    System.out.println("Octubre");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    break;
                case 12:
                    System.out.println("Diciembre");
                    break;

                default:
                    System.out.println("El número no es correcto. Pruebe de nuevo");


            }



        }
    */
    //Ejercicio 6
            /*
        Crea un programa que permita al usuario ingresar un número del 1 al 4 y muestre un mensaje diferente para cada
        número utilizando una sentencia switch (por ejemplo, "Opción 1 seleccionada", "Opción 2 seleccionada", etc.).

        public static void main(String[] args) {
            System.out.println("Escriba una opción del 1 al 4:");
            System.out.println("Opción 1:...");
            System.out.println("Opción 2:...");
            System.out.println("Opción 3:...");
            System.out.println("Opción 4:...");

            Scanner scanner=new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Opción 1 seleccionada");
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada");
                    break;
                case 3:
                    System.out.println("Opción 3 seleccionada");
                    break;
                case 4:
                    System.out.println("Opción 4 seleccionada");
                    break;

                default:
                    System.out.println("Opción no válida. Pruebe de nuevo.");

            }





        }


    */
    //Ejercicio 7
            /*
        Desarrolla un programa que solicite al usuario ingresar una nota del 1 al 5 y muestre un mensaje de calificación
        utilizando una sentencia switch (por ejemplo, "Suspenso", "Aprobado", "Notable", "Sobresaliente", etc.).

        public static void main(String[] args) {
            System.out.println("Escriba una nota del 1 al 5:");
            Scanner scanner = new Scanner(System.in);
            int nota = scanner.nextInt();

            switch (nota){
                case 1,2,3,4:
                    System.out.println("Suspenso");
                    break;
                case 5,6:
                    System.out.println("Aprobado");
                    break;
                case 7,8:
                    System.out.println("Notable");
                    break;
                case 9,10:
                    System.out.println("Sobresaliente");
                    break;
                default:
                    System.out.println("Nota no evaluable.Pruebe de nuevo");



            }

        }
    */
    //Ejercicio 8
            /*
             Realiza un programa que pida al usuario ingresar un carácter que represente una operación matemática (+, -, *, /)
             y dos números. Luego, utiliza una sentencia switch para realizar la operación correspondiente y mostrar el resultado.

        public static void main(String[] args) {
            System.out.println("Inserta el caracter (+,-,*,/) matemático a realizar:");
            Scanner scanner = new Scanner(System.in);
            String caracter = scanner.nextLine();
            System.out.println("Inserta el primero de los dos números a calcular:");
            int num1 = scanner.nextInt();
            System.out.println("Inserta el segundo de los dos números a calcular:");
            int num2 = scanner.nextInt();

            int suma= num1+num2;
            int resta= num1-num2;
            int multiplica= num1*num2;

            switch (caracter){
                case "+":
                    System.out.printf("La suma de %d+%d es %d\n",num1,num2,suma);
                    break;
                case "-":
                    System.out.printf("La resta de %d-%d es %d\n",num1,num2,resta);
                    break;
                case "*":
                    System.out.printf("La multiplicación de %d*%d es %d\n",num1,num2,multiplica);
                    break;
                case "/":
                    if (num2==0){
                        System.out.printf("Todo número dividido entre 0 es infinito.\n");
                        }
                    else {
                        double division= (double) num1/num2;
                        System.out.printf("La división de %d/%d es %.2f\n", num1, num2, division);
                    }
                    break;
                default:
                    System.out.println("El caracter seleccionado no es adecuado. Pruebe de nuevo.");
                    break;

            }
    }
    */
    //Ejercicio 9
            /*Escribe un programa que solicite al usuario ingresar un número del 1 al 12 y muestre la estación del año
        correspondiente (por ejemplo, "Primavera", "Verano", "Otoño", "Invierno") utilizando una sentencia switch.


        public static void main(String[] args) {
            System.out.println("Introduce el número del mes del año para saber la estación:");
            Scanner scanner = new Scanner(System.in);
            int mes = scanner.nextInt();

            switch (mes){
                case 12,1,2:
                    System.out.println("Invierno");
                    break;
                case 3,4,5:
                    System.out.println("Primavera");
                    break;
                case 6,7,8:
                    System.out.println("Verano");
                    break;
                case 9,10,11:
                    System.out.println("Otoño");
                    break;
                default:
                    System.out.println("No es un número válido.Pruebe de nuevo");



            }

        }

    */
    //Ejercicio 10
            /*
        Crea un programa que permita al usuario ingresar un código de producto (como una cadena de caracteres) y,
        utilizando una sentencia switch, muestre el nombre del producto y su precio correspondiente


        public static void main(String[] args) {
            String codigo = "1234C";

            switch (codigo) {
                case "1234A":
                    System.out.println("El producto es XXXX");
                    System.out.println("El precio es YYYY");
                    break;
                case "123":
                    System.out.println("El producto es CCCC");
                    System.out.println("El precio es AAAA");
                    break;
                case "1234B":
                    System.out.println("El producto es BBBB");
                    System.out.println("El precio es VVVV");
                    break;
                case "1234C":
                    System.out.println("El producto es SSSS");
                    System.out.println("El precio es FFFF");
                    break;
                default:
                    System.out.println("Código incorrecto");
                    break;




            }



        }


    */


    }













