package com.projectime.timect.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "projectowner")
public class ProjectOwner extends BaseEntity {

    @OneToMany(mappedBy = "project_id", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, targetEntity = Timesheet.class)
    private List<Project> projects;

}
