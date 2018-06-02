package me.sememorg.homework.service;

import me.sememorg.homework.model.Slave;

import java.util.Optional;

public interface SlaveService {

    Slave createSlave(Slave slave);
    Optional<Slave> readSlave(Integer id);
    Slave updateSlave(Slave slave);
    void deleteSlave(Integer id);

}