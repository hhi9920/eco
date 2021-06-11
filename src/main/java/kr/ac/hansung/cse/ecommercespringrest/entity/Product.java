package kr.ac.hansung.cse.ecommercespringrest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

//Product는 다수 개의 Category에 속할 수 있다. (ManyToMany 관계 +jointable 사용)
@Getter
@Setter
@Entity
@Table(name = "app_product")
public class Product extends AbstractEntity {

    //id는 AbstractEntity에 있음.

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "app_product_category",
            joinColumns = @JoinColumn(name = "productid"),
            inverseJoinColumns = @JoinColumn(name = "categoryid"))
    private List<Category> categories;

    @Column(name = "price", nullable = false)
    private double price;

}