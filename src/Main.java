import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      Solicitar al usuario un número de cliente. Si el número es el 1000, imprimir
//      “Ganaste un premio” de lo contrario imprimir “Sigue participando”
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        if (num == 1000){
            System.out.println("Ganaste un premio");
        }else {
            System.out.println("Sigue participando");
        }


//        Solicitar al usuario que ingrese dos números e imprima cuál de los dos
//        es menor. Considerar el caso en que ambos números son iguales.
//        System.out.println("Ingrese el primer numero");
//        int num1 = sc.nextInt();
//        System.out.println("Ingrese el segundo numero");
//        int num2 = sc.nextInt();
//        if (num1 > num2){
//            System.out.println("El numero menor es: " + num2);
//        }else if (num2 > num1){
//            System.out.println("El numero menor es: " + num1);
//        }else {
//            System.out.println("Los numeros son iguales");
//        }


//        Escribir un programa que pida al usuario un número e imprima si es
//        par o impar.
//        System.out.println("Ingrese un numero");
//        int num = sc.nextInt();
//        if (num % 2 == 0){
//            System.out.println("El numero ingresado es par");
//        }else {
//            System.out.println("El numero ingresado es impar");
//        }


//        Crear un ciclo for que cuente de 0 a 100.
//        for (int i = 0; i <= 100; i++){
//            System.out.println(i);
//        }


//        Cree un bucle que sume los números del 100 al 200
//        int suma = 0;
//        for (int i = 100; i <= 200; i++){
//            suma = suma + i;
//        }
//        System.out.println("Suma = " + suma);


//        Imprima los números del 1 al 10 al revés
//        for (int i = 10; i >= 1; i--){
//            System.out.println(i);
//        }


//        Escribir un programa que pregunte al usuario su edad y muestre por
//        pantalla todos los años que ha cumplido (desde 1 hasta su edad)
//        System.out.println("Ingrese su edad");
//        int edad = sc.nextInt();
//        for (int i = 0; i < edad; i++){
//            System.out.println(i+1);
//        }


//        Escribir un programa que pida el ingreso de una calicación (de la A a
//        la F) e imprima la evaluación de dicha calicación
//        System.out.println("Ingrese la calificacion (A, B, C, D, E, F)");
//        String calificacion = sc.nextLine();
//        calificacion = calificacion.toUpperCase();
//        String calificacionf = calificacion;
//        int cont = 0;
//        switch (calificacion){
//            case "A":calificacionf = "A 0";
//                break;
//            case "B":calificacionf = "A 1";
//                break;
//            case "C":calificacionf = "A 2";
//                break;
//            case "D":calificacionf = "A 3";
//                break;
//            case "E":calificacionf = "A 4";
//                break;
//            case "F": calificacionf = "A 5";
//                break;
//            default:
//                System.out.println("Calificación no válida");
//                cont = 1;
//        }
//        if (cont!=1){
//            System.out.println("La evaluacion de " + calificacion + " es: " + calificacionf);
//        }


//        Una fábrica tiene una promoción de descuento para vender un número
//        de sillas, si son más de 5 sillas el descuento es de 10%, si son más de
//        12 sillas el descuento es de 20%, si son más de 40 sillas el descuento
//        es de 30%, imprimir el valor a pagar aplicando el descuento
//        correspondiente dado el número de unidades que compre un usuario,
//        el precio unitario sin descuento es de $40.000
//        System.out.println("Ingrese la cantidad de sillas que desea comprar");
//        int cantS = sc.nextInt();
//        double descuento = 0.0, valorDescuento, subtotal, total;
//        int valorUnitario = 40000;
//        if (cantS > 5 && cantS <= 12) {
//            descuento = 0.1;
//        } else if (cantS > 12 && cantS <= 40) {
//            descuento = 0.2;
//        } else if (cantS > 40) {
//            descuento = 0.3;
//        }
//        subtotal = valorUnitario * cantS;
//        valorDescuento = subtotal * descuento;
//        total = subtotal - valorDescuento;
//        System.out.println("Subtotal: $" + subtotal);
//        System.out.println("Valor del descuento: $" + valorDescuento);
//        System.out.println("Valor a pagar con descuento: $" + total);


//        Para tributar un determinado impuesto se debe ser mayor de 16 años y
//        tener unos ingresos iguales o superiores a $5,000.000 mensuales.
//        Escribir un programa que pregunte al usuario su edad y sus ingresos
//        mensuales y muestre por pantalla si el usuario tiene que tributar o no
//        System.out.println("Ingrese su edad");
//        int edad = sc.nextInt();
//        System.out.println("Ingrese sus ingresos mensuales");
//        double ingresos = sc.nextDouble();
//        if (edad > 16 && ingresos >= 5000000){
//            System.out.println("Tiene que tributar");
//        }else {
//            System.out.println("No tiene que tributar");
//        }
    }
}