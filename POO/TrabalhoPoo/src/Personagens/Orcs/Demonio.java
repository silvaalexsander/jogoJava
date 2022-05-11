package Personagens.Orcs;

public class Demonio extends Orcs{

    private String nome = "Demonio";

    public String getNome() {
        return nome;
    }

    public Demonio() {
        super(80, 20, 60);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + super.toString() ;
    }


}
