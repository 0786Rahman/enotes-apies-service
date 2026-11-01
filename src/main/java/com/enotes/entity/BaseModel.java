package com.enotes.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.util.Date;
@MappedSuperclass
@Data
public class BaseModel {
    private Boolean isActive;
    private Boolean isDeleted;
    private Integer CreatedBy;
    private Date createdOn;
    private Integer updatedBy;
    private Date updatedOn;
}
