package com.puce.products.services

import com.puce.products.models.entities.Product
import com.puce.products.repositories.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val repository: ProductRepository
) {
    fun findAll(): List<Product> {
        return repository.findAll()
    }

    fun saveProduct(product: Product): Product{
        val productName = product.name
        if (productName == "Fiora"){
            return Product(
                id = 0,
                name = "No me gusta la $productName y por eso no te la guardo",
                price = -7.0
            )
        }
        return repository.save(product)
    }
}