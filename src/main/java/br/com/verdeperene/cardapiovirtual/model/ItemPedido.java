package br.com.verdeperene.cardapiovirtual.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "item_pedido")
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    private Pedido pedido;

    @Transient
    private Produto produto;

    private Integer quantidade;
}
