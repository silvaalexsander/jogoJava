package Personagens.Orcs;

public class Mago extends Orcs{

    private String nome = "Mago";

    public String getNome() {
        return nome;
    }

    public Mago() {
        super(20, 80, 40);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + super.toString() ;
    }


}
