package com.example.API.controller;

import com.example.API.model.DadosProduto;
import com.example.API.model.Produto;
import com.example.API.model.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<Produto> inserirProduto(@RequestBody DadosProduto dados){
        var produto = new Produto(dados);
        repository.save(produto);
        return ResponseEntity.ok(produto);
    }
}
