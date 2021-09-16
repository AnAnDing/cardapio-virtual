package br.com.verdeperene.cardapiovirtual.model;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, length = 500, unique = true)
    private String nome;

    @Column(name = "descricao", length = 1000)
    private String descricao;

    private Integer peso;

    private BigDecimal valor;

    private Integer quantidade;
}
