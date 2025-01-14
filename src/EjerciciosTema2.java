import java.util.Scanner;

public class EjerciciosTema2 {

//EJERCICIOS IF
    //Ejercicio 1
            /*
                 Hágase un programa que lea dos enteros y compruebe si el primero es o no mayor que el segundo.
                 En la salida se mostrará “El primero es mayor que el segundo” o “El primero no es mayor que el segundo”.

                public static void main(String[] args) {
                    System.out.println("Introduce el primer numero:");
                    Scanner scanner = new Scanner(System.in);
                    int numero1 = scanner.nextInt();
                    System.out.println("Introduce el segundo numero:");
                    int numero2 = scanner.nextInt();

                    if (numero1>numero2){
                        System.out.println("El primero es mayor que el segundo");
                    } else {
                        System.out.println("El primero no es mayor que el segundo");
                    }
                }
            */
    //Ejercicio 2
            /*
            Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos.
            En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6”
            (en este último caso se introdujeron los números 2, 8 y 6). SumaTres.java

            public static void main(String[] args) {
                System.out.println("introduce el primer numero entero positivo:");
                Scanner scanner =new Scanner(System.in);
                int numero1 = scanner.nextInt();
                System.out.println("introduce el segundo numero entero positivo:");
                int numero2 = scanner.nextInt();
                System.out.println("introduce el tercer numero entero positivo:");
                int numero3 = scanner.nextInt();

                if (numero1 == numero2+numero3 ){
                System.out.printf("%d es suma de %d+%d\n",numero1,numero2,numero3);
                } else if (numero2 == numero1+numero3) {
                System.out.printf("%d es suma de %d+%d\n",numero2,numero1,numero3);
                } else if (numero3 == numero1+numero2) {
                System.out.printf("%d es suma de %d+%d\n",numero3,numero1,numero2);
                } else {
                System.out.println("Ninguno es suma de los otros dos");

                }
            }
            */
    //Ejercicio 3
            /*
                Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20, y también se comprobará si está o
                no entre -100 y 100. En la salida se mostrará uno de los siguientes menasajes:

                public static void main(String[] args) {
                    System.out.print("Escribe un numero entero:");
                    Scanner scanner = new Scanner(System.in);
                    int numero = scanner.nextInt();

                    if (numero % 20 == 0 && (numero > -100 && numero < 100)) {
                        System.out.println("Es multiplo de 20 y esta entre -100 y 100");
                    } else if (numero % 20 == 0 && (numero < -100 || numero > 100)) {
                        System.out.println("Es multiplo de 20 y no esta entre -100 y 100");
                    } else if (numero % 20 != 0 && (numero > -100 && numero < 100)) {
                        System.out.println("No es multiplo de 20 y esta entre -100 y 100");
                    } else if (numero % 20 != 0 && (numero < -100 || numero > 100)) {
                        System.out.println("No es multiplo de 20 y no esta entre -100 y 100");

                    }
                }
                */
    //Ejercicio 4
            /*
                4. Hágase un programa que compruebe si un año pedido por teclado es bisiesto. En la salida se mostrará o
                “Es bisiesto” o “No es bisiesto”,)
                El algoritmo para obtener si un año es bisiesto es el siguiente: un año es bisiesto si es múltiplo de 4.

                public static void main(String[] args) {
                    System.out.println("Escribe el año a consultar:");
                    Scanner scanner = new Scanner(System.in);
                    int año= scanner.nextInt();

                    if (año%4==0){
                    System.out.println("El año es bisiesto");
                    }else {
                    System.out.println("El año no es bisiesto");

                    }

                }
            */
    //Ejercicio 5
            /*
                5. Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa. Se comprobará previamente que el
                número introducido tiene 4 dígitos. En la salida se mostrará uno de los siguientes mensajes:
                1. “El número no tiene 4 dígitos”;
                2. “Es capicúa”
                3. “No es capicúa”.
                - * Un número es capicúa cuando se lee igual de izquierda a derecha que de derecha a izquierda **

                /*
                public static void main(String[] args) {
                    System.out.println("Escribe un numero de 4 digitos:");
                    Scanner scanner =new Scanner(System.in);
                    int numero4digitos=scanner.nextInt();

                    if (numero4digitos<1000 || numero4digitos>9999){
                    System.out.println("El numero no tiene 4 digitos");
                    } else if (numero4digitos/1000 == numero4digitos%10 && (numero4digitos/100)%10==(numero4digitos%100)/10) {
                    System.out.println("El numero es capicua");
                    }else {
                    System.out.println("El numero no es capicua");

                    }
                }
                */
    //Ejercicio 6
            /*
                Introducir tres enteros entre -100 y 100. De cumplir los tres números la condición del rango, se obtendrá
                la suma de sus inversos (1/número ). En el caso de no estar alguno de los numeros en el rango se mostrará el
                mensaje “Alguno de los números no está entre -100 y 100”. No se sumará el inverso de aquellos valores que sean 0.
                Por ejemplo, se introducen los enteros 20, -4 y 100, y se muestra el valor 1/20 + 1/-4 + 1/100 = -0.19000.


                public static void main(String[] args) {
                    System.out.println("Introduce el primer numero:");
                    Scanner scanner =new Scanner(System.in);
                    int numero1=scanner.nextInt();

                    System.out.println("Introduce el segundo numero:");
                    int numero2=scanner.nextInt();

                    System.out.println("Introduce el tercer numero:");
                    int numero3=scanner.nextInt();


                    if ((numero1<-100||numero1>100)||(numero2<-100||numero2>100)||(numero3<-100||numero3>100)){
                    System.out.println("Alguno de los números no está entre -100 y 100");
                    } else if (numero1==0&&numero2==0&&numero3==0) {
                    System.out.println("Todos los numeros seleccionados son 0, no se puede ejecutar la suma");
                    } else {
                        double suma=0;

                        if (numero1!=0){
                            suma+=1.0/numero1;
                        }
                        if (numero2!=0){
                            suma+=1.0/numero2;
                        }
                        if (numero3!=0){
                            suma+=1.0/numero3;
                        }

                    System.out.printf("La suma de los inversos es: %.5f\n",suma);

                    }


                }
            */
    //Ejercicio 7
            /*
                7. Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos elevado a 3 coincide con dicho número.
                Por ejemplo, 153 = 1+125+27. Dado un número de 3 cifras determinar si es o no un número Armstrong. Se comprobará
                previamente que el número introducido tiene 3 dígitos. En la salida se mostrará uno de los siguientes mensajes:
                1. “El número no tiene 3 dígitos”
                2. “Es un número Armstrong”
                3. “No es un número Armstrong”.


                public static void main(String[] args) {
                    System.out.println("Introduce el numero de 3 digitos:");
                    Scanner scanner = new Scanner(System.in);
                    int numero1=scanner.nextInt();

                    if (numero1<100||numero1>999){
                    System.out.println("El numero introducido no tiene 3 digitos:");
                    } else if ((((numero1/100)*(numero1/100)*(numero1/100))+(((numero1/10)%10)*((numero1/10)%10)*((numero1/10)%10))+(numero1%10)*(numero1%10)*(numero1%10))==numero1){
                        System.out.println("Es un número Armstrong");
                    } else {
                        System.out.println("No es un número Armstrong");
                    }

                }
            */
    //Ejercicio 8
             /* Leer tres enteros y mostrarlos ordenados.


                public static void main(String[] args) {
                    System.out.println("Introduce el primer numero");
                    Scanner scanner = new Scanner(System.in);
                    int numero1 = scanner.nextInt();

                    System.out.println("Introduce el segundo numero");
                    int numero2 = scanner.nextInt();

                    System.out.println("Introduce el tercer numero");
                    int numero3 = scanner.nextInt();

                    int mayor, medio, menor;

                    if (numero1 <= numero2 && numero2 <= numero3) {
                        mayor = numero3;
                        if (numero1 <= numero2) {
                            medio = numero2;
                            menor = numero1;
                        } else {
                            medio = numero1;
                            menor = numero2;
                        }
                        System.out.printf("Números ordenados:%d,%d,%d\n",menor,medio,mayor);
                    }
                        if (numero1 <= numero2 && numero3 <= numero2) {
                            mayor = numero2;
                            if (numero1 <= numero3) {
                                medio = numero3;
                                menor = numero1;
                            } else {
                                medio = numero1;
                                menor = numero3;
                            }
                            System.out.printf("Números ordenados:%d,%d,%d\n",menor,medio,mayor);
                        }
                        if (numero2 <= numero1 && numero3 <= numero1){
                            mayor=numero1;
                            if (numero2<=numero3){
                                medio=numero3;
                                menor=numero2;
                            } else {
                                medio=numero2;
                                menor=numero3;
                            }
                            System.out.printf("Números ordenados:%d,%d,%d\n",menor,medio,mayor);
                        }



                    }
            */
    //Ejercicio 9
            /*
                Se leen tres enteros y se comprobará si son o no consecutivos. Se mostrará en la salida
                “Son consecutivos” o “No son consecutivos”.

                public static void main(String[] args) {
                    System.out.print("Introduce el primer numero:");
                    Scanner scanner=new Scanner(System.in);
                    int num1= scanner.nextInt();

                    System.out.println("Introduce el segundo numero:");
                    int num2= scanner.nextInt();

                    System.out.println("Introduce el tercer numero:");
                    int num3= scanner.nextInt();

                    if (num3==num2+1 && num3==num1+2){
                        System.out.println("Son consecutivos");
                    } else if (num3==num1+1 && num3==num2+2) {
                        System.out.println("Son consecutivos");
                    } else if (num2==num3+1 && num2==num1+2) {
                        System.out.println("Son consecutivos");
                    } else if (num2==num1+1 && num2==num3+2) {
                        System.out.println("Son consecutivos");
                    } else if (num1==num3+1 && num1==num2+2) {
                        System.out.println("Son consecutivos");
                    } else if (num1==num2+1 && num1==num3+2) {
                        System.out.println("Son consecutivos");
                    } else {
                        System.out.println("No son consecutivos");
                    }
                }
            */
    //Ejercicio 10
            /*
                Se lee un número entero. Dicho número se incrementará en una unidad si es par, y se decrementará en una unidad
                si es impar. Se muestra por consola el nuevo valor del número.


                public static void main(String[] args) {
                    System.out.println("Introduce un numero:");
                    Scanner scanner = new Scanner(System.in);
                    int num=scanner.nextInt();

                    if (num%2==0){
                       num++;
                    System.out.printf("Nuevo valor:%d\n",num);
                    } else {
                       num--;
                    System.out.printf("Nuevo valor:%d\n",num);

                    }

                }
                */
    //Ejercicio 11
             /*
        Se leen tres enteros y un valor booleano para ordenarlos ascendentemente o descendentemente.
        Se mostrarán los valores leídos ordenados.

        public static void main(String[] args) {
            System.out.println("Introduce el primer numero:");
            Scanner scanner = new Scanner(System.in);
            int num1= scanner.nextInt();

            System.out.println("Introduce el segundo numero:");
            int num2= scanner.nextInt();

            System.out.println("Introduce el tercer numero:");
            int num3= scanner.nextInt();

            System.out.println("Introduce true para ascendente o false para descendente:");
            boolean ascendente = scanner.nextBoolean();

            int mayor, medio, menor;

            if (num1>=num2 && num1>=num3){
                mayor=num1;
                if (num2>=num3){
                   medio=num2;
                   menor=num3;
                } else {
                    medio=num3;
                    menor=num2;
                }
                if (ascendente){
                    System.out.printf("El orden ascendente es: %d,%d,%d,\n",menor,medio,mayor);
                } else {
                    System.out.printf("El orden descendente es: %d,%d,%d,\n",mayor,medio,menor);
                }
            }
            if (num2>=num1 && num2>=num3){
                mayor=num2;
                if (num1>=num3){
                    medio=num1;
                    menor=num3;
                } else {
                    medio=num3;
                    menor=num1;
                }
                if (ascendente){
                    System.out.printf("El orden ascendente es: %d,%d,%d,\n",menor,medio,mayor);
                } else {
                    System.out.printf("El orden descendente es: %d,%d,%d,\n",mayor,medio,menor);
                }
            }
            if (num3>=num1 && num3>=num2) {
                mayor = num3;
                if (num1 >= num2) {
                    medio = num1;
                    menor = num2;
                } else {
                    medio = num2;
                    menor = num1;
                }
                if (ascendente){
                    System.out.printf("El orden ascendente es: %d,%d,%d,\n",menor,medio,mayor);
                } else {
                    System.out.printf("El orden descendente es: %d,%d,%d,\n",mayor,medio,menor);
                }
            }

        }

         */
    //Ejercicio 12
            /*
        12. Leer un número entero, se realizarán las siguientes acciones:
        - incrementará en 2 unidades si es par
        - en 3 unidades si es múltiplo de 3
        - en 5 unidades si es múltiplo de 5
        - en el caso de no cumplirse ninguna de las anteiores, se incrementará en una unidad.

        public static void main(String[] args) {
            System.out.println("Introduce el numero:");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            if (num%2==0){
                num=num+2;
                System.out.printf("%d\n",num);
            } else if (num%3==0) {
                num=num+3;
                System.out.printf("%d\n",num);
            } else if (num%5==0) {
                num=num+5;
                System.out.printf("%d\n",num);
            } else {
                num++;
                System.out.printf("%d\n",num);

            }


        }
    */
    //Ejercicio 13
             /*
        Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
         Sin años bisiestos.


        public static void main(String[] args) {
            System.out.println("Indica el día del mes:");
            Scanner scanner = new Scanner(System.in);
            int dia = scanner.nextInt();

            System.out.println("Indica el mes del año:");
            int mes = scanner.nextInt();

            System.out.println("Indica el año:");
            int anio = scanner.nextInt();

            boolean fechaValida;

            if (mes == 2) {
                if (dia >= 1 && dia <= 28) {
                    fechaValida = true;
                    System.out.printf("La fecha %d/%d/%d es valida\n", dia, mes, anio);
                } else {
                    System.out.printf("La fecha %d/%d/%d es invalida. Dia fuera de rango\n", dia, mes, anio);
                }
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 31) {
                    fechaValida = true;
                    System.out.printf("La fecha %d/%d/%d es valida\n", dia, mes, anio);
                } else {
                    System.out.printf("La fecha %d/%d/%d es invalida. Dia fuera de rango\n", dia, mes, anio);
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    fechaValida = true;
                    System.out.printf("La fecha %d/%d/%d es valida\n", dia, mes, anio);
                } else {
                    System.out.printf("La fecha %d/%d/%d es invalida. Dia fuera de rango.\n", dia, mes, anio);
                }
            } else {
                if (mes < 1 || mes > 12) {
                    fechaValida = false;
                    System.out.printf("La fecha %d/%d/%d es invalida. Mes fuera de rango.\n", dia, mes, anio);
                }
            }
        }
        */
    //Ejercicio 14
             /*
        Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses
        tienen 30 días excepto febrero que tiene 28.

        public static void main(String[] args) {
            System.out.println("Indica el día del mes:");
            Scanner scanner = new Scanner(System.in);
            int dia = scanner.nextInt();

            System.out.println("Indica el mes del año:");
            int mes = scanner.nextInt();

            System.out.println("Indica el año:");
            int anio = scanner.nextInt();

            boolean fechaValida;

            if (mes == 2) {
                if (dia >= 1 && dia <= 28) {
                    dia++;
                    if (dia > 28) {
                        dia = 1;
                        mes++;
                    }
                    System.out.printf("La fecha de mañana es:%d/%d/%d.\n", dia, mes, anio);
                } else {
                    fechaValida = false;
                    System.out.printf("La fecha %d/%d/%d es incorrecta. Prueba de nuevo\n", dia, mes, anio);
                }
            } else if (mes != 2 && mes >= 1 && mes <= 12) {
                if (dia >= 1 && dia <= 30) {
                    dia++;
                    if (dia > 30) {
                        dia = 1;
                        mes++;
                        System.out.printf("La fecha de mañana es:%d/%d/%d.\n", dia, mes, anio);
                    }
                } else {
                    fechaValida = false;
                    System.out.printf("La fecha %d/%d/%d es incorrecta. Prueba de nuevo\n", dia, mes, anio);
                }

            } else {
                if (mes < 1 || mes > 12) {
                    fechaValida = false;
                    System.out.printf("La fecha %d/%d/%d es invalida. Mes fuera de rango.\n", dia, mes, anio);
                }
            }
        }
    */

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
}















