package trabajos;
import java.util.Scanner;
//Conversor de Temperatura
//Escribe un programa que convierta la temperatura de grados Celsius a Fahrenheit y viceversa.
// Pide al usuario que ingrese la temperatura y la unidad (Celsius o Fahrenheit).

public class Trabajo4 {

    public static void main(String[] args) {

        Scanner convertidor = new Scanner(System.in);
        double c,f; // declaro variable c=celsius y f=farhenheit

        System.out.println("ingrese una temperatura en °C");
        c = convertidor.nextDouble();
        f = c * 1.8 + 32;
        System.out.println(c + " grados celsius convertidos a grados farhenheit son "+ f + "°F");

        System.out.println("ingrese una temperatura en °f");
        f = convertidor.nextDouble();
        c = (f - 32)/1.8;
        System.out.println(f + " grados farhenheit  convertidos a grados celsius son "+ c + "°C");


    }
}
