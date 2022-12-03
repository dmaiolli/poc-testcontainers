package com.maiolli.denys.testcontainers.dataprovider.database

import com.maiolli.denys.testcontainers.dataprovider.entity.CarEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CarRepository : JpaRepository<CarEntity, String> {
}