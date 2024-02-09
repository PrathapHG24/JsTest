package com.jstest.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LabelData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String result;
    private String resultDescription;
    private String caseGTINText;
    private String caseGTINBarcode;
    private String caseGTINReadable;
    private String registeredTrademark;
    private String resourceItemNu;
    private String resourceItemNumberBarcode;
    private String resourceItemDescription;
    private String commentLine1;
    private String commentLine2;
    private String commentLine3;
    private String colorDescription;
    private String productionCode;
    private Double grossWeightLbs;
    private Double grossWeightKgs;
    private Double caseQty;
    private String scheduleOlsnReleaseBarcode;
    private String scheduleOlsnRelease;
    private String literalSONumber;
    private String SONumberBarcode;
    private String SONumber;
    private String itemUPC;
    private String itemUPCText;
    private String labelIdentifier;
    private String literalLabelName;

    // Constructors, getters, and setters

    public LabelData() {
        // Default constructor
    }

    // Constructors, getters, and setters

    public LabelData(String result, String resultDescription, String caseGTINText, String caseGTINBarcode, String caseGTINReadable,
            String registeredTrademark, String resourceItemNu, String resourceItemNumberBarcode, String resourceItemDescription,
            String commentLine1, String commentLine2, String commentLine3, String colorDescription, String productionCode,
            Double grossWeightLbs, Double grossWeightKgs, Double caseQty, String scheduleOlsnReleaseBarcode, String scheduleOlsnRelease,
            String literalSONumber, String SONumberBarcode, String SONumber, String itemUPC, String itemUPCText, String labelIdentifier,
            String literalLabelName) {
        this.result = result;
        this.resultDescription = resultDescription;
        this.caseGTINText = caseGTINText;
        this.caseGTINBarcode = caseGTINBarcode;
        this.caseGTINReadable = caseGTINReadable;
        this.registeredTrademark = registeredTrademark;
        this.resourceItemNu = resourceItemNu;
        this.resourceItemNumberBarcode = resourceItemNumberBarcode;
        this.resourceItemDescription = resourceItemDescription;
        this.commentLine1 = commentLine1;
        this.commentLine2 = commentLine2;
        this.commentLine3 = commentLine3;
        this.colorDescription = colorDescription;
        this.productionCode = productionCode;
        this.grossWeightLbs = grossWeightLbs;
        this.grossWeightKgs = grossWeightKgs;
        this.caseQty = caseQty;
        this.scheduleOlsnReleaseBarcode = scheduleOlsnReleaseBarcode;
        this.scheduleOlsnRelease = scheduleOlsnRelease;
        this.literalSONumber = literalSONumber;
        this.SONumberBarcode = SONumberBarcode;
        this.SONumber = SONumber;
        this.itemUPC = itemUPC;
        this.itemUPCText = itemUPCText;
        this.labelIdentifier = labelIdentifier;
        this.literalLabelName = literalLabelName;
    }

		
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResultDescription() {
		return resultDescription;
	}

	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}

	public String getCaseGTINText() {
		return caseGTINText;
	}

	public void setCaseGTINText(String caseGTINText) {
		this.caseGTINText = caseGTINText;
	}

	public String getCaseGTINBarcode() {
		return caseGTINBarcode;
	}

	public void setCaseGTINBarcode(String caseGTINBarcode) {
		this.caseGTINBarcode = caseGTINBarcode;
	}

	public String getCaseGTINReadable() {
		return caseGTINReadable;
	}

	public void setCaseGTINReadable(String caseGTINReadable) {
		this.caseGTINReadable = caseGTINReadable;
	}

	public String getRegisteredTrademark() {
		return registeredTrademark;
	}

	public void setRegisteredTrademark(String registeredTrademark) {
		this.registeredTrademark = registeredTrademark;
	}

	public String getResourceItemNu() {
		return resourceItemNu;
	}

	public void setResourceItemNu(String resourceItemNu) {
		this.resourceItemNu = resourceItemNu;
	}

	public String getResourceItemNumberBarcode() {
		return resourceItemNumberBarcode;
	}

	public void setResourceItemNumberBarcode(String resourceItemNumberBarcode) {
		this.resourceItemNumberBarcode = resourceItemNumberBarcode;
	}

	public String getResourceItemDescription() {
		return resourceItemDescription;
	}

	public void setResourceItemDescription(String resourceItemDescription) {
		this.resourceItemDescription = resourceItemDescription;
	}

	public String getCommentLine1() {
		return commentLine1;
	}

	public void setCommentLine1(String commentLine1) {
		this.commentLine1 = commentLine1;
	}

	public String getCommentLine2() {
		return commentLine2;
	}

	public void setCommentLine2(String commentLine2) {
		this.commentLine2 = commentLine2;
	}

	public String getCommentLine3() {
		return commentLine3;
	}

	public void setCommentLine3(String commentLine3) {
		this.commentLine3 = commentLine3;
	}

	public String getColorDescription() {
		return colorDescription;
	}

	public void setColorDescription(String colorDescription) {
		this.colorDescription = colorDescription;
	}

	public String getProductionCode() {
		return productionCode;
	}

	public void setProductionCode(String productionCode) {
		this.productionCode = productionCode;
	}

	public Double getGrossWeightLbs() {
		return grossWeightLbs;
	}

	public void setGrossWeightLbs(Double grossWeightLbs) {
		this.grossWeightLbs = grossWeightLbs;
	}

	public Double getGrossWeightKgs() {
		return grossWeightKgs;
	}

	public void setGrossWeightKgs(Double grossWeightKgs) {
		this.grossWeightKgs = grossWeightKgs;
	}

	public Double getCaseQty() {
		return caseQty;
	}

	public void setCaseQty(Double caseQty) {
		this.caseQty = caseQty;
	}

	public String getScheduleOlsnReleaseBarcode() {
		return scheduleOlsnReleaseBarcode;
	}

	public void setScheduleOlsnReleaseBarcode(String scheduleOlsnReleaseBarcode) {
		this.scheduleOlsnReleaseBarcode = scheduleOlsnReleaseBarcode;
	}

	public String getScheduleOlsnRelease() {
		return scheduleOlsnRelease;
	}

	public void setScheduleOlsnRelease(String scheduleOlsnRelease) {
		this.scheduleOlsnRelease = scheduleOlsnRelease;
	}

	public String getLiteralSONumber() {
		return literalSONumber;
	}

	public void setLiteralSONumber(String literalSONumber) {
		this.literalSONumber = literalSONumber;
	}

	public String getSONumberBarcode() {
		return SONumberBarcode;
	}

	public void setSONumberBarcode(String sONumberBarcode) {
		SONumberBarcode = sONumberBarcode;
	}

	public String getSONumber() {
		return SONumber;
	}

	public void setSONumber(String sONumber) {
		SONumber = sONumber;
	}

	public String getItemUPC() {
		return itemUPC;
	}

	public void setItemUPC(String itemUPC) {
		this.itemUPC = itemUPC;
	}

	public String getItemUPCText() {
		return itemUPCText;
	}

	public void setItemUPCText(String itemUPCText) {
		this.itemUPCText = itemUPCText;
	}

	public String getLabelIdentifier() {
		return labelIdentifier;
	}

	public void setLabelIdentifier(String labelIdentifier) {
		this.labelIdentifier = labelIdentifier;
	}

	public String getLiteralLabelName() {
		return literalLabelName;
	}

	public void setLiteralLabelName(String literalLabelName) {
		this.literalLabelName = literalLabelName;
	}
		
	}
