package com.example.DataInsert.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.DataInsert.Bean.Cart;

public interface CartRepository extends CrudRepository<Cart, String> {

}
