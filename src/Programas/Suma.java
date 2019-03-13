package Programas;
import java.io.*;
public class Suma
{
    public static void main (String[] args)
            throws IOException
    {
        BufferedReader bf=new BufferedReader (new InputStreamReader (System.in) );
        
        String snum1,snum2;
        double num1,num2,Result;
        
        System.out.println("Ingrese el primer numero a sumar");
        snum1=bf.readLine();
        num1=Double.parseDouble(snum1);
        
        System.out.println("Ingrese el segundo numero a sumar");
        snum2=bf.readLine();
        num2=Double.parseDouble(snum2);
        
        Result=num1+num2;
        System.out.println("El resultado es\t" +Result);
    }
}