package com.projectime.timect.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    private Long id;
    private String type;

}
