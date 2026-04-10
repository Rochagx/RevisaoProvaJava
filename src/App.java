
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Menu de Exercicios: ");
        System.out.println("1 - Exercicio 1 ");
        System.out.println("2 - Exercicio 2 ");
        System.out.println("3 - Exercicio 3 ");
        System.out.println("4 - Exercicio 4 ");
        System.out.println("5 - Exercicio 5 ");

        Scanner sc = new Scanner (System.in);
        int opcao = sc.nextInt();

        switch (opcao){

            case 1:
                ex1();
                break;
            case 2: 
                ex2();
                break;
            case 3: 
                ex3();
                break;
            case 4:
                ex4();
                break;
            case 5: 
                ex5();
                break;
            default:
                System.out.println("Opção Inválida");
        }

    }

    public static void ex1(){

        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();

        v1.marca = "Jeep";
        v1.modelo = "Commander";
        v1.setVelocidade(202);

        v2.marca = "GWM";
        v2.modelo = "Haval H6";
        v2.setVelocidade(180);

        System.out.println("A marca dos carros são: " + v1.marca + " e " + v2.marca);
        System.out.println("O modelo dos carros são: " + v1.modelo + " e " + v2.modelo);
        System.out.println("A velocidade dos carros são: " + v1.getVelocidade() + "km/h" + " para o " + v1.modelo
                + " e " + v2.getVelocidade() + "km/h" + " para o " + v2.modelo);

    }

    public static void ex2(){


        Pet p1 = new Pet();

        p1.nome="Snoopy";
        p1.fome= 5;

        p1.status();

        p1.comer();

        System.out.println();
        p1.status();

    }

    public static void ex3(){

        System.out.println("Hello World");

    }
    

    public static void ex4(){

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos numeros é: " +soma );

    }

    public static void ex5(){

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10){

            System.out.println("Nota inválida, Digite uma nota de 0 a 10");
        } else {

            double media = (nota1 + nota2) / 2;

            System.out.println("A média é: " +media );

        }

    }
}
