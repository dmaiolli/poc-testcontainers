package com.maiolli.denys.testcontainers.core.mapper

import com.maiolli.denys.testcontainers.core.domain.Car
import com.maiolli.denys.testcontainers.dataprovider.entity.CarEntity
import org.springframework.stereotype.Service
import java.util.*

@Service
class CarMapper {

    fun toCar(source: CarEntity) : Car {
        return Car(
            id = source.id,
            name = source.name,
            model = source.model
        )
    }

    fun toCarEntity(source: Car) : CarEntity {
        return CarEntity(
            id = source.id,
            name = source.name,
            model = source.model
        )
    }

    fun toCar(source: Optional<CarEntity>): Car? {
        if(source.isEmpty) return null

        return toCar(source.get())
    }

}