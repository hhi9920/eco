package kr.ac.hansung.cse.ecommercespringrest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass   //@MappedSuperclass를 이용하여 공통요소를 Super Class에 정의
@Getter
@Setter
public class AbstractEntity {

    @Id
    @GeneratedValue
    private Long id;  //공통 매핑 정보

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.id, AbstractEntity.class.cast(obj).id);
    }

    @Override
    public int hashCode() {

        return Objects.hashCode(id);
    }

}
