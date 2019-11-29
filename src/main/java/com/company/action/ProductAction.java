package com.company.action;

import com.company.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ProductAction {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "findall.do",method = RequestMethod.GET)
    public String findAll(Map<String,Object> map, HttpSession session){
        map.put("productsFromServer",productService.findAll());
        session.setAttribute("username","SCOTT");
        return "show_product";
    }
}
