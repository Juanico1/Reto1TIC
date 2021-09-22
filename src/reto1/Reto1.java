package reto1;
import java.util.Scanner;
public class Reto1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el indice de consumo de alcohol");
        int indAlc = Integer.parseInt(sc.nextLine());
        int indPsi = (2*indAlc)+4;
        int riesgo = (indAlc+indPsi)/5;
        System.out.println(indAlc+" "+indPsi+" "+riesgo);
        if (riesgo>=0 && riesgo<=20){
            System.out.println("uno");
        } else if(riesgo>=21 && riesgo<=30){
            System.out.println("dos");               
        } else if(riesgo>=31 && riesgo<=50){
            System.out.println("tres");               
        } else if(riesgo>50){
            System.out.println("cuatro");               
        }
    }  
}
