package com.jstest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jstest.entities.LabelData;
import com.jstest.services.LabelDataService;

import java.util.List;

@RestController
@RequestMapping("/unattendedops.cambro.com/api/LabelData")
@CrossOrigin("*")
public class LabelDataController {

    private final LabelDataService labelDataService;

    @Autowired
    public LabelDataController(LabelDataService labelDataService) {
        this.labelDataService = labelDataService;
    }

    @GetMapping("/GetLabelData/{scheduleId}")
    public List<LabelData> getAllLabelDataByScheduleId(@PathVariable String scheduleId) {
        return labelDataService.getAllLabelDataByScheduleId(scheduleId);
    }
}