package com.nardy.integration_app.repository;

import com.nardy.integration_app.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository faz conexao com banco, interface que gerencia o banco
//interface não pode ter implementação concreta de métodos, apenas assinaturas, chamadas
public interface ProdutoRepository extends JpaRepository <Produto, Long>{
}
