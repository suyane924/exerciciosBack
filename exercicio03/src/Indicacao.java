
public class Indicacao implements Indicavel {
    private String filme;
    private String ator;
    private boolean elegivel;
    private int numeroDeIndicacoes;

    public Indicacao(String filme, String ator, boolean elegivel) {
        this.filme = filme;
        this.ator = ator;
        this.elegivel = elegivel;
        this.numeroDeIndicacoes = 0;
    }

    @Override
    public boolean isElegivel() {
        return elegivel;
    }

    @Override
    public void setElegivel(boolean elegivel) {
        this.elegivel = elegivel;
    }

    @Override
    public int getNumeroDeIndicacoes() {
        return numeroDeIndicacoes;
    }

    @Override
    public void incrementarNumeroDeIndicacoes() {
        this.numeroDeIndicacoes++;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getAtor() {
        return ator;
    }

    public void setAtor(String ator) {
        this.ator = ator;
    }
}

