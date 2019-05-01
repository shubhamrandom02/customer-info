package learn.customer.info.controller;

import learn.customer.info.models.CustomerInfo;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerInfoController {

    @GetMapping("")
    public List<CustomerInfo> getAllCustomers() {
        CustomerInfo c = new CustomerInfo();
        c.setName("abc");
        return Arrays.asList(c);
    }

    @GetMapping("/{id}")
    public CustomerInfo getCustomerbyId(@PathVariable int id){
        CustomerInfo c = new CustomerInfo();
        c.setName(Integer.toString(id));
        return c;
    }

}
