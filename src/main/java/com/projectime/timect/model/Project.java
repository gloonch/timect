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

    public Project() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectOwner getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(ProjectOwner projectOwner) {
        this.projectOwner = projectOwner;
    }

    public List<Timesheet> getTimesheets() {
        return timesheets;
    }

    public void setTimesheets(List<Timesheet> timesheets) {
        this.timesheets = timesheets;
    }
}
