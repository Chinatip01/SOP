package com.example.promotionservice.command.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UseCodeModel implements Serializable {
    private String code;
}
