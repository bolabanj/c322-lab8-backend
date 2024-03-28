package edu.iu.habahram.ducksservice.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import edu.iu.habahram.ducksservice.repository.customerRepository;
import edu.iu.habahram.ducksservice.model.Customer;

@RestController
@CrossOrigin
public class AuthenticationController {
    customerRepository customerRepository;
    public AuthenticationController(customerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @PostMapping("/signup")
    public void signup(@RequestBody Customer customer){
        try{
            customerRepository.save(customer);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
