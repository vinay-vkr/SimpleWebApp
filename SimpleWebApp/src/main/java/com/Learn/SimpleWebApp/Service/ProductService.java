package com.Learn.SimpleWebApp.Service;

import com.Learn.SimpleWebApp.Model.Product;

import com.Learn.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service //@service annotation is used for to get extra features, this file name is productservice it is service file so that's why we have to use @Service annotation to get extra features to take care of everything thing.
public class ProductService{

    @Autowired
    ProductRepo repo; // We are declaring variable by using ProductRepo class name with the help of @Autowired annotation it can be useful to use the information in the ProductRepo


//    List<Product> products= new ArrayList<> (Arrays.asList(new Product(101, "Iphone 15", 78000),
//                            new Product(102, "Samsung S25", 85000)));
//

    //here we are removing products list as shown in the above comments, and after removing we are using Spring Data JPA to shorten the code as shown follows:
    public List<Product> getProducts(){
        return repo.findAll(); //Spring data Jpa used to shorten code
    }

    //This method is used for to get or read the date by using the particular data by using their Id's.
    public Product getProductById(int prodId) {// This is used for get the data GET
//        return products.stream() //Here stream API was used. because we are creating the new List without disturbing the original list such as products
//                .filter(p -> p.getProdID() == prodId)//Here we are filtering the new stream which was created above
//                .findFirst().get();
        return repo.findById(prodId).orElse(new Product()); //Spring data Jpa used to shorten code

    }

    public void addProduct(Product prod) {// this is used for POST the data or create the data
        repo.save(prod); //Spring data Jpa used to shorten code, repo.save is used for to add the product.
    }

    public void updateProduct(Product prod) {//Update the existing data
//        int index=0;
//        for(int i=0;i<products.size();i++)
//            if(products.get(i).getProdID()==prod.getProdID())
//                index=i;
//        products.set(index, prod);
        repo.save(prod); //Spring data Jpa used to shorten code, repo.save is used for to add the product and update the product.
    }

    public void deleteProduct(int prodId) {//used for deleting the existing data.
//        int index=0;
//        for(int i=0;i<products.size();i++)
//            if(products.get(i).getProdID()==prodId)
//                index=i;
//        products.remove(index);
        repo.deleteById(prodId); //Spring data Jpa used to shorten code, repo.deleteById is used for to delete the data by using primary key int.
    }
}
