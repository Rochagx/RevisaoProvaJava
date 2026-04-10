public class Aluno {

    public String nome;

    public int nota1, nota2;


    public double calcularMedia(){

        return (nota1 + nota2) / 2;

    }

    public void verificarAprovação(){

        double media = calcularMedia();

        if (media >= 6){

            System.out.println("Aprovado!");
        } else {

            System.out.println("Reprovado!");

        }

        

    }

    

}
