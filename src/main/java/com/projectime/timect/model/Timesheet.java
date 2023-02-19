package com.projectime.timect.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "timesheet")
public class Timesheet extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private Project project;

    @Column(nullable = false)
    private String startTime;

    @Column(nullable = false)
    private String endTime;


}
