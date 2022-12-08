package geradorAleatorioDePersonagensDnD;

public class DnDMetodos implements DnDDice {
    public int dado(int quantDados, int faces) {
        int resultado = 0;
        for (int i = 0; i < quantDados; i++){
            resultado = (int) Math.round(Math.random()*(faces - 1) +1);
        }
        return resultado;
    }

    @Override
    public int dadoParaPersonagens() {
        int[] dados = new int[3];
        dados[0] = 0;
        for(int i = 0; i < dados.length; i++) {
            int resultado = dado(1,6);
            if(dados[i] < resultado) {
                dados[i] = resultado;
            }
        }
        return dados[0] + dados[1] + dados[2];
    }

    @Override
    public int modificador(int D20) {
        int modificador = 0;
        if (D20 == 1) {
            modificador = -5;
        }else if (D20 == 2 || D20 == 3) {
            modificador = -4;
        } else if (D20 == 4 || D20 == 5) {
            modificador = -3;
        } else if (D20 == 6 || D20 == 7) {
            modificador = -2;
        } else if (D20 == 8 || D20 == 9) {
            modificador = -1;
        } else if (D20 == 10  || D20 == 11) {
            modificador = 0;
        } else if (D20 == 12 || D20 == 13) {
            modificador = 1;
        } else if (D20 == 14 || D20 == 15) {
            modificador = 2;
        } else if (D20 == 16 || D20 == 17) {
            modificador = 3;
        } else if (D20 == 18 || D20 == 19) {
            modificador = 4;
        } else if (D20 == 20 || D20 == 21 ) {
            modificador = 5;
        } else if (D20 == 22  || D20 == 23) {
            modificador = 6;
        } else if (D20 == 24 || D20 == 25) {
            modificador = 7;
        } else if (D20 == 26 || D20 == 27) {
            modificador = 8;
        } else if (D20 == 28 || D20 == 29) {
            modificador = 9;
        } else if (D20 == 30) {
            modificador = 10;
        }else {
            modificador = Integer.parseInt(null);
        }
        return modificador;
    }
}
