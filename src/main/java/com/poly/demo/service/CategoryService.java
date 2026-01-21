/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.demo.service;

import com.poly.demo.enity.Category;
import com.poly.demo.repository.impl.CategoryRepositoryImpl;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class CategoryService {

    private CategoryRepositoryImpl repo = new CategoryRepositoryImpl();

    public List<Category> getAll() {
        return repo.getAll();
    }
    // liet ke cac ham goi tu repo 
}
