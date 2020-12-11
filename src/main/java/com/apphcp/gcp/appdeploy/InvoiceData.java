package com.apphcp.gcp.appdeploy;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

public class InvoiceData {
    @Getter @Setter private final long id;
    @Getter @Setter private final String entity;
    @Getter @Setter private final String description;
    @Getter @Setter private final Date cutDate; 
    @Getter @Setter private final String ownerId; 
    @Getter @Setter private final String mobileNumber; 
    @Getter @Setter private final String email; 

    public InvoiceData(long vid, String ventity, String vdescription, Date vcutDate, String vownerId, String vmobileNumber, String vemail){
        this.id = vid;
        this.entity = ventity;
        this.description = vdescription;
        this.cutDate = vcutDate;
        this.ownerId = vownerId;
        this.mobileNumber = vmobileNumber;
        this.email = vemail;
    }
}
