package com.qm.product.controller;

import com.qm.product.domain.Product;
import com.qm.service.ProductService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;

//    @RequestMapping(value = "{id}",method = RequestMethod.GET)
//    public Product getProductById(@PathVariable long id){
//        Product product=this.productService.getProductById(id);
//        System.out.println(product);
//        return product;
//
//    }



    @RequestMapping("getProduct/{id}")
    public String GetProduct(@PathVariable long id){
        return productService.getProductById(id).toString();
    }




}
