package com.example.datn.service;

import com.example.datn.entity.KhuyenMai;
import com.example.datn.repository.KhuyenMaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class KhuyenMaiService {
    @Autowired
    private KhuyenMaiRepository khuyenMaiRepository;
    public   List<KhuyenMai>getListKM(){
        return khuyenMaiRepository.findAll();
    }
}