package kr.ac.hansung.cse.ecommercespringrest.repository;

import kr.ac.hansung.cse.ecommercespringrest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
