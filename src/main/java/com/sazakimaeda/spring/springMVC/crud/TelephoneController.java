package com.sazakimaeda.spring.springMVC.crud;

import com.sazakimaeda.spring.springMVC.crud.dao.TelephoneDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/telephone")
public class TelephoneController {
    private final TelephoneDao telephoneDao;

    @Autowired
    public TelephoneController(TelephoneDao telephoneDao) {
        this.telephoneDao = telephoneDao;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("phone", telephoneDao.indexPhone());
        return "telephone/indexPhone";
    }

    @GetMapping("/{id}")
    public String showPhone(@PathVariable("id") int id, Model model) {
        model.addAttribute("telephone", telephoneDao.showPhone(id));
        return "telephone/showPhone";
    }
}
