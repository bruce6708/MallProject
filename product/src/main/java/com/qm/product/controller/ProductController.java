package com.qm.product.controller;

import com.qm.product.domain.Product;
import com.qm.service.ProductService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @ApiOperation(value="获取商品二级类目", notes="根据一级目录id获取二级类目")
    @RequestMapping(value="/getClassTwo/{flbh1}", method=RequestMethod.GET)
    public Map GetClassList2(@PathVariable int flbh1){
        Map result=new HashMap();
       result.put("result:",productService.getClassList2(flbh1));
        return result;
    }




}
