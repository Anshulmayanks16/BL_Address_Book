package com.SrpingNew.SpringAddressBook.Interfaces;

import java.util.*;

import com.SrpingNew.SpringAddressBook.dto.EmployeeDTO;
import com.SrpingNew.SpringAddressBook.dto.ResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeService {



    public EmployeeDTO get(Long id);

    public EmployeeDTO create(EmployeeDTO user);

    public String clear();

    public List<EmployeeDTO> getAll();

    public EmployeeDTO edit(EmployeeDTO user, Long id);

    public String delete(Long id);

    public ResponseDTO response(String message, String status);
}