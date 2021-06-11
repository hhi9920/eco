package kr.ac.hansung.cse.ecommercespringrest.repository;


import kr.ac.hansung.cse.ecommercespringrest.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;




public interface CategoryRepository extends JpaRepository<Category, Long> {


}
