package com.student.service;

import com.student.core.Games;
import com.student.repository.GamesRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;


@Named
public class GamesServiceImpl implements GamesService{
    @Inject
    private GamesRepository gamesRepository;


    @Override
    public Collection<Games> getAll() {
        return gamesRepository.findAll();
    }
}
