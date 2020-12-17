package com.apphcp.gcp.appdeploy;

public class Invoice {
    private final String id;
    private final String description;
    private final String entity;
    private final String clientId;
    private final String clientPhone;
    private final String clientEmail;
    private final String cutDate;
    private final Double amount;



    public Invoice(String id, String description, String entity, String clientId, String clientPhone, String clientEmail, 
    String cutDate, Double amount){
        this.id = id;
        this.description = description;
        this.entity = entity;
        this.clientId = clientId;
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
        this.cutDate = cutDate;
        this.amount = amount;
    }

    public String getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public String getEntity(){
        return entity;
    }
    
    public String getClientId(){
        return clientId;
    }

    public String getClientPhone(){
        return clientPhone;
    }

    public String getClientEmail(){
        return clientEmail;
    }

    public String getCutDate(){
        return cutDate;
    }

    public Double getAmount(){
        return amount;
    }
}
