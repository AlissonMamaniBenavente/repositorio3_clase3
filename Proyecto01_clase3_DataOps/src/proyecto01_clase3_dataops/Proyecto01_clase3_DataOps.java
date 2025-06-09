package proyecto01_clase3_dataops;

import java.util.Scanner;

public class Proyecto01_clase3_DataOps {

    public static void main(String[] args) {
        
        //declarar variables
        double num1, num2, suma, promedio;
        Scanner lectura = new Scanner(System.in);
        
        //entrada de datos
        System.out.print("Ingresar número 1: ");
        num1 = lectura.nextDouble();
        
        System.out.print("Ingresar número 2: ");
        num2 = lectura.nextDouble();
        
        //ACTUALIZANDO
        //proceso de datos
        
        suma = num1 + num2;
        promedio = suma / 2;
        
        
        //salida de datos
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
    
}
