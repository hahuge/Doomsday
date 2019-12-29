package forever.controller;

import forever.entity.Order;
import forever.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/mode/test", method = RequestMethod.GET)
    public Object getModeTest(){
        return restTemplate.getForObject("http://127.0.0.1:9001/product/1", Object.class);
    }

    @RequestMapping(value = "/mode/eureka", method = RequestMethod.GET)
    public Object getModeEureka(){
        List<ServiceInstance> instances = discoveryClient.getInstances("product_service");
        ServiceInstance instance = instances.get(0);
        return restTemplate.getForObject("http://"+instance.getHost()+":"+instance.getPort()+"/product/1", Object.class);
    }
}
