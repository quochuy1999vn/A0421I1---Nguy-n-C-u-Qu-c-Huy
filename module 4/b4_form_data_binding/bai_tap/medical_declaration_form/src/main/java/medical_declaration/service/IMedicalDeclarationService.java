package medical_declaration.service;

import medical_declaration.model.MedicalDeclaration;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IMedicalDeclarationService {
    List<MedicalDeclaration> findAll();

    void save(MedicalDeclaration medicalDeclaration);
}
