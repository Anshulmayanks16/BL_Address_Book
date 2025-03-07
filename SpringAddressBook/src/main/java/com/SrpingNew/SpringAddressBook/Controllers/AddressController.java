package com.SrpingNew.SpringAddressBook.Controllers;

import com.SrpingNew.SpringAddressBook.dto.EmployeeDTO;
import com.SrpingNew.SpringAddressBook.dto.ResponseDTO;
import org.springframework.web.bind.annotation.*;

public class AddressController {

    //UC1
    @GetMapping("/res/get/{id}")
    public ResponseDTO get1(@PathVariable Long id){
        return new ResponseDTO("API triggered at /res/get/{id}","Success");
    }
    @PostMapping("/res/create")
    public ResponseDTO create1(@RequestBody EmployeeDTO user){
        return new ResponseDTO ("API triggered at /res/create", "Success");
    }
    @GetMapping("/res/getAll")
    public ResponseDTO getAll1(){
        return new ResponseDTO("API triggered at /res/getALL", "Success");
    }
    @PutMapping("/res/edit/{id}")
    public ResponseDTO edit1(@RequestBody EmployeeDTO user, @PathVariable Long id){
        return new ResponseDTO("API triggered at /res/edit/{id}","Success");
    }
    @DeleteMapping("/res/delete/{id}")
    public ResponseDTO delete1(@PathVariable Long id){
        return new ResponseDTO("API triggered at /res/delete/{id}", "Success");
    }
}
