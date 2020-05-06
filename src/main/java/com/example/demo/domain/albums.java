package com.example.demo.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import javax.persistence.Column;

@Getter
public class albums {
    @Column(name = "id")
    @ApiModelProperty(value = "id",name = "id")
    private int id;

}
