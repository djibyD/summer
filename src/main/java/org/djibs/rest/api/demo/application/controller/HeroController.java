package org.djibs.rest.api.demo.application.controller;

import java.util.List;

import org.djibs.rest.api.demo.application.model.Hero;
import org.djibs.rest.api.demo.application.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("heroes")
public class HeroController {
	
	@Autowired
	private HeroService heroSevice;

	@GetMapping
	public List<Hero> getHeroes(){
		return heroSevice.getHeroes();
	}
	
	@GetMapping("{id}")
	public Hero getHero(@PathVariable Long id){
		return heroSevice.getHero(id);
	}
	
	@PostMapping
	public void addHero(@RequestBody Hero hero){
		heroSevice.addHero(hero);
	}

	@PutMapping("{id}")
	public void updateHero(@RequestBody Hero hero, @PathVariable Long id){
		heroSevice.updateHero(hero, id);
	}
	
	@DeleteMapping("{id}")
	public void deleteHero(@PathVariable Long id){
		heroSevice.deleteHero(id);
	}
}
