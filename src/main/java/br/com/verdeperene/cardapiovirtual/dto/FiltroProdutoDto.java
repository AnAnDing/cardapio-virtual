package br.com.verdeperene.cardapiovirtual.dto;

import lombok.Data;

@Data
public class FiltroProdutoDto {
    int pageSize = 10;
    int pageNumber = 0;
    private String nome;
}
