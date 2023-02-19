package com.projectime.timect.service;

import com.projectime.timect.model.Project;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface ProjectRepository extends Repository<Project, Long> {
}
