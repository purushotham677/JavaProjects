package com.hcltech.course_Academy_Service.dao;

import com.hcltech.course_Academy_Service.model.Author;
import com.hcltech.course_Academy_Service.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class AuthorDao {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> all(){
        return authorRepository.findAll();
    }

    public Author create(Author author){
        return authorRepository.save(author);
    }

    public Author update(Author author){
        Optional<Author> existsauthor=authorRepository.findById(author.getId());
        if (existsauthor.isPresent()){
        Author existAuthor1 =existsauthor.get();
        existAuthor1.setName(author.getName());
        existAuthor1.setEmail(author.getEmail());
            return authorRepository.save(existAuthor1);
        }else {
            return null;
        }
    }


    public void deleteById(Integer id) {
        authorRepository.deleteById(id);
    }

    public Optional<Author> getById(Integer id) {
        return authorRepository.findById(id);
    }
}
