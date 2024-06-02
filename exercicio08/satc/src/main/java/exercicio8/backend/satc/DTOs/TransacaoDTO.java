package exercicio8.backend.satc.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class TransacaoDTO {
    @NotBlank(message = "O nome do pagador não pode estar em branco")
    private String pagador;
    @NotBlank(message = "O nome do recebedor não pode estar em branco")
    private String recebedor;
    @NotNull(message = "A quantidade não pode estar em branco")
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
