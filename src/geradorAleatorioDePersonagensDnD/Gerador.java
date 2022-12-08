package geradorAleatorioDePersonagensDnD;
import javax.swing.*;
public class Gerador {
    public static void main(String[] args) {
        boolean sair = true;
        while(sair) {
            JOptionPane.showMessageDialog(null, "Bem-Vindo ao gerador de pontos aleatorios para personagens de D&D");
            DnDDice sistema = new DnDMetodos();
            int forca, destreza,  constituicao, inteligencia, sabedoria, carisma;
            Object[] racas = {"Anão","Elfo","Halfling","Humano","Dragonborn", "Gnomo","Orc", "Tiefling"};
            int raca;
            raca = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma raça:" +
                    " \n1: Anão \n2: Elfo\n3: Halfling \n4:Humano\n 5:Dragonborn\n 6: Gnomo \n7:Orc \n8:Tiefling\n"));
            forca = sistema.dadoParaPersonagens();
            destreza = sistema.dadoParaPersonagens();
            constituicao = sistema.dadoParaPersonagens();
            inteligencia = sistema.dadoParaPersonagens();
            sabedoria = sistema.dadoParaPersonagens();
            carisma = sistema.dadoParaPersonagens();
            if(raca == 1) {
                constituicao += 2;
                int anao = Integer.parseInt(JOptionPane.showInputDialog("1: Anão da colina\n 2: Anão da montanh;\n"));
                if (anao == 1) {
                    sabedoria += 1;
                }else if (anao == 2) {
                    forca += 2;
                }
            } else if (raca == 2 ) {
                destreza += 2;
                int elfo = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1:Alto elfo\n 2:Elfos da floresta\n 3: Elfo sombrio"));
                if (elfo == 1) {
                    inteligencia += 1;
                }else if(elfo == 2) {
                    sabedoria += 1;
                } else if (elfo == 3) {
                    carisma += 1;
                }
            }else if (raca == 3) {
                destreza += 2;
                int halfling = Integer.parseInt(JOptionPane.showInputDialog(null, "1:Halling pés leves \n2:Halling robusto"));
                if (halfling == 1) {
                    carisma += 1;
                } else if (halfling == 2) {
                    constituicao += 1;
                }
            }else if (raca == 4) {
                forca += 1;
                destreza +=1;
                constituicao +=1;
                inteligencia +=1;
                sabedoria +=1;
                carisma +=1;
            }else if (raca == 5) {
                forca += 2;
                carisma +=1;
            }else if (raca == 6) {
                inteligencia += 2;
                int gnomo = Integer.parseInt(JOptionPane.showInputDialog(null, "1: Gnomo da floresta 2: Gnomo da pedra"));
                if (gnomo == 1) {
                    destreza += 1;
                } else if (gnomo == 2) {
                    constituicao += 1;
                }
            }else if (raca == 7) {
                forca += 2;
                constituicao += 1;
            }else if (raca == 8) {
                inteligencia +=1;
                carisma +=2;
            }
            Personagem novoPersonagen = new Personagem(forca, destreza, constituicao, inteligencia, sabedoria, carisma);
            int modificadorForca, modificadorDestreza, modificadorConstituicao, modificadorInteligencia, modificaroSabedoria, modificaorCarisma;
            modificadorForca = sistema.modificador(forca);
            modificadorDestreza = sistema.modificador(destreza);
            modificadorConstituicao = sistema.modificador(constituicao);
            modificadorInteligencia = sistema.modificador(inteligencia);
            modificaroSabedoria = sistema.modificador(sabedoria);
            modificaorCarisma = sistema.modificador(carisma);
            String mensagem = String.format("Dado = Modificador \n" + forca + " = " + modificadorForca + "\n" +
                    destreza + " = " + modificadorDestreza + "\n" + constituicao + " = " + modificadorConstituicao + "\n"
                    + inteligencia+ " = "+modificadorInteligencia + "\n" + sabedoria + " = " + modificaroSabedoria + "\n" +
                    carisma + " = " + modificaorCarisma + "\n");
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}
