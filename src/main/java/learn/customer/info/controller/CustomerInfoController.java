package learn.customer.info.controller;

import learn.customer.info.models.CustomerInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
public class CustomerInfoController {

    @RequestMapping("/")
    @ResponseBody
    public List<CustomerInfo> getAllCustomers(){
        CustomerInfo c = new CustomerInfo();
        c.setName("abc");
        return Arrays.asList(c);
    }

    /*@RequestMapping("/{id}/")
    public CustomerInfo getCustomerbyId(@PathVariable int id){
        CustomerInfo c = new CustomerInfo();
        c.setName(Integer.toString(id));
        return c;
    }*/

}
