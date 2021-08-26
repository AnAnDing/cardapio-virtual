package br.com.verdeperene.cardapiovirtual.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, length = 500)
    private String nome;

    @Column(nullable = false, length = 11)
    private String numContato;

    @Column(nullable = false)
    private LocalDate dataNascimento= LocalDate.now();

    @Column(nullable = false, length = 500)
    private String endereco;

}
