/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.demo.repository;

import java.util.List;

/**
 *
 * @author hangnt
 */
public interface ICommonRepository<T, K> {
    // T => doi tuong: Nhan vien, Khach hang ... 
    // K => khoa chinh kieu du lieu 
    // chua ham chung: getAll, them, sua, xoa, detail 

    List<T> getAll();

    T getOne(K id);

    void add(T obj);

    void delete(K id);

    void update(T obj);
    
    List<T> search( String name);
    
}
