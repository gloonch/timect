package com.projectime.timect.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "project")
public class Project extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "projectowner_id", referencedColumnName = "id")
    private ProjectOwner projectOwner;

    @OneToMany(mappedBy = "project_id", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, targetEntity = Timesheet.class)
    private List<Timesheet> timesheets;
}
