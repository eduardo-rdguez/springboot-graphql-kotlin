package com.eduardo.rdguez.resolver

import com.eduardo.rdguez.domain.Hero
import com.eduardo.rdguez.service.HeroService
import graphql.kickstart.tools.GraphQLMutationResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class HeroMutationResolver : GraphQLMutationResolver {

  @Autowired
  private lateinit var heroService: HeroService

  fun saveHero(name: String, description: String): Hero {
    val hero: Hero = Hero(
      name = name,
      description = description
    )
    return heroService.saveHero(hero)
  }
}