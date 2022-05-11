import Personagens.Humanos.Arqueiro;
import Personagens.Humanos.Humanos;
import Personagens.Humanos.Robo;
import Personagens.Humanos.Soldado;
import Personagens.Orcs.Demonio;
import Personagens.Orcs.Mago;
import Personagens.Orcs.Ogro;
import Personagens.Orcs.Orcs;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {
    public static void main(String[] args) {

        ArrayList<Orcs> orcs = new ArrayList();
        ArrayList<Humanos> humanos = new ArrayList();

        Random aleatorio = new Random();

        for (int i = 0; i < 100; i++) { //Preenchendo o vetor de Humanos
            int randHumano = aleatorio.nextInt(3);
            switch (randHumano) {
                case 0:
                    humanos.add(new Arqueiro());
                    break;
                case 1:
                    humanos.add(new Soldado());
                    break;
                case 2:
                    humanos.add(new Robo());
                    break;
            }
        }

        for (int j = 0; j < 100; j++) { //Preenchendo vetor de Orcs
            int randOrc = aleatorio.nextInt(3);
            switch (randOrc) {
                case 0:
                    orcs.add(new Ogro());
                    break;
                case 1:
                    orcs.add(new Mago());
                    break;
                case 2:
                    orcs.add(new Demonio());
                    break;
            }
        }

        int vitoriaH = 0, vitoriaO = 0, empate = 0;
        for (int c = 0; c < 100; c++) {                    //Nesse loop os combates de 0 a 99 irao acontecer
            Jogo.combate(humanos.get(c), orcs.get(c));
            vitoriaH = vitoriaH + humanos.get(c).getVitoriaHumana();
            vitoriaO = vitoriaO + orcs.get(c).getVitoriaOrc();
            empate = empate + humanos.get(c).getEmpate();
        }

        System.out.println("Combates vencidos por Humanos: " + vitoriaH + "\nCombates vencidos por Orcs: " + vitoriaO + "\nEmpates: " + empate);
        if(vitoriaH > vitoriaO){
            System.out.println("\nOs Humanos venceram por " + (vitoriaH - vitoriaO) + " vitoria(s) a mais!");
        }
        else if(vitoriaO > vitoriaH){
            System.out.println("\nOs Orcs venceram por " + (vitoriaO - vitoriaH) + " vitoria(s) a mais!");
        }
        else{
            System.out.println("\nHumanos e Orcs empataram  no numero de vitorias " + vitoriaH);
        }




    }
    //Onde o combate acontece

    private static void combate(Humanos H, Orcs O) {
        Random rand = new Random();
        int estiloCombate = rand.nextInt(3);
        switch (estiloCombate) {
            //Inteligencia X Forca
            case 0:
                if (H.getInteligencia() > O.getForca()) {
                    H.ganhaVida(H.getInteligencia() - O.getForca());
                    O.perdeVida(H.getInteligencia() - O.getForca());
                } else if (O.getForca() > H.getInteligencia()) {
                    O.ganhaVida(O.getForca() - H.getInteligencia());
                    H.perdeVida(O.getForca() - H.getInteligencia());
                }

                System.out.println("\t\t\t\tInteligência X Força");
                System.out.println(H.toString() + "\n\t\tVS\n" + O.toString());
                System.out.println();

                if (H.getVida() > O.getVida()) {  //Testando qual vida eh maior
                    System.out.println(H.getNome() + " Venceu!\n");
                    H.setVitoriaHumana(H.getVitoriaHumana() + 1);

                } else if (O.getVida() > H.getVida()) {
                    System.out.println(O.getNome() + " Venceu!\n");
                    O.setVitoriaOrc(O.getVitoriaOrc() + 1);


                } else {
                    System.out.println("Empate\n");
                    H.setEmpate(H.getEmpate() + 1);
                }
                break;

            //Habilidade X Velocidade
            case 1:
                if (H.getVelocidade() > O.getHabilidade()) {
                    H.ganhaVida(H.getVelocidade() - O.getHabilidade());
                    O.perdeVida(H.getVelocidade() - O.getHabilidade());
                } else if (O.getHabilidade() > H.getVelocidade()) {
                    O.ganhaVida(O.getHabilidade() - H.getVelocidade());
                    H.perdeVida(O.getHabilidade() - H.getVelocidade());
                }

                System.out.println("\t\t\t\tVelocidade X Habilidade");
                System.out.println(H.toString() + "\n\t\tVS\n" + O.toString());
                System.out.println();

                if (H.getVida() > O.getVida()) { //Testando qual vida eh maior
                    System.out.println(H.getNome() + " Venceu!\n");
                    H.setVitoriaHumana(H.getVitoriaHumana() + 1);

                } else if (O.getVida() > H.getVida()) {
                    System.out.println(O.getNome() + " Venceu!\n");
                    O.setVitoriaOrc(O.getVitoriaOrc() + 1);

                } else {
                    System.out.println("Empate\n");
                    H.setEmpate(H.getEmpate() + 1);
                }
                break;

            //Agilidade X Equipamento
            case 2:
                if (H.getEquipamento() > O.getAgilidade()) {
                    H.ganhaVida(H.getEquipamento() - O.getAgilidade());
                    O.perdeVida(H.getEquipamento() - O.getAgilidade());
                } else if (O.getAgilidade() > H.getEquipamento()) {
                    O.ganhaVida(O.getAgilidade() - H.getEquipamento());
                    H.perdeVida(O.getAgilidade() - H.getEquipamento());
                }

                System.out.println("\t\t\t\tEquipamento X Agilidade");
                System.out.println(H.toString() + "\n\t\tVS\n" + O.toString());
                System.out.println();

                if (H.getVida() > O.getVida()) { //Testando qual vida eh maior
                    System.out.println(H.getNome() + " Venceu!\n");
                    H.setVitoriaHumana(H.getVitoriaHumana() + 1);

                } else if (O.getVida() > H.getVida()) {
                    System.out.println(O.getNome() + " Venceu!\n");
                    O.setVitoriaOrc(O.getVitoriaOrc() + 1);

                } else {
                    System.out.println("Empate\n");
                    H.setEmpate(H.getEmpate() + 1);
                }
                break;
        }


    }

}
