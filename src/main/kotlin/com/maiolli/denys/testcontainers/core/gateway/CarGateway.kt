package com.maiolli.denys.testcontainers.core.gateway

import com.maiolli.denys.testcontainers.core.domain.Car

interface CarGateway {

    fun findById(id: String) : Car?

    fun save(car: Car) : Car

}