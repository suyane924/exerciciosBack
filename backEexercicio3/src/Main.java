import java.util.ArrayList;
import java.util.List;

interface Indicavel {
    boolean isElegivel();

    void setElegivel(boolean elegivel);

    int getNumeroDeIndicacoes();

    void incrementarNumeroDeIndicacoes();
}

class Indicacao implements Indicavel {
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

    public boolean isElegivel() {
        return elegivel;
    }

    public void setElegivel(boolean elegivel) {
        this.elegivel = elegivel;
    }

    public int getNumeroDeIndicacoes() {
        return numeroDeIndicacoes;
    }

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

class OscarService {
    private List<Indicacao> indicados;

    public OscarService() {
        indicados = new ArrayList<>();
    }

    public void adicionarIndicacao(String filme, String ator, boolean elegivel) {
        if (elegivel) {
            Indicacao indicacao = new Indicacao(filme, ator, true);
            indicados.add(indicacao);
            indicacao.incrementarNumeroDeIndicacoes();
        } else {
            System.out.println("Não é possível indicar.");
        }
    }

    public List<Indicacao> obterIndicados() {
        return indicados;
    }
}

public class Main {
    public static void main(String[] args) {
        OscarService oscarService = new OscarService();

        
        oscarService.adicionarIndicacao("Titanic", "Leonardo DiCaprio", true);
        oscarService.adicionarIndicacao("La La Land", "Emma Stone", false); 
        oscarService.adicionarIndicacao("Barbie", "Margot Robbie", true);

       
        List<Indicacao> indicados = oscarService.obterIndicados();

        
        System.out.println("Lista de indicados:");
        for (Indicacao indicacao : indicados) {
            System.out.println("Filme: " + indicacao.getFilme() + ", Ator/Atriz: " + indicacao.getAtor() +
                    ", Elegível: " + indicacao.isElegivel() + ", Número de Indicações: " + indicacao.getNumeroDeIndicacoes());
        }
    }
}

//não consegui usar o spring framework