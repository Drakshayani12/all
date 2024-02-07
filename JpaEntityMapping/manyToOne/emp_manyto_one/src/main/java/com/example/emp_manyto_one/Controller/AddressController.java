package com.example.emp_manyto_one.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.emp_manyto_one.Service.AddressService;
import com.example.emp_manyto_one.entity.Address;

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
    public List<Address> getAllAddress()
    {
        return addressService.getAllAddress();
    }
    @PostMapping("/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id)
    {
        return addressService.getAddressById(id);
    }

    @PostMapping
    public Address getsaveAddress(@RequestBody Address address)
    {
        return addressService.saveAddress(address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id)
    {
         addressService.deleteAddress(id);
    }
    
}
