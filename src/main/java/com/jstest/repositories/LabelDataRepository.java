package com.jstest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jstest.entities.LabelData;


import java.util.List;

public interface LabelDataRepository extends JpaRepository<LabelData, Long> {
    List<LabelData> findAllByScheduleOlsnReleaseBarcode(String scheduleOlsnReleaseBarcode);
}

