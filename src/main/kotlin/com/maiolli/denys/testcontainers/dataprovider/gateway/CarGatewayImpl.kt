package com.maiolli.denys.testcontainers.dataprovider.gateway

import com.maiolli.denys.testcontainers.core.domain.Car
import com.maiolli.denys.testcontainers.core.gateway.CarGateway
import com.maiolli.denys.testcontainers.core.mapper.CarMapper
import com.maiolli.denys.testcontainers.dataprovider.database.CarRepository
import org.springframework.stereotype.Service

@Service
class CarGatewayImpl(
    private val carRepository: CarRepository,
    private val carMapper: CarMapper) : CarGateway {

    override fun findById(id: String): Car? {
        return carRepository.findById(id).run { carMapper.toCar(this) }
    }

    override fun save(car: Car): Car {
        val carEntity = carRepository.save(carMapper.toCarEntity(car))

        return carMapper.toCar(carEntity)
    }
}