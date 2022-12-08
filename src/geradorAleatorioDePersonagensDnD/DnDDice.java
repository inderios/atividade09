package geradorAleatorioDePersonagensDnD;

public interface DnDDice {
    int dado(int quantDados, int faces);
    int dadoParaPersonagens();
    int modificador(int dado);

}
