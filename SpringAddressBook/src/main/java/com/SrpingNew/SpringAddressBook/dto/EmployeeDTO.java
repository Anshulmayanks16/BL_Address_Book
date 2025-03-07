package com.SrpingNew.SpringAddressBook.dto;



public class EmployeeDTO {
    String name;
    String email;

    Long id;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEMail(String email){
        this.email = email;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }



}
