package Personagens.Humanos;

public class Arqueiro extends Humanos {

    private String nome = "Arqueiro";

    public String getNome() {
        return nome;
    }

    public Arqueiro() {
        super(60, 60, 20);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + super.toString() ;
    }


}
