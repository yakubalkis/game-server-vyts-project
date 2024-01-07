package com.game.server.repository;

import com.game.server.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    // TO-DO: buraya itemin bütün price datelerini getiren method yazılacak
}
