package com.student.controller;

import com.student.core.Games;
import com.student.service.GamesServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Collection;

@RestController
@RequestMapping("/games")
@CrossOrigin
public class GamesController {

    @Inject
    private GamesServiceImpl gamesServiceimpl;

    @RequestMapping("/")
    public Collection<Games> getAll(){
        return gamesServiceimpl.getAll();
    }

}
