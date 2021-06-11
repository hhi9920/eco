package kr.ac.hansung.cse.ecommercespringrest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;



@Getter
@Setter
@Entity
@Table(name = "app_category")
public class Category extends AbstractEntity {

    //id는 AbstractEntity에 있음 (상속받는다.)

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "parentid")
    private Category parent;


    //Product와 Category는 n:n 관계
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
    private List<Product> products;


    //Category는 다수개의 SubCategory를 가질 수 있다.
    //-> Category와 childCategory 1:n 관계
    @OneToMany(mappedBy = "parent")
    private List<Category> childCategories;

}
