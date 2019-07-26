package com.qm.product.controller;

import com.qm.product.domain.Product;
import com.qm.product.domain.T_MALL_CLASS_1;
import com.qm.service.ProductService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;

    @ApiOperation(value="获取商品详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Product GetProduct(@PathVariable long id){
        Product product=new Product();
        return productService.getProductById(id);
    }

    @ApiOperation(value="获取商品一级类目", notes="获取商品的一级类目")
    @GetMapping("/getClassOne")
    public List GetClassList(){
        return productService.getClassList();

    }




}
