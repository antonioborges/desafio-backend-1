package com.spring.blog.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import com.spring.blog.model.Author;
import com.spring.blog.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthorController {
  
  @Autowired
  AuthorService authorService;

  @RequestMapping(value = "/authors", method = RequestMethod.GET)
  public ModelAndView getAuthors() {
    ModelAndView modelAndView = new ModelAndView("authors");
    // TODO recuperar lista de autores
    return modelAndView;
  }

  @RequestMapping(value = "/authors/{id}", method = RequestMethod.GET)
  public ModelAndView getAuthorDetails(@PathVariable("id") long id) {
    ModelAndView modelAndView = new ModelAndView("authorDetails");
    // TODO recuperar dados do autor por id
    return modelAndView;
  }

  @RequestMapping(value = "/newauthor", method = RequestMethod.GET)
  public String getAuthorForm() {
    return "authorForm";
  }

  @RequestMapping(value = "/newauthor", method = RequestMethod.POST)
  public String saveAuthor(@Valid Author author, BindingResult result, RedirectAttributes attributes) {
    // TODO salvar o autor e caso erro apresentar uma mensagem para o usuario
    return "redirect:/authors";
  }
}
