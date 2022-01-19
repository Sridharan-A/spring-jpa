package com.student.repository;

import com.student.core.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Games,Integer> {

}
