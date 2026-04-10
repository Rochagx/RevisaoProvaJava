public class Carro {

    public String marca;
    public int velocidade;

    public void acelerar(int valor){

        velocidade += valor;

    }

    public void frear(int valor){

        velocidade -= valor;


        if (velocidade < 0){

            velocidade = 0;

        }

    }

    public void mostrarVelocidade(){
        
        System.out.println("Marca: " +marca);
        System.out.println("Velocidade: " +velocidade+ "Km/h");

    }

}
