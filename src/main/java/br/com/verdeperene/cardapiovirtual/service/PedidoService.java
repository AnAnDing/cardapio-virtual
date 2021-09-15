package br.com.verdeperene.cardapiovirtual.service;

import br.com.verdeperene.cardapiovirtual.model.Pedido;
import br.com.verdeperene.cardapiovirtual.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class PedidoService {


    @Autowired
    private PedidoRepository repository;

    public Pedido insert(Pedido pedido){
        return repository.save(pedido);
    }

    public Pedido update(Pedido pedido){
        return repository.save(pedido);
    }

    public Page<Pedido> list(int pageSize, int pageNumber){
        var pg= PageRequest.of(pageNumber, pageSize);
        return repository.findAll(pg);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
