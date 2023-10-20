package br.com.app.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.app.model.ProductModel;

@Repository
public interface ProductRepository  extends JpaRepository<ProductModel, UUID>{

}
