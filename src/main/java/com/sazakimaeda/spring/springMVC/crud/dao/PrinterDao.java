package com.sazakimaeda.spring.springMVC.crud.dao;

import com.sazakimaeda.spring.springMVC.crud.models.Device;
import com.sazakimaeda.spring.springMVC.crud.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrinterDao {
    public static int COUNT;
    public List<Device> printer;
    {
        printer = new ArrayList<Device>();
        printer.add(new Device(COUNT++, "cannon", "lb3060","provod"));
        printer.add(new Device(COUNT++, "cannon", "lm3221","ne pechataet"));
    }
    public List<Device> index() {
        return printer;
    }

    public Device show(int id) {
        return printer.stream().filter(device -> device.getId() == id).findAny().orElse(null);
    }

    public void save(Device device) {
        device.setId(++COUNT);
        printer.add(device);
    }

    public void update(int id, Device updatedDevice) {
        Device deviceToBeUpdated = show(id);
        deviceToBeUpdated.setName(updatedDevice.getName());
        deviceToBeUpdated.setModel(updatedDevice.getModel());
        deviceToBeUpdated.setProblem(updatedDevice.getProblem());
    }

    public void delete(int id) {
        printer.removeIf(device -> device.getId() == id);
    }
}
