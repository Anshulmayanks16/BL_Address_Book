package com.SrpingNew.SpringAddressBook.repositories;




import com.SrpingNew.SpringAddressBook.entities.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactEntity, Long> {

    public ContactEntity findByEmail(String email);

}