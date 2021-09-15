package br.com.verdeperene.cardapiovirtual.repository;

import br.com.verdeperene.cardapiovirtual.model.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long>, PagingAndSortingRepository<Pedido, Long> {
}
