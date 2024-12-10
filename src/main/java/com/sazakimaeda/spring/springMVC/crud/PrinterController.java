package com.sazakimaeda.spring.springMVC.crud;

import com.sazakimaeda.spring.springMVC.crud.dao.PrinterDao;
import com.sazakimaeda.spring.springMVC.crud.models.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/printer")
public class PrinterController {
    private final PrinterDao printerDao;

    @Autowired
    public PrinterController(PrinterDao printerDao) { this.printerDao = printerDao;}

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("printer", printerDao.index());
        return "printer/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("device", printerDao.show(id));
        return "printer/show";
    }

    @GetMapping("/new")
    public String save(@ModelAttribute("device") Device device) {
        return "printer/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("device") Device device) {
        printerDao.save(device);
        return "redirect:/printer";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("device", printerDao.show(id));
        return "printer/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") Device device, @PathVariable("id") int id){
        printerDao.update(id,device);
        return "redirect:/printer";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        printerDao.delete(id);
        return "redirect:/printer";
    }
}
