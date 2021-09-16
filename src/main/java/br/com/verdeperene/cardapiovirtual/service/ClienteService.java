package br.com.verdeperene.cardapiovirtual.service;

import br.com.verdeperene.cardapiovirtual.model.Cliente;
import br.com.verdeperene.cardapiovirtual.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
//TODO: Criar Validação pra nao deixar incluir mais de um cliente com o mesmo Telefone
//TODO: Permitir Filtrar por Nome - Opcional: Ver como filtrar com Like em JPQL
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente insert(Cliente cliente){
        return repository.save(cliente);
    }

    public Cliente update(Cliente cliente){
        return repository.save(cliente);
    }

    public Page<Cliente> list(int pageSize, int pageNumber){
        var pg= PageRequest.of(pageNumber, pageSize);
        return repository.findAll(pg);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
