package com.ff.snake.service;

import java.util.List;

import com.ff.snake.domain.SnakeLeague;
import com.ff.snake.dto.CreateSnakeDto;

public interface SnakeLeagueService {
	public void createSnakeLeague(CreateSnakeDto createDto);

	public List<SnakeLeague> getAllLeagues();
	
	public boolean existsByLeagueName(String leagueName);

	
}