package com.notestracker.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
	
	private boolean isActive;

	private boolean isDeleted;

	private Integer createdBy;
	
	private Date createdOn;

    private Integer updatedBy;

	private Date updated_on;

}
