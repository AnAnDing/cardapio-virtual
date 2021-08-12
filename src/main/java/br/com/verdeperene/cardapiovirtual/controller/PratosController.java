package br.com.verdeperene.cardapiovirtual.controller;

import br.com.verdeperene.cardapiovirtual.model.Prato;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("pratos")
public class PratosController {

    @GetMapping
    public List<Prato> listarPratos(@RequestParam(value = "nome", required = false) String nomePrato) {
        List<Prato> lista = new ArrayList<>();

        Prato p = new Prato();
        p.setId(1L);
        p.setNome("Batata");
        p.setDescricao("Batata Baroa legal");
        lista.add(p);

        Prato p2 = new Prato();
        p2.setId(2L);
        p2.setNome("Yakissoba");
        p2.setDescricao("Massa com legumes");
        lista.add(p2);

        return lista;
    }

    @PostMapping
    public String incluirPrato(@RequestBody Prato prato) {
        return "Prato Incluido";
    }
}
