package com.projectime.timect.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee extends BaseEntity {

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, targetEntity = Timesheet.class)
    private List<Timesheet> timesheets;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, targetEntity = Project.class)
    private List<Project> projects;

}
