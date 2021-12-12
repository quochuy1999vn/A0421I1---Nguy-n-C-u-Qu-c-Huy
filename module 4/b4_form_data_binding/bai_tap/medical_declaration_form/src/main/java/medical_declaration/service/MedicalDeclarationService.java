package medical_declaration.service;

import medical_declaration.model.MedicalDeclaration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MedicalDeclarationService implements IMedicalDeclarationService{
    List<MedicalDeclaration> medicalDeclarations = new ArrayList<>();
    @Override
    public List<MedicalDeclaration> findAll() {
        return medicalDeclarations;
    }

    @Override
    public void save(MedicalDeclaration medicalDeclaration) {
        medicalDeclarations.add(medicalDeclaration);
    }
}
