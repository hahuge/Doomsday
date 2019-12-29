package forever.controller;

import forever.entity.Order;
import forever.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Object findById(){
        return restTemplate.getForObject("http://127.0.0.1:9001/product/1", Object.class);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Order findById(@PathVariable Long id){
        Order order = orderService.findById(id);
        return order;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String findById(@RequestBody Order order){
        orderService.save(order);
        return "success";
    }
}
