package com.Learn.SimpleWebApp.Controller;

import com.Learn.SimpleWebApp.Model.Product;
import com.Learn.SimpleWebApp.Requestmapping;
import com.Learn.SimpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    //@RequestMapping ("/products")
    @GetMapping("/products") //Here we can using GetMapping also, Get is used for to fetch the data from the server
    public List<Product> getProducts(){
        return service.getProducts();
    }
//
    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){ //@PathVariable annotation is used for match the data like to match Id, to match number.
        return service.getProductById(prodId);
    }

    @PostMapping("/products") // here Postmapping used to create the data and send it to server, so we can use @postMapping or @RequestMapping. It is better to use postMapping while we are creating the data.
    public void addProduct(@RequestBody Product prod){ //@RequestBody is used to send the data from client to server, this RequestBody will binds the data and send it to server.
        System.out.println(prod);
        service.addProduct(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);

    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
