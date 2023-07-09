package br.com.guifroes1984.dao;

import br.com.guifroes1984.POJO.Product;
import br.com.guifroes1984.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    List<ProductWrapper> getAllProduct();
}
