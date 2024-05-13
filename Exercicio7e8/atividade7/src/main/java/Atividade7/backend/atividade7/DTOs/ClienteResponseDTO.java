package Atividade7.backend.atividade7.DTOs;

public class ClienteResponseDTO {
    private String nome;
    private Double saldo;
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

}
