package com.example.bidirectional.Service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bidirectional.Entity.Address;
import com.example.bidirectional.Repository.AddressRepository;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddressFromEmployee(Long id)
    {
        return addressRepository.findAddressforEmployee(id);
    }
    public List<Address> getALlAddress(){
        return addressRepository.findAll();
    }

    public Optional<Address> getAddressById(Long id){
        return addressRepository.findById(id);
    }

    public Address saveAddress(Address address)
    {
        return addressRepository.save(address);
    }

    public void deleteAddress(Long id)
    {
        addressRepository.deleteById(id);
    }
}
