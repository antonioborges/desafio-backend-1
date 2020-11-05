package com.spring.blog.service.serviceImpl;

import java.util.List;

import com.spring.blog.model.Author;
import com.spring.blog.repository.AuthorRepository;
import com.spring.blog.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

  @Autowired
  AuthorRepository authorRepository;

  @Override
  public List<Author> findAll() {
    // TODO
  }

  @Override
  public Author findById(long id) {
    // TODO
  }

  @Override
  public Author save(Author author) {
    // TODO
  }
}
