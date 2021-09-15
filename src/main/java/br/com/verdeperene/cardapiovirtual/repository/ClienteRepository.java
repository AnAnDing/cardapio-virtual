package br.com.verdeperene.cardapiovirtual.repository;

import br.com.verdeperene.cardapiovirtual.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long>, PagingAndSortingRepository<Cliente, Long> {
}
