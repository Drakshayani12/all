package com.example.emp_manyto_one.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp_manyto_one.Repository.AddressRespository;
import com.example.emp_manyto_one.entity.Address;

@Service
public class AddressService {

    @Autowired
    private AddressRespository addressRespository;

    public List<Address> getAllAddress(){
        return addressRespository.findAll();
    }

    public Optional<Address> getAddressById(Long id){
        return addressRespository.findById(id);
}
public Address saveAddress(Address address)
{
    return addressRespository.save(address);
}

public void deleteAddress(Long id)
{
    addressRespository.deleteById(id);
}

}
