package com.projectime.timect.service.impl;

import com.projectime.timect.model.Timesheet;
import com.projectime.timect.service.TimesheetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeSheetServiceImpl implements TimesheetService {
    @Override
    public void save(Timesheet timesheet) {

    }

    @Override
    public Timesheet findById(Long id) {
        return null;
    }

    @Override
    public void update(Timesheet timesheet) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Timesheet> findAll() {
        return null;
    }
}
