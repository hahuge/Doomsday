package forever.service.impl;

import forever.dao.OrderDao;
import forever.entity.Order;
import forever.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order findById(Long id) {
        return orderDao.findById(id).get();
    }

    @Override
    public void save(Order order) {
        orderDao.save(order);
    }

    @Override
    public void update(Order order) {
        orderDao.save(order);
    }

    @Override
    public void delete(Long id) {
        orderDao.deleteById(id);
    }
}
