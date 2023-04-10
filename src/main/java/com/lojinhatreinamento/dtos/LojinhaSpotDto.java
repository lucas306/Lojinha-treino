package com.lojinhatreinamento.dtos;

import jakarta.validation.constraints.NotBlank;

public class LojinhaSpotDto {

    @NotBlank
    private String nameProduct;
    @NotBlank
    private String valueProduct;
    @NotBlank
    private String categoryProduct;
    @NotBlank
    private String description;
    @NotBlank
    private Integer amountProduct;

    /**
     *
     * Getters
     */
    public String getNameProduct() {
        return nameProduct;
    }

    public String getValueProduct() {
        return valueProduct;
    }

    public String getCategoryProduct() {
        return categoryProduct;
    }

    public String getDescription() {
        return description;
    }

    public Integer getAmountProduct() {
        return amountProduct;
    }

    /**
     *
     * Setters
     */
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setValueProduct(String valueProduct) {
        this.valueProduct = valueProduct;
    }

    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmountProduct(Integer amountProduct) {
        this.amountProduct = amountProduct;
    }
}
