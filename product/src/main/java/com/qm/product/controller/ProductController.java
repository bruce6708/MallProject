package com.qm.product.controller;

import com.qm.product.domain.T_MALL_PRODUCT;
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
    @ApiImplicitParam(name = "flbh2", value = "用户ID", required = true, dataType = "int")
    @RequestMapping(value="/{flbh2}", method=RequestMethod.GET)
    public  List<T_MALL_PRODUCT> GetProduct(@PathVariable int flbh2){
        T_MALL_PRODUCT product=new T_MALL_PRODUCT();
        return productService.getProductById(flbh2);
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
