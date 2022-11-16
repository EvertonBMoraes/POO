package CheckpointI;

public class Filme {
    private String nome;
    private Integer anoLancamento;
    private String genero;
    private String nomeMusica;

    public Filme(String nome, Integer anoLancamento, String genero, String nomeMusica) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.nomeMusica = nomeMusica;
    }

    public void exibirMusicaFilme(String nome){
        if (nome.equals(getNome())) {

            System.out.println("Nome da Musica é: " + getNomeMusica());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public void info(){
        System.out.println("__________________________");
        System.out.printf("Nome....................:%s%n",this.nome);
        System.out.printf("Genero..................:%s%n",this.genero);
        System.out.printf("Ano de lançamento.......:%s%n",this.anoLancamento);
        System.out.printf("Musica..................:%s%n",this.nomeMusica);

    }
}
