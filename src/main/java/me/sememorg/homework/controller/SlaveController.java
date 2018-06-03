package me.sememorg.homework.controller;

import me.sememorg.homework.controller.exchange.CreateSlaveRequest;
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

    @PostMapping(value = "/")
    public ResponseEntity<Slave> postSlave(@RequestBody CreateSlaveRequest request) {
        Slave slave = slaveService.createSlave(new Slave(
                request.getName(),
                request.getRace(),
                request.getGender(),
                request.getAge(),
                request.getWeight(),
                request.getHeight(),
                request.getCost()));
        return new ResponseEntity<>(slave, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public Slave putSlave(@RequestBody Slave slave, @PathVariable("id") Integer id) {
        Slave newSlave = new Slave(
                id,
                slave.getName(),
                slave.getRace(),
                slave.getGender(),
                slave.getAge(),
                slave.getWeight(),
                slave.getHeight(),
                slave.getCost());
        return slaveService.updateSlave(newSlave);
    }

    @DeleteMapping(value= "/{id}")
    public void deleteSlave(@PathVariable Integer id) {
        slaveService.deleteSlave(id);
    }
}