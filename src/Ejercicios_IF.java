public class Ejercicios_IF {

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

    }













