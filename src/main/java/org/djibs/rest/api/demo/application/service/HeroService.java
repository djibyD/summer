package org.djibs.rest.api.demo.application.service;

import java.util.List;

import org.djibs.rest.api.demo.application.model.Hero;
import org.djibs.rest.api.demo.application.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService {
	
	@Autowired
	private HeroRepository heroRepository;
	
	public List<Hero> getHeroes(){
		return heroRepository.findAll();
	}
	
	public Hero getHero(Long id){
		return heroRepository.findOne(id);
	}

	public void addHero(Hero hero) {
		heroRepository.save(hero);
	}

	public void updateHero(Hero hero, Long id) {
		heroRepository.save(hero);
	}

	public void deleteHero(Long id) {
		heroRepository.delete(id);
	}
	
	
	
}
