package br.com.verdeperene.cardapiovirtual.controller;

import br.com.verdeperene.cardapiovirtual.model.Prato;
import br.com.verdeperene.cardapiovirtual.service.PratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pratos")
public class PratosController {

    @Autowired
    private PratoService service;

    @GetMapping
    public Iterable<Prato> listarPratos(@RequestParam(value = "nome", required = false) String nomePrato) {
        return service.list();
    }

    @PostMapping
    public Prato incluirPrato(@RequestBody Prato prato) {
        return service.save(prato);
    }
}
