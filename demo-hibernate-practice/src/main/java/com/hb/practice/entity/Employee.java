package com.hb.practice.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="emp_name",length=50)
	private String name;
	
	@Column(length=50,unique=true)
	private String mail;
	
	@Column(length=12,unique=true)
	private String mobile;
	
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	private int status;
	
	@CreatedBy
	private String creUser;
	
	@CreationTimestamp
	@JsonFormat(pattern="dd/MM/yy hh:mm:ss a")
	private LocalDateTime creDate;
	
	@LastModifiedBy
	private String modUser;
	
	@UpdateTimestamp
	@JsonFormat(pattern="dd/MM/yy hh:mm:ss a")
	private LocalDateTime modDate;
	
}
