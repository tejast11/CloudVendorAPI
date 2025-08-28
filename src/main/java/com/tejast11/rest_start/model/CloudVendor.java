package com.tejast11.rest_start.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cloud_Vendor_Info")
public class CloudVendor {
    @Id
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNo;

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNo) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNo = vendorPhoneNo;
    }
    public CloudVendor() {

    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhoneNo() {
        return vendorPhoneNo;
    }

    public void setVendorPhoneNo(String vendorPhoneNo) {
        this.vendorPhoneNo = vendorPhoneNo;
    }
}
