package com.projectime.timect.service;

import com.projectime.timect.model.Timesheet;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface TimesheetRepository extends Repository<Timesheet, Long> {
}
