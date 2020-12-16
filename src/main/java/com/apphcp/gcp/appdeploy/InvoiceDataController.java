package com.apphcp.gcp.appdeploy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class InvoiceDataController {

    @GetMapping("/invoiceList")
    public List<InvoiceData> invoiceDataList(@RequestParam(value="id", defaultValue = "none") String id){
        List<InvoiceData> result = new ArrayList<InvoiceData>();
        final AtomicLong counter = new AtomicLong();

        Double mount = (double) 1000;
        
        InvoiceData invoiceData = new InvoiceData(counter, "BAC", "TC1", "20201231", "jacob", "88117231", "jc@gmail.com", mount);
        InvoiceData invoiceData1 = new InvoiceData(counter, "BAC", "TC1", "20201231", "jacob", "88117231", "jc@gmail.com", mount);
        result.add(invoiceData);
        result.add(invoiceData1);

         return result;
     }
}
