package com.gvendas.gestaovendas.dto.venda;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Itens da venda requisição DTO")
public class ItemRequestDTO {

    @ApiModelProperty(value = "Quantidade")
    @NotNull(message = "Quantidade")
    @Min(value = 1, message = "Quantidade")
    private Integer quantidade;

    @ApiModelProperty(value = "Preço vendido")
    @NotNull(message = "Preço vendido")
    private BigDecimal precoVendido;

    @ApiModelProperty(value = "Código produto")
    @NotNull(message = "Código produto")
    private Long codigoProduto;

    public ItemRequestDTO(Integer quantidade, BigDecimal procoVendido, Long codigoProduto) {
        this.quantidade = quantidade;
        this.precoVendido = procoVendido;
        this.codigoProduto = codigoProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoVendido() {
        return precoVendido;
    }

    public void setPrecoVendido(BigDecimal precoVendido) {
        this.precoVendido = precoVendido;
    }

    public Long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

}
