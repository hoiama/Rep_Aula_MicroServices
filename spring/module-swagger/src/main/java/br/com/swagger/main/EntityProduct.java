package br.com.swagger.main;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntityProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ApiModelProperty(notes = "propert1 of model entity")
    private String propert1;

    private String propert2;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropert1() {
        return propert1;
    }

    public void setPropert1(String propert1) {
        this.propert1 = propert1;
    }

    public String getPropert2() {
        return propert2;
    }

    public void setPropert2(String propert2) {
        this.propert2 = propert2;
    }
}
