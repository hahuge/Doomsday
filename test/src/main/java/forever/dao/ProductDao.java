package forever.dao;

import forever.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface ProductDao extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

}
