package com.eduardo.rdguez.service

import com.eduardo.rdguez.domain.Hero

interface HeroService {

  fun findAllHeroes(): List<Hero>
  fun findHeroById(id: Long): Hero
  fun saveHero(hero: Hero): Hero
  fun deleteHero(id: Long)

}