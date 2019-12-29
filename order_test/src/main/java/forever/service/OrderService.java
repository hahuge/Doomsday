package forever.service;

import forever.entity.Order;

public interface OrderService {

    Order findById(Long id);

    void save(Order order);

    void update(Order order);

    void delete(Long id);
}
