package br.com.verdeperene.cardapiovirtual.service;

import br.com.verdeperene.cardapiovirtual.model.Prato;
import br.com.verdeperene.cardapiovirtual.repository.PratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PratoService {

    @Autowired
    private PratoRepository repository;

    public Prato save(Prato prato) {
        return repository.save(prato);
    }

    public Iterable<Prato> list() {
        return repository.findAll();
    }
}
