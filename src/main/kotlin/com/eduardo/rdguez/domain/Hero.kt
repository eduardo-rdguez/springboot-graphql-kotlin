package com.eduardo.rdguez.domain

import javax.annotation.Generated
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "hero")
class Hero(

  @Id
  @Column(name = "id", columnDefinition = "serial")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,
  @Column(name = "name")
  var name: String,
  @Column(name = "description")
  var description: String

)