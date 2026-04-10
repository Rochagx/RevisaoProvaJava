public class Pet {

    public String nome;
    public int fome;

    public void comer(){

        if (fome > 0) {
            fome--;
        }
    }

    public void status(){

        System.out.println("Nome: " +nome );
        System.out.println("Fome: " +fome ); 

    }

}
