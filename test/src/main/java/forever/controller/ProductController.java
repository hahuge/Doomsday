package forever.controller;

import forever.entity.Product;
import forever.service.ProductService;
import forever.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id){
        Product product = productService.findById(id);
        return product;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String findById(@RequestBody Product product){
        productService.save(product);
        return "success";
    }
}
