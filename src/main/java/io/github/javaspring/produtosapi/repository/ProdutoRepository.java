package io.github.javaspring.produtosapi.repository;

import io.github.javaspring.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String>{

}
