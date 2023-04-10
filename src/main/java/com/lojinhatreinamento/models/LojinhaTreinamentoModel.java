package com.lojinhatreinamento.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_LOJINHA_SPOT")
public class LojinhaTreinamentoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 25)
    private String nameProduct;
    @Column(nullable = false, length = 25)
    private String valueProduct;
    @Column(nullable = false, length = 20)
    private String categoryProduct;
    @Column(nullable = false, length = 45)
    private String description;
    @Column(nullable = false, length = 25)
    private Integer amountProduct;

    /**
     *
     * Metodos SETTERS
     */
    public void setId(UUID id) {
        this.id = id;
    }

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

    /**
     *
     * Metodos GETTTERS
     */
    public UUID getId() {
        return id;
    }

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
}
