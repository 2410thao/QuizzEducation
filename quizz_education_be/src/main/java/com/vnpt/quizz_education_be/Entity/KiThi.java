package com.vnpt.quizz_education_be.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "KiThi")
public class KiThi implements Serializable {
    
    @Id
    @Column(name = "ma_ki_thi")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maKiThi;

    @Column(name = "ten_ki_thi")
    private String tenKiThi;

    @Column(name = "da_dien_ra")
    private Boolean daDienRa;

    @Column(name = "mo_ta")
    private String moTa;

    // Relationship N - 1

    @ManyToOne
    @JoinColumn(name = "ten_dang_nhap")
    TaiKhoan taiKhoan;


}