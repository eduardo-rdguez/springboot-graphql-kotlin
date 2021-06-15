package com.eduardo.rdguez.repository

import com.eduardo.rdguez.domain.Hero
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface HeroRepository : CrudRepository<Hero, Long> {

  override fun findAll(): List<Hero>
  fun findOneById(id: Long): Hero

}