package com.puce.products.controllers

import com.puce.products.models.entities.Product
import com.puce.products.services.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/products")
class ProductController(
    private val service: ProductService
) {
    @GetMapping
    fun findAll(): List<Product>{
        return service.findAll()
    }

    @PostMapping
    fun save(
        @RequestBody product: Product
    ) = service.saveProduct(product)

}