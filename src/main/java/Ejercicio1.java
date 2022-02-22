import java.util.Scanner;

public class Ejercicio1 {

        //convertir numeros a codigo ASCII
        /*String texto = "178";
        int num = Integer.parseInt(texto);
        char caracter = (char)num;
        System.out.println(caracter);*/

        //convertir letras a numeros segun el codigo ASCII
        /*String letra = "b";
        char car= letra.charAt(0);
        int ascii = (int) car;
        System.out.println(ascii);*/


        //mostrar los numeros del 1 al 100
        /*int maxNum = 100;
        for (int i = 0; i < maxNum;) {
            do {
                System.out.println(i++);
            } while (i <= maxNum);
        }*/

        //pedir contraseña con margen de error
        /*Scanner sc = new Scanner(System.in);
        String password = "perrito";
        final int INTENTOS = 3;
        boolean acierto = false;

        String pass;
        for (int i = 0; i < INTENTOS && !acierto; i++) {
            System.out.println("Ingresa la contraseña");
            pass = sc.next();
            if (pass.equals(password)){
                System.out.println("Acceso concedido");
                acierto = true;
            }
        }*/


    //Prueba de entrevista #1. Multiplicar 2 numeros sin usar el signo de multiplicación.
    /*public static int mult(int a, int b) {
        int result = 0;
        boolean positivo = Math.abs(b) == b;
        for (int i = 0; i < Math.abs(b); i++) {
            result = positivo ? result + a : result - a;
        }
        return result;
    }
    int c = mult(10, -10);*/

    //cuantos caracteres tiene el numero ingresado.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa cualquier numero");
        int num = 0;
        String resp = sc.next();
        for (int i = 0; i <= num; i++) {
            num = resp.length();
        }
        System.out.println(resp + " Tiene " + resp.length() + " numeros");*/


    //mostrar primeras 2 letras y numero juntos
    /*public static String Solution(String name, String surname, int age){
        String a = name.substring(0,2);
        String b = surname.substring(0,2);
        String c = a+b+age;
        return c;
    }*/
    /*public static void main(String[] args) {
        System.out.println(Solution("Erick", "Martinez", 27));
    }*/

    //public static boolean solution (int []A){}

    /*divisible entre 3 y 5.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("PatoGanzo");
            } else if (i%3==0){
                System.out.println("Pato");
            }else if (i%5==0){
                System.out.println("Ganzo");
            }else{
                System.out.println(i);
            }
        }
    }*/

    /*String name[] = "Claudia Carolina Gonzalez Gonzalez".split(" ");
        String reverse = "";
        for (int i = name.length-1; i >=0 ; i--) {
            reverse += name[i] + " ";
        }
        System.out.println(reverse);*//*String name[] = "Claudia Carolina Gonzalez Gonzalez".split(" ");
        String reverse = "";
        for (int i = name.length-1; i >=0 ; i--) {
            reverse += name[i] + " ";
        }
        System.out.println(reverse);*/
}
