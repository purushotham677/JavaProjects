package com.hcltech.course_Academy_Service.service;

import com.hcltech.course_Academy_Service.dao.AuthorDao;
import com.hcltech.course_Academy_Service.dto.AuthorDto;
import com.hcltech.course_Academy_Service.model.Author;
import com.hcltech.course_Academy_Service.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AuthorService{

    @Autowired
    private AuthorDao authorDao;

    public ResponseEntity<?> getAll() {
        List<Author> allAuthors = authorDao.all();
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Author Created Successfully").body(allAuthors).build());
    }

    public ResponseEntity<?> create(Author author){
        author = authorDao.create(author);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Author Created Successfully").body(author).build());

    }

    public ResponseEntity<?> deleteById(Integer id) {
        Optional<?> byId = authorDao.getById(id);
        if (byId == null) {
            throw new RuntimeException("Invalid Id to Delete");
        }
        authorDao.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("deleted successfully").body("Deleted Successfully").build());
    }

    public ResponseEntity<?> getById(Integer id){
        Optional<Author> byId = authorDao.getById(id);
        if(byId==null){
            throw new RuntimeException("Invalid to fetch");
        }
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Author Fetched Successfully").body(byId.get()).build());
    }


    public ResponseEntity<?> updateById(Integer id, Author updatedAuthorDetails) {
        Optional<Author> optionalAuthor = authorDao.getById(id);

        if (optionalAuthor.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ResponseStructure.builder().status(HttpStatus.NOT_FOUND.value()).message("Author Not Found for ID: " + id).build());
        }
        Author existingAuthor = optionalAuthor.get();
        if (updatedAuthorDetails.getName() != null && !updatedAuthorDetails.getName().isEmpty()) {
            existingAuthor.setName(updatedAuthorDetails.getName());
        }
        if (updatedAuthorDetails.getEmail() != null && !updatedAuthorDetails.getEmail().isEmpty()) {
            existingAuthor.setEmail(updatedAuthorDetails.getEmail());
        }
        Author savedAuthor = authorDao.create(existingAuthor);

        return ResponseEntity.status(HttpStatus.OK)
                .body(ResponseStructure.builder()
                        .status(HttpStatus.OK.value())
                        .message("Author Updated Successfully")
                        .body(savedAuthor)
                        .build());
    }
}