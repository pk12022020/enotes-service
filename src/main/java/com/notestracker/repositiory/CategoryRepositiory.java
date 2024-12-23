package com.notestracker.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notestracker.entity.Category;

public interface CategoryRepositiory extends JpaRepository<Category,Integer>{

}
