package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.models.Product;
import ru.itis.repositories.ProductsRepository;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductsRepository productsRepository;

    public List<Product> findAll(){
        return productsRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        productsRepository.deleteById(id);
    }

    @Override
    public void addProduct(Product model){
        productsRepository.save(model);
    }

}
