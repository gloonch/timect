package com.projectime.timect.repository;


import com.projectime.timect.model.ProjectOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectOwnerRepository extends JpaRepository<ProjectOwner,Long> {
}
