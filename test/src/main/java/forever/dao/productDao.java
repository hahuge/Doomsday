package forever.dao;

import forever.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface productDao extends JpaRepository<Product, Long>, JpaSpecificationExecutor {

    @Query("select a from AccountInfo a where a.accountId = ?1")
    Product findByAccountId(Long id);
}
