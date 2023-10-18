package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

                                                    //tipo da entidade/ tipo do id da entidade
public interface GameRepository extends JpaRepository<Game, Long> {
}
