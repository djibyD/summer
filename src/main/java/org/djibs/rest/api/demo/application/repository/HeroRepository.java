package org.djibs.rest.api.demo.application.repository;

import org.djibs.rest.api.demo.application.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {

}
