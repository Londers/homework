package me.sememorg.homework.repository;

import me.sememorg.homework.model.Slave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlaveRepository extends JpaRepository<Slave, Integer> {
}