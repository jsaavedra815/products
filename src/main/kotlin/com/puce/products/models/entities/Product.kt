package com.puce.products.models.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id

@Entity
data class Product(
    @Id @GeneratedValue(strategy = IDENTITY)
    val id: Long = 0,
    val name: String = "",
    val price: Double = 0.0
)