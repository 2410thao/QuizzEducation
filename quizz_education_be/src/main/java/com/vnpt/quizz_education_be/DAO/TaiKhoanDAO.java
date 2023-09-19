package com.vnpt.quizz_education_be.DAO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vnpt.quizz_education_be.Entity.TaiKhoan;

import java.util.List;

public interface TaiKhoanDAO extends JpaRepository<TaiKhoan, String> {

}