import java.lang.reflect.Array;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class principal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opt = 0;

        do 
        {
            String msj = "Bienvenidos a frater/n" + "Seleccione nuestro menú/n" + "1: Hamburguesa/n" +
            "2: Perro caliente/n" + "3: Salchipapa/n" + "Salir";
            System.out.println(msj);  
            while (!sc.hasNextInt()) 
            {
                System.out.println("Entrada no valida, reintente");
                sc.next();    
            }
            opt = sc.nextInt();
            switch (opt) 
            {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
            
        } while (opt!=4);   
    }
     
}