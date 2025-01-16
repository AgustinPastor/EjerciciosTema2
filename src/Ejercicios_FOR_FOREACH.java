public class Ejercicios_FOR_FOREACH {

//EJERCICIOS FOR
    //Ejercicio 1
        /*
            Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
            Obténgase la media con dos decimales de las temperaturas introducidas por consola. (TemperaturasIntroducidas)


            public static void main(String[] args) {
                System.out.println("Cuantas temperaturas vas a introducir:");
                Scanner scanner=new Scanner(System.in);
                int nTemp= scanner.nextInt();

                double sumaTemp=0.0;

                for (int i=0;i<nTemp;i++){
                System.out.print("Introduce la temperatura:");
                int temperatura = scanner.nextInt();
                    if (temperatura<1){
                        temperatura=10;
                    }
                sumaTemp+=temperatura;
                }
                System.out.printf("La temperatura media es de %.2f\n",sumaTemp/nTemp);
         }
        */
    //Ejercicio 2
        /*
            Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con el
            formato: 5 x 3 = 15 (desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)


        public static void main(String[] args) {
            System.out.println("Introduce un numero entre 0 y 10 para saber su tabla de multiplicar:");
            Scanner scanner = new Scanner(System.in);
            int numero = scanner.nextInt();

        int numMultiplica=10;

        for (int i=0;i<numMultiplica;i++){
            int tablaDeMultiplicar = numero*i;
            System.out.printf("%dX%d = %d\n",numero,i,tablaDeMultiplicar);
        }

        }
     */
    //Ejercicio 3
        /*
            Modificar el ejercicio anterior para calcular la tabla de multiplicar de todos los números (TablaTodos)

        public static void main(String[] args) {

            for (int i=0; i<=10; i++) {
                System.out.printf("Tabla de multiplicar de %d",i);
                for (int j=0; j<=10; j++) {
                    System.out.printf("\t%d X %d = %d\n", i, j, i * j);
                }
            }

        }
     */
    //Ejercicio 4
        /*
            Modificar el ejercicio anterior para calcular la tabla de multiplicar de los números comprendidos en un
            rango de números pedidos. Por ejemplo, las tablas de los números comprendidos entre el 3 y el 7 (3,4,5,6,7)

        public static void main(String[] args) {

            int num1=5;
            int num2=7;
            for (int i=num1; i<=num2; i++) {
                System.out.printf("Tabla de multiplicar de %d",i);
                for (int j=0; j<=10; j++) {
                    System.out.printf("\t%d X %d = %d\n", i, j, i * j);
                }
            }

        }
        */
    //Ejercicio 5
        /*
        Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la potencia del primero elevado al segundo
        sin utilizar el método “pow”. Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243.
        Casos particulares: 00 = Error y n0 = 1.(BaseExponente)

        public static void main(String[] args) {
            int base = 2;
            int exponente = 0;

            if (base == 0 && exponente == 0) {
                System.out.println("No se puede calcular error");
            } else {
                int resultado = 1;
                for (int i = 0; i < exponente; i++) {
                    resultado *= base;
                }
                System.out.println(resultado);
            }

        }
    */
    //Ejercicio 6
        /*
        Mostrar todos los números pares comprendidos entre dos dados. (ParesEntreDosDados)

        public static void main(String[] args) {
        int num1=10;
        int num2=20;

        for (int i=num1; i<num2; i++){
            if (i%2==0){
            System.out.println(i);
            }
        }




        }
        */
    //Ejercicio 7
        /*
    Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado
    (de no ser positivo, se establecerá a 100). (Dado)

public static void main(String[] args) {
    System.out.println("Introduce el número de tiradas");
    Scanner scanner=new Scanner(System.in);
    int tiradas= scanner.nextInt();
        if (tiradas<0){
            tiradas=100;
        }
    for (int i=1;i<=tiradas;i++){
        int lanzamientos= (int) (Math.random()*6) +1;
        System.out.printf("\t%d\n",lanzamientos);
    }


}
*/
    //Ejercicio 8
        /*
        Pedir 10 números. Mostrar la media de los números positivos,
        la media de los números negativos y la cantidad de ceros (NumerosTipos)

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double sumatorioPositivos = 0.0, sumatorioNegativos = 0.0;
    int numeroCeros = 0, numerosNegativos=0, numeroPositivos=0;
    for (int i = 0; i < 10; i++) {
        System.out.println("Introduce numero");
        int numero = scanner.nextInt();
        if (numero >= 0) {
            // positivo
            sumatorioPositivos+=numero;
            numeroPositivos++;
        } else {
            // negativo
            sumatorioNegativos+=numero;
            numerosNegativos++;
        }
        if (numero == 0) {
            numeroCeros++;
        }
    }
    System.out.println("La media de positivos es: "+(sumatorioPositivos/numeroPositivos));
    System.out.println("La media de negativos es: "+(sumatorioNegativos/numerosNegativos));
    System.out.println("El nº de ceros es: "+(numeroCeros));
}
  */
    //Ejercicio 9
         /*
    Pedir 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€.(Sueldos)


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaSueldos=0.0;
        int mayoresde1000=0;
        int nSueldos =10;
        for (int i=0;i<10;i++){
            System.out.println("Introduce el sueldo:");
            double sueldo=scanner.nextDouble();
            sumaSueldos+=sueldo;
            if (sueldo>1000){
                mayoresde1000++;
            }
        }
            System.out.println("El total de sueldos es "+sumaSueldos);
            System.out.println("La media de sueldos es "+(sumaSueldos/nSueldos));
            System.out.println("Sueldos superiores a 1000€: "+mayoresde1000);




    }

     */
    //Ejercicio 10
        /*
        Introduce  6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.(NotasTipos)

public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int nNotas=6;
    int naprobados=0, ncondicionados=0, nsuspensos=0;

    for (int i=0;i<nNotas;i++){
        System.out.print("Introduce la nota:");
        double nota= scanner.nextDouble();
        if (nota>4){
            naprobados++;
        } else if (nota==4) {
            ncondicionados++;
        }else {
            nsuspensos++;
        }
    }
        System.out.println("El numero de alumnos aprobados es de: "+naprobados);
        System.out.println("El numero de alumnos condicionados es de: "+ncondicionados);
        System.out.println("El numero de alumnos suspensos es de: "+nsuspensos);


}

         */
    //Ejercicio 11
        /*
        Dibujar por consola un Cuadrado de + . Para ello se pedirá por consola el tamaño del lado
        y se imprimirá el cuadrado con el siguiente formato (CuadradoFor)



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime de que lado quieres el cuadrado:");
        int lado= scanner.nextInt();
        for (int i=0;i<lado;i++){                       //filas
            for (int j=0;j<lado;j++){                   //columnas
                if (i==0){                              //primera fila
                    System.out.print("+");
                } else if (i==lado-1) {                 //ultima fila
                    System.out.print("+");
                } else if (j==0) {                      //primera columna
                    System.out.print("+");
                } else if (j==lado-1) {                 //ultima columna
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }



    }

         */
    //Ejercicio 12
        /*
        Modificar el ejercicio anterior para dibujar un cuadrado donde las aristas exteriores tengan el
        caracter - y la parte inferior del cuadrado tenga el caracter +. (CuadradoFormato)

public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Dime de que lado quieres el cuadrado:");
    int lado= scanner.nextInt();
    for (int i=0;i<lado;i++){                       //filas
        for (int j=0;j<lado;j++) {                   //columnas
            if (i == 0) {                              //primera fila
                System.out.print("-");
            } else if (i == lado - 1) {                 //ultima fila
                System.out.print("+");
            } else if (j == 0) {                      //primera columna
                System.out.print("-");
            } else if (j == lado - 1) {                 //ultima columna
                System.out.print("-");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

         */
    //Ejercicio 13
        /*
        Pedir una palabra por teclado y mostrar su contraria. Por ejemplo se introducirá la palabra programacion
        y se mostrará por consola la palabra noicamargorp (InversaPalabra)


    public static void main(String[] args) {
        String palabra = "Programación";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
      }
 */
    //Ejercicio 14
        /*
    Pedir una palabra por teclado y comprobar si es o no palindromo. Una palabra es palíndromo cuando se lee igual
    de izquierda a derecha que de derecha a izquierda. Por ejemplo ana, oro, radar. Para poder hacer la comprobación no se tendrán en cuenta mayusculas ni acentos (CapicuaPalabra)

public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce la palabra:");
    String palabra = scanner.next();
    boolean esPalindromo=false;

    for (int i =0; i<=palabra.length()/2; i++) {
        if (palabra.charAt(i)==palabra.charAt(palabra.length()-1-i)){
            esPalindromo=true;
        } else {
            esPalindromo=false;
        }

    }
            if (esPalindromo){
                System.out.println("La palabra " +palabra+" es palindroma");
            } else {
            System.out.println("La palabra " +palabra+" no es palindroma");
            }
}








     */
    //Ejercicio 15
        /*
    15. Pedir por consola una frase. Una vez introducida. Indicar:
    1. Cuantas oraciones tiene
    2. Cuantas letras tiene
    3. Cuantas palabras tiene
    4. Cuantas letras tiene (sin contar espacios ni símbolos de puntuación)


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la frase al usuario
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        // Inicializar los contadores
        int oraciones = 0;
        int letras = 0;
        int palabras = 0;
        int letrasSinEspacios = 0;

        // Variables para verificar si es una nueva palabra
        boolean enPalabra = false;

        // Recorrer cada carácter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            // Contar oraciones (por los signos de puntuación)
            if (c == '.' || c == '!' || c == '?') {
                oraciones++;
            }

            // Contar letras
            if (Character.isLetter(c)) {
                letras++;
                letrasSinEspacios++;  // Solo contar letras alfabéticas para este caso
                enPalabra = true; // Estamos dentro de una palabra
            }

            // Contar palabras (cuando encontramos un espacio o un salto de línea)
            if (c == ' ' || c == '\n' || c == '\t') {
                if (enPalabra) {
                    palabras++;
                    enPalabra = false; // Hemos salido de una palabra
                }
            }
        }

        // Si la última parte de la frase también es una palabra (sin espacio al final)
        if (enPalabra) {
            palabras++;
        }

        // Mostrar los resultados
        System.out.println("1. La frase tiene " + oraciones + " oraciones.");
        System.out.println("2. La frase tiene " + letras + " letras.");
        System.out.println("3. La frase tiene " + palabras + " palabras.");
        System.out.println("4. La frase tiene " + letrasSinEspacios + " letras (sin contar espacios ni símbolos de puntuación).");
    }

     */
    //Ejercicio 16
        /*
    Crear un programa que permita realizar un juego de adivinación. Para ello el sistema nada más empezar generará
    un número aleatorio entre 1 y 30. Tras la generación de este número el usuario contará con 10 intentos para poder
    adivinarlo. Para lo cual se irá pidiendo un números y en el caso de aceptarlo terminará el proceso con el mensaje
    "Has adivinado el número en X intentos". En el caso de agotar los intentos aparecerá el menaje
    "Lo siento, has agotado todos los intentos”


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= (int)(Math.random()*30)+1;

        int intentos=0;

        for (int i=0;i<10;i++){
            System.out.println("Intente adivinar:");
            int nAdivinar= scanner.nextInt();

            if (nAdivinar==num){
                System.out.println("¡Enorabuena!¡Número adivinado!");
                break;
            } else {
                System.out.println("No has acertado.Pruebe de nuevo.");
                intentos++;
            }
            if (intentos==10){
                System.out.println("Lo sentimos, se le han acabado los intentos.");

            }
        }


    }
*/
    //Ejercicio 17
        /*
Calcular el factorial de un número entre 0 y 20. El factorial de un número se define del
siguiente modo: F(0) = 1; F(1) = 1; F(n) = n(n-1)(n-2) ... 1 siendo n>1. (Factorial)


    public static void main(String[] args) {
        int numero=15;
        long factorial=1;
        for (int i=1;i<numero;i++){
            factorial*=i;
        }
        System.out.printf("El factorial de %d es %d",numero,factorial);
    }
 */
//Ejercicio FOREACH
        /*
Pedir un número por teclado. En el caso que el número introducir sea mayor que 10 o menor que 0 el programa
parará la ejecución con el mensaje "dato erróneo". En caso contrario mostrará la tabla de multiplicar del número
introducido con la siguiente estructura: "5 por 1 = 5" "5 por 2 = 10" ...

public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int[] numeros = {1,2,3,4,5,6,7,8,9,10};

    System.out.println("Escoge un numero:");
    int numeroAleatorio= scanner.nextInt();
    for (int tabla:numeros){
        if (numeroAleatorio<0 || numeroAleatorio>10){
            System.out.println("dato erróneo");
        } else {
            System.out.printf("%d por %d = %d\n",numeroAleatorio,tabla,numeroAleatorio*tabla);
        }
    }

}
         */


    }













