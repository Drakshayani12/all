package com.example.bidirectional.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bidirectional.Entity.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {
    
    // @Query("select t from Address t where t.employee.id =:id")
    // public List<Address> findAddressForEmployee(Long id);

    @Query("select t from Address t where t.employee.id = :id")
    public List<Address> findAddressforEmployee(Long id);
}
