package com.dailycodebuffer.department.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler"})
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private Long  departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


}
