package com.apphcp.gcp.appdeploy;

import java.sql.Date;
import java.util.concurrent.atomic.AtomicLong;

import lombok.Getter;
import lombok.Setter;

public class InvoiceData {
    @Getter @Setter private final AtomicLong id;
    @Getter @Setter private final String entity;
    @Getter @Setter private final String description;
    @Getter @Setter private final String cutDate; 
    @Getter @Setter private final String ownerId; 
    @Getter @Setter private final String mobileNumber; 
    @Getter @Setter private final String email; 
    @Getter @Setter private final Double monto; 

    public InvoiceData(AtomicLong counter, String ventity, String vdescription, String vcutDate, String vownerId,
        String vmobileNumber, String vemail, Double mount) {
        this.id = counter;
        this.entity = ventity;
        this.description = vdescription;
        this.cutDate = vcutDate;
        this.ownerId = vownerId;
        this.mobileNumber = vmobileNumber;
        this.email = vemail;
        this.monto = mount;
    }
}
