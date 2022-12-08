package geradorAleatorioDePersonagensDnD;

public class Personagem extends Habilidades{
    String nome;
    String sexo;

    public Personagem(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        super( forca,  destreza,  constituicao,  inteligencia,  sabedoria,  carisma);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
