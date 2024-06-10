package com.ay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ay.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
