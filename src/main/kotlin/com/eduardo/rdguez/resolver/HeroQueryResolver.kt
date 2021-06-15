package com.eduardo.rdguez.resolver

import com.eduardo.rdguez.domain.Hero
import com.eduardo.rdguez.service.HeroService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class HeroQueryResolver : GraphQLQueryResolver {

  @Autowired
  private lateinit var heroService: HeroService

  fun heroById(id: Long): Hero {
    return heroService.findHeroById(id)
  }
}