package exercicio8.backend.satc.DTOs;

public class TransacaoResponseDTO {
    private String pagador;
    private String recebedor;
    private Double quantidade;
    public String getPagador() {
        return pagador;
    }
    public void setPagador(String pagador) {
        this.pagador = pagador;
    }
    public String getRecebedor() {
        return recebedor;
    }
    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }
    public Double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

}

