package com.company.inventory.inventory.dao;
import org.springframework.data.jpa.repository.JpaRepository;


import com.company.inventory.inventory.model.Category;


public interface IcategoryDao extends JpaRepository<Category, Long>{

}
