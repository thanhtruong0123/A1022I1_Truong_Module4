package com.codegym.service;

import com.codegym.model.Declaration;
import com.codegym.repository.DeclarationRepository;
import com.codegym.repository.DeclarationRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class DeclarationServiceImpl implements DeclarationService {
    private DeclarationRepository declarationRepository = new DeclarationRepositoryImpl();
    @Override
    public Declaration showDeclaration() {
        return declarationRepository.showDeclaration();
    }

    @Override
    public void updateDeclaration(Declaration updateDeclaration) {
        declarationRepository.updateDeclaration(updateDeclaration);
    }
}
