package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AllocationBaseWithId
 */
public class AllocationBaseWithId   {
  private String collateralAssetReference = null;

  private String allocationRequestReference = null;

  private String requestedAllocationRequestType = null;

  private String productInstanceReference = null;

  private String customerOfferReference = null;

  private String customerReference = null;

  private String collateralEarmarkAmount = null;

  private String collateralEarmarkDuration = null;

  private String collateralAllocationAmount = null;

  private String collateralAllocationDuration = null;

  private String collateralAllocationRecallAmount = null;

  private String collateralAllocationRecallTimetable = null;

  private Object collateralAllocationRecallResult = null;

  private String collateralAssetValuation = null;

  private String collateralAssetValuationDate = null;

  private String collateralAssetLoanToValueRatio = null;

  private String collateralAssetAllocationProfile = null;

  private String collateralAssetAllocationState = null;

  private Object collateralAllocationRequestResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return collateralAssetReference
  **/

  public String getCollateralAssetReference() {
    return collateralAssetReference;
  }

  public void setCollateralAssetReference(String collateralAssetReference) {
    this.collateralAssetReference = collateralAssetReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return allocationRequestReference
  **/

  public String getAllocationRequestReference() {
    return allocationRequestReference;
  }

  public void setAllocationRequestReference(String allocationRequestReference) {
    this.allocationRequestReference = allocationRequestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text       
   * @return requestedAllocationRequestType
  **/

  public String getRequestedAllocationRequestType() {
    return requestedAllocationRequestType;
  }

  public void setRequestedAllocationRequestType(String requestedAllocationRequestType) {
    this.requestedAllocationRequestType = requestedAllocationRequestType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return customerOfferReference
  **/

  public String getCustomerOfferReference() {
    return customerOfferReference;
  }

  public void setCustomerOfferReference(String customerOfferReference) {
    this.customerOfferReference = customerOfferReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return collateralEarmarkAmount
  **/

  public String getCollateralEarmarkAmount() {
    return collateralEarmarkAmount;
  }

  public void setCollateralEarmarkAmount(String collateralEarmarkAmount) {
    this.collateralEarmarkAmount = collateralEarmarkAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration     
   * @return collateralEarmarkDuration
  **/

  public String getCollateralEarmarkDuration() {
    return collateralEarmarkDuration;
  }

  public void setCollateralEarmarkDuration(String collateralEarmarkDuration) {
    this.collateralEarmarkDuration = collateralEarmarkDuration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return collateralAllocationAmount
  **/

  public String getCollateralAllocationAmount() {
    return collateralAllocationAmount;
  }

  public void setCollateralAllocationAmount(String collateralAllocationAmount) {
    this.collateralAllocationAmount = collateralAllocationAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration     
   * @return collateralAllocationDuration
  **/

  public String getCollateralAllocationDuration() {
    return collateralAllocationDuration;
  }

  public void setCollateralAllocationDuration(String collateralAllocationDuration) {
    this.collateralAllocationDuration = collateralAllocationDuration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return collateralAllocationRecallAmount
  **/

  public String getCollateralAllocationRecallAmount() {
    return collateralAllocationRecallAmount;
  }

  public void setCollateralAllocationRecallAmount(String collateralAllocationRecallAmount) {
    this.collateralAllocationRecallAmount = collateralAllocationRecallAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Time     
   * @return collateralAllocationRecallTimetable
  **/

  public String getCollateralAllocationRecallTimetable() {
    return collateralAllocationRecallTimetable;
  }

  public void setCollateralAllocationRecallTimetable(String collateralAllocationRecallTimetable) {
    this.collateralAllocationRecallTimetable = collateralAllocationRecallTimetable;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return collateralAllocationRecallResult
  **/

  public Object getCollateralAllocationRecallResult() {
    return collateralAllocationRecallResult;
  }

  public void setCollateralAllocationRecallResult(Object collateralAllocationRecallResult) {
    this.collateralAllocationRecallResult = collateralAllocationRecallResult;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Value     
   * @return collateralAssetValuation
  **/

  public String getCollateralAssetValuation() {
    return collateralAssetValuation;
  }

  public void setCollateralAssetValuation(String collateralAssetValuation) {
    this.collateralAssetValuation = collateralAssetValuation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date     
   * @return collateralAssetValuationDate
  **/

  public String getCollateralAssetValuationDate() {
    return collateralAssetValuationDate;
  }

  public void setCollateralAssetValuationDate(String collateralAssetValuationDate) {
    this.collateralAssetValuationDate = collateralAssetValuationDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Ratio     
   * @return collateralAssetLoanToValueRatio
  **/

  public String getCollateralAssetLoanToValueRatio() {
    return collateralAssetLoanToValueRatio;
  }

  public void setCollateralAssetLoanToValueRatio(String collateralAssetLoanToValueRatio) {
    this.collateralAssetLoanToValueRatio = collateralAssetLoanToValueRatio;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return collateralAssetAllocationProfile
  **/

  public String getCollateralAssetAllocationProfile() {
    return collateralAssetAllocationProfile;
  }

  public void setCollateralAssetAllocationProfile(String collateralAssetAllocationProfile) {
    this.collateralAssetAllocationProfile = collateralAssetAllocationProfile;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return collateralAssetAllocationState
  **/

  public String getCollateralAssetAllocationState() {
    return collateralAssetAllocationState;
  }

  public void setCollateralAssetAllocationState(String collateralAssetAllocationState) {
    this.collateralAssetAllocationState = collateralAssetAllocationState;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return collateralAllocationRequestResult
  **/

  public Object getCollateralAllocationRequestResult() {
    return collateralAllocationRequestResult;
  }

  public void setCollateralAllocationRequestResult(Object collateralAllocationRequestResult) {
    this.collateralAllocationRequestResult = collateralAllocationRequestResult;
  }


}

