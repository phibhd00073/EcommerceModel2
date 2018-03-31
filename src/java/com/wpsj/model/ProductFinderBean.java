/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wpsj.model;
import java.util.List;
import com.wpsj.da.ProductDataAccess;
import com.wpsj.entity.Product;

/**
 *
 * @author Phi
 */
public class ProductFinderBean {
    private String keyword;
    public void setKeyword(String keyword)
    {this.keyword=keyword;}
    public List<Product> getProducts()
    {
        return new
            ProductDataAccess().getProductsByName(keyword);
    }
    
}