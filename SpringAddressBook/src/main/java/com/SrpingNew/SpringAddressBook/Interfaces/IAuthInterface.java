package com.SrpingNew.SpringAddressBook.Interfaces;



import com.SrpingNew.SpringAddressBook.dto.AuthUserDTO;
import com.SrpingNew.SpringAddressBook.dto.LoginDTO;

import com.SrpingNew.SpringAddressBook.dto.PassDTO;
import org.springframework.stereotype.Service;

@Service
public interface IAuthInterface {

    public String register (AuthUserDTO user) throws Exception;


    public String login(LoginDTO user);

    public AuthUserDTO forgotPassword(PassDTO pass, String email) throws Exception;

    public String resetPassword(String email, String currentPass, String newPass) throws Exception;
}
