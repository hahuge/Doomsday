package forever.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "")
public class Product {
    @Id
    private Long id;
    private String productName;
    private Integer status;
    private BigDecimal productDesc;
    private String caption;
    private Integer inventory;
}
