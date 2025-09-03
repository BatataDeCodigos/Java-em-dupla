import java.util.Scanner;

//criando a classe do Main
public class main{

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    boolean menu = true;

//criando o menu
    while (menu){

        System.out.println("\nCalculadora de geometria");
        System.out.println("1 - Cículo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Cubo");
        System.out.println("4 - Esfera");
        System.out.println("5 - Sair/Fechar");
        System.out.print("Escolha uma das opções acima: \n");

        int option = sc.nextInt();

        switch (option){

            case 1 -> geo_plana.circulo(sc);

            case 2 -> geo_plana.quadrado(sc);

            case 3 -> geo_espacial.cubo(sc);

            case 4 -> geo_espacial.esfera(sc);
            
            case 5 -> {

                System.out.println("Finalizando...");
                menu = false;

            }

            //ta dando erro pois precisamos da parte do Vinny 

            default -> System.out.println("Opção não identificada... Tente novamente...");

        }

        }

sc.close();

    }

}



