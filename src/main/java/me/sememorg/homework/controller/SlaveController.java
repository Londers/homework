package me.sememorg.homework.controller;

import me.sememorg.homework.model.Slave;
import me.sememorg.homework.service.SlaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/slaves")
public class SlaveController {

    @Autowired
    private SlaveService slaveService;

    @GetMapping(value= "/{id}")
    public Optional<Slave> getSlave(@PathVariable Integer id) {
        return slaveService.readSlave(id);
    }

    @PostMapping
    public ResponseEntity<Slave> postSlave() {
        Slave slave = slaveService.createSlave(new Slave());
        return new ResponseEntity<>(slave, HttpStatus.OK);
    }

    @PutMapping
    public Slave putSlave(@RequestBody Slave Slave) {
        return slaveService.updateSlave(Slave);
    }

    @DeleteMapping(value= "/delete/{id}")
    public void deleteSlave(@PathVariable Integer id) {
        slaveService.deleteSlave(id);
    }
}