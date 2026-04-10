
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Menu de Exercicios: ");
        System.out.println("1 - Exercicio 1 ");
        System.out.println("2 - Exercicio 2 ");
        System.out.println("3 - Exercicio 3 ");
        System.out.println("4 - Exercicio 4 ");
        System.out.println("5 - Exercicio 5 ");
        System.out.println("6 - Exercicio 6 ");
        System.out.println("7 - Exercicio 7 ");
        System.out.println("8 - Exercicio 8 ");
        System.out.println("9 - Exercicio 9 ");
        System.out.println("10 - Exercicio 10 ");
        System.out.println("11 - Exercicio 11 ");
        System.out.println("12 - Exercicio 12 ");
        System.out.println("13 - Exercicio 13 ");
        System.out.println("14 - Exercicio 14 ");
        System.out.println("15 - Exercicio 15 ");
        System.out.println("16 - Exercicio 16 ");
        System.out.println("17 - Exercicio 17 ");
        System.out.println("18 - Exercicio 18 ");
        
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
            case 6: 
                ex6();
                break;
            case 7: 
                ex7();
                break;
            case 8: 
                ex8();
                break;
            case 9: 
                ex9();
                break;
            case 10:
                ex10();
                break;
            case 11:
                ex11();
                break;
            case 12:
                ex12();
                break;
            case 13:
                ex13();
                break;
            case 14:
                ex14();
                break;
            case 15:
                ex15();
                break;
            case 16:
                ex16();
                break;
            case 17:
                ex17();
                break;
            case 18:
                ex18();
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

    public static void ex6(){

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        double desconto = valorProduto * 0.05;

        System.out.println(" O valor do desconto é de: " +desconto );

    }

    public static void ex7(){

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do combustível: ");
        double valorCombustivel = sc.nextDouble();

        System.out.println("Digite qual o valor a ser abastecido: ");
        double valorAbastecimento = sc.nextDouble();

        double litros = valorAbastecimento / valorCombustivel;

        System.out.println("A quantidade de litros é de: " +litros );

    }

    public static void ex8(){

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a quantidade de dias trabalhados: ");
        int diasTrabalhados = sc.nextInt();

        double salario = diasTrabalhados * 150;
        double inss = salario * 0.07;
        double ir = salario * 0.15;
        double salarioFinal = salario - inss - ir;
        
        System.out.println("O valor a ser pago ao pedreiro é de: " +salarioFinal);

    }

    public static void ex9(){

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        int idadeDias = idade * 365 + (idade / 4);

        System.out.println("A sua idade em dias é de: " +idadeDias );

    }

    public static void ex10(){

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor do produto: ");
    double precoProduto = sc.nextDouble();

    System.out.println("Digite a quantidade de parcelas: ");
    int parcelas = sc.nextInt();

    double taxaJuros = 0.02 * parcelas;
    double valorFinal = precoProduto * (1 + taxaJuros);
    double valorParcela = valorFinal / parcelas;

    System.out.printf("O valor da Parcela é de: %.2f", valorParcela);

    }

    public static void ex11(){

        Scanner sc = new Scanner (System.in);

        Idade pessoa = new Idade();

        System.out.println("Digite a sua idade: ");
        pessoa.idade = sc.nextInt();

        pessoa.verIdade();

    }

    public static void ex12(){

        Idade2 individuo = new Idade2();

        individuo.idade = 18;
        individuo.verificarIdade();

    }

    public static void ex13(){

       Numero parImpar = new Numero();

       parImpar.valor = 23;
       parImpar.verificarParImpar();

    }

    public static void ex14(){

        Scanner sc = new Scanner (System.in);

        Retangulo area = new Retangulo();

        System.out.println("Digite a altura do retangulo: ");
        area.altura = sc.nextInt();

        System.out.println("Digite a largura do retangulo: ");
        area.largura = sc.nextInt();

        area.calcularArea();

    }


    public static void ex15(){

        Scanner sc = new Scanner (System.in);

        Pessoa p1 = new Pessoa();

        System.out.println("Digite o seu nome: ");
        p1.nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        p1.idade = sc.nextInt();

        System.out.println("O seu nome é " +p1.nome+ " e sua idade é " +p1.idade );

      //  p1.nome="Guilherme";
      //  p1.idade=18;

    }

    public static void ex16(){

        Scanner sc = new Scanner (System.in);

        Aluno resultado = new Aluno();

        System.out.println("Digite a primeira nota: ");
        resultado.nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        resultado.nota2 = sc.nextInt();

        System.out.println("A sua média foi: " +resultado.calcularMedia() );
        resultado.verificarAprovação();

    }

    public static void ex17(){

    Scanner sc = new Scanner(System.in);

    Carro c1 = new Carro();

    System.out.println("Digite a marca do seu carro: ");
    c1.marca = sc.nextLine();

    System.out.println("Digite a velocidade inicial: ");
    c1.velocidade = sc.nextInt();

    System.out.println("Quanto deseja acelerar? ");
    int acelerar = sc.nextInt();
    c1.acelerar(acelerar);

    c1.mostrarVelocidade();

    System.out.println("Quanto deseja frear? ");
    int frear = sc.nextInt();
    c1.frear(frear);

    c1.mostrarVelocidade();

    }

    public static void ex18(){

        Scanner sc = new Scanner (System.in);

        Dobro resultado = new Dobro();

        System.out.println("Digite um numero: ");
        resultado.valor = sc.nextInt();
        
        resultado.mostrarDobro();

    }

}
