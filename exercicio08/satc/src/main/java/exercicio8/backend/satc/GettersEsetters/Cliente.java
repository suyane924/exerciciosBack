package exercicio8.backend.satc.GettersEsetters;

public class Cliente {
    private String nome;
    private Double saldo;
    private String senha;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Cliente getClienteByName(String nome2) {
        return null;

    }
    public Cliente addCliente(Cliente cliente) {
        return cliente;
        
    }

}
