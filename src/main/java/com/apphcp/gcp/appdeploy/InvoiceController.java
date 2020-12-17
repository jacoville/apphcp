package com.apphcp.gcp.appdeploy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InvoiceController {

    @GetMapping("/invoice")
    public Invoice invoice(){
        Double amount = (double) 1000;
        
         return new Invoice("1", "TC1", "Bac", "12345678", "2320022", "user@gmail.com", "20201231", amount);
     }

    @RequestMapping(value = "/invoiceList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Invoice> invoiceList(){
        Double amount = (double) 1000;
        Invoice I1 = new Invoice("1", "TC1", "Bac", "12345678", "2320022", "user@gmail.com", "20201231", amount);
        Invoice I2 = new Invoice("2", "TC2", "Bac", "12345678", "2320022", "user@gmail.com", "20201231", amount);

        List<Invoice> list = new ArrayList<>();
        list.add(I1);
        list.add(I2);
        return list;
     }

}
