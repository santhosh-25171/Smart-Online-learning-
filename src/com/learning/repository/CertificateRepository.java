package com.learning.repository;

import com.learning.model.Certificate;
import java.util.ArrayList;
import java.util.List;

public class CertificateRepository {
    private final List<Certificate> certificates = new ArrayList<>();

    public void addCertificate(Certificate certificate) {
        certificates.add(certificate);
    }

    public Certificate findById(String id) {
        for (Certificate certificate : certificates) {
            if (certificate.getCertificateId().equals(id)) {
                return certificate;
            }
        }
        return null;
    }

    public List<Certificate> findAll() {
        return certificates;
    }

    public boolean deleteById(String id) {
        return certificates.removeIf(certificate -> certificate.getCertificateId().equals(id));
    }
}
