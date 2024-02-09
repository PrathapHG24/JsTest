package com.jstest.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jstest.entities.LabelData;

public class LabelDataMapper implements RowMapper<LabelData> {

	@Override
	public LabelData mapRow(ResultSet rs, int rowNum) throws SQLException {
		LabelData labelData = new LabelData();
        labelData.setResult(rs.getString("result"));
        labelData.setResultDescription(rs.getString("result_description"));
        labelData.setCaseGTINText(rs.getString("case_gtin_text"));
        labelData.setCaseGTINBarcode(rs.getString("case_gtin_barcode"));
        labelData.setCaseGTINReadable(rs.getString("case_gtin_readable"));
        labelData.setRegisteredTrademark(rs.getString("registered_trademark"));
        labelData.setResourceItemNu(rs.getString("resource_item_nu"));
        labelData.setResourceItemNumberBarcode(rs.getString("resource_item_number_barcode"));
        labelData.setResourceItemDescription(rs.getString("resource_item_description"));
        labelData.setCommentLine1(rs.getString("comment_line_1"));
        labelData.setCommentLine2(rs.getString("comment_line_2"));
        labelData.setCommentLine3(rs.getString("comment_line_3"));
        labelData.setColorDescription(rs.getString("color_description"));
        labelData.setProductionCode(rs.getString("production_code"));
        labelData.setGrossWeightLbs(rs.getDouble("gross_weight_lbs"));
        labelData.setGrossWeightKgs(rs.getDouble("gross_weight_kgs"));
        labelData.setCaseQty(rs.getDouble("case_qty"));
        labelData.setScheduleOlsnReleaseBarcode(rs.getString("schedule_olsn_release_barcode"));
        labelData.setScheduleOlsnRelease(rs.getString("schedule_olsn_release"));
        labelData.setLiteralSONumber(rs.getString("literal_so_number"));
        labelData.setSONumberBarcode(rs.getString("so_number_barcode"));
        labelData.setSONumber(rs.getString("so_number"));
        labelData.setItemUPC(rs.getString("item_upc"));
        labelData.setItemUPCText(rs.getString("item_upc_text"));
        labelData.setLabelIdentifier(rs.getString("label_identifier"));
        labelData.setLiteralLabelName(rs.getString("literal_label_name"));
        return labelData;
    }
}
	
