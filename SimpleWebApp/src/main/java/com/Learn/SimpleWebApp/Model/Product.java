package com.Learn.SimpleWebApp.Model;

//import lombok.AllArgsConstructor;
//import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

//@Data
//@AllArgsConstructor
// this Data Lombok will create and handle the constructors for the below product details such as Id, name, price. We don't have to create constructors manually for each prod details, this @Data annotation will take care of creating constructors.
@Component
@Entity //It can be used for, if you want a class and that class has to be create or convert into a table then @Entity can be used.
public class Product {

    @Id //above @Entity was used because we want to create a table in H2 database, for that table we need primary key. So the primary Key for the table is prodID. So that's why we used @Id above the primary Key known as prodId.
    private int prodID;
    private String prodname;
    private int prodprice;

    public Product(){

    }

    public Product(int prodID, String prodname, int prodprice) {
        this.prodID = prodID;
        this.prodname = prodname;
        this.prodprice = prodprice;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public int getProdprice() {
        return prodprice;
    }

    public void setProdprice(int prodprice) {
        this.prodprice = prodprice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodID=" + prodID +
                ", prodname='" + prodname + '\'' +
                ", prodprice=" + prodprice +
                '}';
    }



}
