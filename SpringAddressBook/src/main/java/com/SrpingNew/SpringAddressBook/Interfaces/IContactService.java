package com.SrpingNew.SpringAddressBook.Interfaces;


import java.util.*;

import com.SrpingNew.SpringAddressBook.dto.ContactDTO;
import com.SrpingNew.SpringAddressBook.dto.ResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface IContactService {



    public ContactDTO get(Long id);

    public ContactDTO create(ContactDTO user, MockHttpServletRequest request);

    public String clear();

    public List<ContactDTO> getAll();

    public ContactDTO edit(ContactDTO user, Long id);

    public String delete(Long id);

    public ResponseDTO response(String message, String status);
}
