import java.util.Scanner;

public class geo_plana {
    
    //circulo
    public static void circulo(Scanner sc){
        //trazer o raio
        System.out.print("Digite o raio desejado: \n");
        double raio = sc.nextDouble();
        System.out.println("Área do círculo é "+(Math.PI*raio*raio));
    
    }
//quadrado
    public static void quadrado(Scanner sc){

        System.out.print("Digite o lado desejado: \n");
        double lado = sc.nextDouble();
        System.out.println("Área do quadrado é "+(lado*lado));

    }
    
}
