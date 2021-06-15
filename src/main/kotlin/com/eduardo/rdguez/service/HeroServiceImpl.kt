package com.eduardo.rdguez.service

import com.eduardo.rdguez.domain.Hero
import com.eduardo.rdguez.repository.HeroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class HeroServiceImpl : HeroService {

  @Autowired
  private lateinit var heroRepository: HeroRepository

  @Transactional
  override fun findAllHeroes(): List<Hero> {
    return heroRepository.findAll()
  }

  @Transactional
  override fun findHeroById(id: Long): Hero {
    return heroRepository.findOneById(id)
  }

  override fun saveHero(hero: Hero): Hero {
    return heroRepository.save(hero)
  }

  override fun deleteHero(id: Long) {
    heroRepository.deleteById(id)
  }
}