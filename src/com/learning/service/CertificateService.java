package com.learning.service;

import com.learning.model.Certificate;
import com.learning.repository.CertificateRepository;
import java.util.List;

public class CertificateService {
    private final CertificateRepository certificateRepository;

    public CertificateService(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    public void issueCertificate(Certificate certificate) {
        if (certificate == null || certificate.getStudentId() == null || certificate.getStudentId().isEmpty()) {
            throw new IllegalArgumentException("Student ID is required");
        }
        certificateRepository.addCertificate(certificate);
    }

    public Certificate getCertificateById(String id) {
        return certificateRepository.findById(id);
    }

    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }
}
