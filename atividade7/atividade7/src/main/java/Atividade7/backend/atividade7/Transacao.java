package Atividade7.backend.atividade7;

public class Transacao {
    private String recebedor;
    private String pagador;
    private Double quantidade;
    public String getRecebedor() {
        return recebedor;
    }
    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }
    public String getPagador() {
        return pagador;
    }
    public void setPagador(String pagador) {
        this.pagador = pagador;
    }
    public Double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    public Transacao addTransacao(Transacao transacao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTransacao'");
    }
}
