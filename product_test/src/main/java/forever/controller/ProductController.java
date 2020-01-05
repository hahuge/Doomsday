package forever.controller;

import forever.entity.Product;
import forever.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Value("${server.port}")
    private String port;

    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id){
        Product product = productService.findById(id);
        product.setProductName("访问服务地址：" + ip + ":" + port);
        return product;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String findById(@RequestBody Product product){
        productService.save(product);
        return "success";
    }
}
