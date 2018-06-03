package me.sememorg.homework.controller.exchange;

import me.sememorg.homework.model.Slave;

import java.math.BigDecimal;
import java.util.List;

public class CreateMasterRequest {
    private String name;
    private BigDecimal cash;
    private Integer slavesCount;
    private List<Slave> mySlaves;

    public String getName() {
        return name;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public Integer getSlavesCount() {
        return slavesCount;
    }

    public List<Slave> getMySlaves() {
        return mySlaves;
    }
}
