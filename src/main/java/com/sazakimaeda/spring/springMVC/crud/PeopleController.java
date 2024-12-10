package com.sazakimaeda.spring.springMVC.crud;

import com.sazakimaeda.spring.springMVC.crud.dao.PersonDao;
import com.sazakimaeda.spring.springMVC.crud.models.Person;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonDao personDao;

    @Autowired
    public PeopleController(PersonDao personDao) {
        this.personDao = personDao;
    }

    @GetMapping()
    public String index(Model model) {
       // Мы получим всех людей из DAO и покажем.
        model.addAttribute("people", personDao.index());
       return "people/index";
   }
   @GetMapping("/{id}")
   public String show(@PathVariable("id") int id, Model model) {
       model.addAttribute("person", personDao.show(id));
       return "people/show";
   }

   @GetMapping("/new")
   public String newPerson(@ModelAttribute("person") Person person) {
   return "people/new";
   }

   @PostMapping()
    public String create(@ModelAttribute("person") @Valid Person person,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "people/new";
        personDao.save(person);
        return "redirect:/people";
   }

   @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("person", personDao.show(id));
        return "people/edit";
   }

   @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") @Valid Person person,
                         BindingResult bindingResult, @PathVariable("id") int id){
        if (bindingResult.hasErrors())
            return "people/edit";
        personDao.update(id,person);
        return "redirect:/people";
   }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        personDao.delete(id);
        return "redirect:/people";
    }
}
