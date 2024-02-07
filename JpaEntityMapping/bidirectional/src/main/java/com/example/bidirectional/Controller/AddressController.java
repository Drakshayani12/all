package com.example.bidirectional.Controller;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.bidirectional.Entity.Address;
import com.example.bidirectional.Service.AddressService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/address")


public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getALlAddress(){
        return addressService.getALlAddress();
    }

    @GetMapping("/employee/{id}")
    public List<Address> getAddressByEmployee(@PathVariable Long id) {
        return addressService.getAllAddressFromEmployee(id);
    }
    

    @PostMapping("/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id)
    {
        return addressService.getAddressById(id);
    }

@PostMapping
 public Address saveAddress(@RequestBody Address address)
    {
        return addressService.saveAddress(address);

    }
    @DeleteMapping("/{id}")
    public void deleteAddress(Long id)
    {
        addressService.deleteAddress(id);
    }
}
