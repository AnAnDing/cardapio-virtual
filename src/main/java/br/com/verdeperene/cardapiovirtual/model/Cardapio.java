package br.com.verdeperene.cardapiovirtual.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Cardapio {
    private Long id;
    private LocalDate data;
    private List<Prato> pratos;
}
