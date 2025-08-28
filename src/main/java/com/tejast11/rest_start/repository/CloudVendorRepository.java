package com.tejast11.rest_start.repository;

import com.tejast11.rest_start.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor , String> {
}
