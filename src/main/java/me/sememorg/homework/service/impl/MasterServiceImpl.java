package me.sememorg.homework.service.impl;

import me.sememorg.homework.model.Master;
import me.sememorg.homework.repository.MasterRepository;
import me.sememorg.homework.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MasterServiceImpl implements MasterService {

    @Autowired
    private MasterRepository masterRepository;

    @Override
    public Master createMaster(Master master) {
        if (!masterRepository.existsByName(master.getName())){
            Master newMaster = masterRepository.save(master);
            return newMaster;
        }
        return null;
    }

    @Override
    public Optional<Master> readMaster(String name) {
        return masterRepository.findByName(name);
    }

    @Override
    public Master updateMaster(Master master) {
        return null;
    }

    @Override
    public void deleteMaster(String name) {
        masterRepository.deleteByName(name);
    }
}