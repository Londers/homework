package me.sememorg.homework.service;

import me.sememorg.homework.model.Slave;

import java.util.Optional;

public interface SlaveService {

    Optional<Slave> readSlave(Integer id);
    Slave updateSlave(Slave slave);
    void deleteSlave(Integer id);
    Slave createSlave(Slave slave);
}