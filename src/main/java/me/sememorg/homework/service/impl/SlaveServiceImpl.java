package me.sememorg.homework.service.impl;

import me.sememorg.homework.model.Slave;
import me.sememorg.homework.repository.SlaveRepository;
import me.sememorg.homework.service.SlaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class SlaveServiceImpl implements SlaveService {

    @Autowired
    private SlaveRepository slaveRepository;

    @Override
    public Slave createSlave(Slave slave) {
        Slave newSlave = slaveRepository.save(slave);
        return newSlave;
    }

    @Override
    public Optional<Slave> readSlave(Integer id) {
        return slaveRepository.findById(id);
    }

    @Override
    public Slave updateSlave(Slave slave) {
        if (!slaveRepository.existsById(slave.getId()))
            return null;

        return slaveRepository.save(slave);
    }

    @Override
    public void deleteSlave(Integer id) {
        slaveRepository.deleteById(id);
    }
}