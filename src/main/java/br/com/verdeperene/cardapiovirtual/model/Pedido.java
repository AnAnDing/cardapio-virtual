package br.com.verdeperene.cardapiovirtual.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Transient
    private Cliente cliente;

    @Transient
    private List<ItemPedido> produtos;

    private BigDecimal total;

    private LocalDateTime dataPedido;

}
