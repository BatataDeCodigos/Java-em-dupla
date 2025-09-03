import java.util.Scanner;

public class geo_espacial {
//Vinny está com problemas de identificação de programa; aqui foi oque ele fez

    // cubo
    public static void cubo(Scanner sc) {
        System.out.print("Digite o lado do cubo: ");
        double lado = sc.nextDouble();
        double volume = Math.pow(lado, 3);
        double area = 6 * Math.pow(lado, 2);

        System.out.println("Volume do cubo = " + volume);
        System.out.println("Área superficial do cubo = " + area);
    }

    // esfera
    public static void esfera(Scanner sc) {
        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        Esfera esfera = new Esfera(raio);

        System.out.println("Volume da esfera = " + esfera.volume());
        System.out.println("Área da esfera = " + esfera.areaSuperficial());
    }
}

        

