package me.sememorg.homework.service;

import me.sememorg.homework.model.Master;

import java.util.Optional;

public interface MasterService {

    Optional<Master> readMaster(String name);
    Master updateMaster(Master master);
    void deleteMaster(String name);
    Master createMaster(Master master);
}
