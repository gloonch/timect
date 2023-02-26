package com.projectime.timect.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class User {

    private Long id;
    private String type;
}
