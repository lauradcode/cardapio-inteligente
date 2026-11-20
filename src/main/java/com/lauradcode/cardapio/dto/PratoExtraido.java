package com.lauradcode.cardapio.dto;


import com.lauradcode.cardapio.model.Alergeno;
import com.lauradcode.cardapio.model.Categoria;

import java.math.BigDecimal;
import java.util.Set;

public record PratoExtraido(
        String nome,
        String descricao,
        BigDecimal preco,
        Categoria categoria,
        Set<Alergeno> alergenosProvaveis,
        Boolean contemLactose,
        Boolean vegetariano,
        Boolean vegano,
        String justificativa
) {}
