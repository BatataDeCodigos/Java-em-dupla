import java.util.Scanner;

public class geo_espacial {
//Vinny está com problemas de identificação de programa; aqui foi oque ele fez

    public static void cubo(Scanner sc) {
        System.out.print("Digite o lado: ");
        double lado = sc.nextDouble();
        System.out.println("Volume do cubo = " + Math.pow(lado, 3));
    }

    public static void esfera(Scanner sc) {
        System.out.print("Digite o raio: ");
        double r = sc.nextDouble();
        System.out.println("Volume da esfera = " + (4.0 / 3.0 * Math.PI * Math.pow(r, 3)));
    }
}


        

