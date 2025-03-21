package com.SrpingNew.SpringAddressBook.repositories;


import com.SrpingNew.SpringAddressBook.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    public EmployeeEntity findByEmail(String email);

}
