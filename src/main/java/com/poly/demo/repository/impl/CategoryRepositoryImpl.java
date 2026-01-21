/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.demo.repository.impl;

import com.poly.demo.enity.Category;
import com.poly.demo.repository.ICommonRepository;
import com.poly.demo.util.XJdbc;
import com.poly.demo.util.XQuery;
import java.util.List;

/**
 *
 * @author hangnt
 */
//repository service view 
//service: chi duoc goi cac ham repository 
//view: chi duoc phep goi cac ham service/controler
public class CategoryRepositoryImpl implements ICommonRepository<Category, String> {

    // B1: Liet ke het cau lenh SQL 
    private String sqlGetAll = "SELECT Id, Name FROM PolyCafe.dbo.Categories;";
    private String sqlGetOne = "SELECT Id, Name FROM PolyCafe.dbo.Categories WHERE id = ?";
    private String sqlAdd = "";
    private String sqlUpdate = "";
    private String sqlDelete = "";
    private String sqlSearch = "SELECT Id, Name FROM PolyCafe.dbo.Categories WHERE Name = ?";

    @Override
    public List<Category> getAll() {
        return XQuery.getBeanList(Category.class, sqlGetAll);
    }

    @Override
    public Category getOne(String id) {
        return XQuery.getSingleBean(Category.class, sqlGetOne, id);
    }

    @Override
    public void add(Category obj) {
        Object[] values = {
            obj.getId(),
            obj.getName()
        };
        XJdbc.executeUpdate(sqlAdd, values);
    }

    @Override
    public void delete(String id) {
        XJdbc.executeUpdate(sqlDelete, id);
    }

    @Override
    public void update(Category obj) {
        Object[] values = {
            //            obj.getId(),
            obj.getName()
        };
        XJdbc.executeUpdate(sqlUpdate, values);
    }

    @Override
    public List<Category> search(String name) {
        return XQuery.getBeanList(Category.class, sqlSearch, name);
    }

    public static void main(String[] args) {
        System.out.println(new CategoryRepositoryImpl().getAll());
    }

}
