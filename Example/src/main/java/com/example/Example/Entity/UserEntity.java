package com.example.Example.Entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class UserEntity {
    private String Name;
    private String Email;
    private String Password;

}
