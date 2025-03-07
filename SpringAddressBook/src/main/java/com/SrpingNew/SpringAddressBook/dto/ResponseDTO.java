package com.SrpingNew.SpringAddressBook.dto;




public class ResponseDTO {

    private String message;
    private String status;

    public ResponseDTO(String s, String success) {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
