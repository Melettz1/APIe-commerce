package com.example.API.model;

import java.math.BigDecimal;

public record DadosProduto(
        Long id,
        String nome,
        String descricao,
        BigDecimal preco,
        String categoria
) {
}
