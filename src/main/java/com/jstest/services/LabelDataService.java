package com.jstest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.jstest.entities.LabelData;

@Service
public class LabelDataService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public LabelDataService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<LabelData> getAllLabelDataByScheduleId(String scheduleId) {
        String sql = "SELECT * FROM boxes.label_data01 WHERE Schedule_Olsn_Release_Barcode = ?";
        return jdbcTemplate.query(sql, new Object[]{scheduleId}, new LabelDataMapper());
    }
}