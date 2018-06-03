package me.sememorg.homework.controller;

import me.sememorg.homework.controller.exchange.CreateMasterRequest;
import me.sememorg.homework.model.Master;
import me.sememorg.homework.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/master")
public class MasterController {

    @Autowired
    private MasterService masterService;

    @GetMapping(value= "/{name}")
    public Optional<Master> getMaster(@PathVariable String name) {
        return masterService.readMaster(name);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Master> postMaster(@RequestBody CreateMasterRequest request) {
        Master master = masterService.createMaster(new Master(request.getName()));
        return new ResponseEntity<>(master, HttpStatus.OK);
    }

    @PutMapping(value = "/{name}")
    public Master updateMaster(@RequestBody Master master, @PathVariable("name") String name) {
        Master newMaster = new Master(master.getName());
        return masterService.updateMaster(newMaster);
    }

    @DeleteMapping(value= "/{name}")
    public void deleteMaster(@PathVariable String name) {
        masterService.deleteMaster(name);
    }
}