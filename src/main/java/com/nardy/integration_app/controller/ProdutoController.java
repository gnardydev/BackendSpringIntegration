package com.nardy.integration_app.controller;
import com.nardy.integration_app.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.nardy.integration_app.model.Produto;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "http://localhost:4200") //config angular
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository; //injecao de dependencias

    @GetMapping
    public List<Produto> listarProdutos(){
        return repository.findAll(); //metodo do tipo list que retorna os produtos
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto){
        return repository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        repository.deleteById(id);
    }

}
