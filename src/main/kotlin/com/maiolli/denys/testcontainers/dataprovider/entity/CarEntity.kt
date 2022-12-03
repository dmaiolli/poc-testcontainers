package com.maiolli.denys.testcontainers.dataprovider.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "car")
data class CarEntity(
    @Id
    val id: String,
    val name: String,
    val model: String
)