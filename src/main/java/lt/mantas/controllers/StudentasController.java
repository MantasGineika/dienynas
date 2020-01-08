package lt.mantas.controllers;

import lt.mantas.service.StudentasService;
import lt.mantas.entities.Studentas;
import lt.mantas.entities.Pazymiai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/studentas")
public class StudentasController {

    @Autowired
    private StudentasService service;

    @GetMapping("/list")
    public String listStudentai(Model model){
        List<Studentas> studentas = service.listAll();
        model.addAttribute("studentas", studentas);

        return "list-studentai";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){

        Studentas studentas = new Studentas();
        model.addAttribute("studentas", studentas);

        return "studentas-form";
    }

    @PostMapping("/saveStudentas")
    public String saveStudentas(@ModelAttribute("studentas") Studentas studentas){

        service.save(studentas);

        return "redirect:/studentas/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditStudentasPage(@PathVariable(name ="id") int id) {
        ModelAndView mav = new ModelAndView("studentas-edit");
        Studentas studentas = service.get(id);
        mav.addObject("studentas", studentas);

        return mav;
    }

    @GetMapping("/delete/{id}")
    public String deleteStudentas(@PathVariable("id") int id) {
        service.delete(id);
        return "redirect:/studentas/list";
    }

    @GetMapping("/getPazymiai/{id}")
    public String getPazymiai(@PathVariable("id") int id, Model model) {
        Studentas studentas = service.get(id);
        List<Pazymiai> pazymiai = service.get(id).getPazymiai();
        model.addAttribute("pazymiai",pazymiai);
        System.out.println(studentas);
        System.out.println(pazymiai);
        return "list-pazymiai";
    }

}
