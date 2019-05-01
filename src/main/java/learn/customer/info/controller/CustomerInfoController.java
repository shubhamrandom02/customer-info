package learn.customer.info.controller;

import learn.customer.info.models.CustomerInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerInfoController {

    @RequestMapping("/")
    public List<CustomerInfo> getAllCustomers() {
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
