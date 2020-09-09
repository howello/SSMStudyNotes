package com.neusoft.ssm.Controller;

import com.neusoft.ssm.POJO.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/testJson")
    public String testJson() {
        return "json";
    }

    @ResponseBody
    @PostMapping("/test")
    public Customer test(@RequestBody Customer customer) {
        System.out.println(customer);
        return customer;
    }

    @GetMapping("/select/{id}")
    public String select(@PathVariable("id") Integer id) {
        System.out.println(id);
        Customer customer = new Customer();
        customer.setLoginname("蒋政权");
        customer.setNickname("狗币");
        System.out.println(customer);
        return "success";
    }
}
