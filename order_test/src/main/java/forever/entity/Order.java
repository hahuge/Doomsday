package forever.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    private Long id;
    private String orderName;
    private Integer status;
    private BigDecimal price;
    private String detail;
}
