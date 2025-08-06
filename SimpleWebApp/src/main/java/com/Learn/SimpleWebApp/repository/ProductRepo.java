package com.Learn.SimpleWebApp.repository;

import com.Learn.SimpleWebApp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Here @Repository can be used to take care of extra things in this repo file.
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
