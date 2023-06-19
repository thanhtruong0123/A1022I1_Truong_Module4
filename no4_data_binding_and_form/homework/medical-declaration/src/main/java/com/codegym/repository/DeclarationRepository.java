package com.codegym.repository;

import com.codegym.model.Declaration;

public interface DeclarationRepository {
    Declaration showDeclaration();
    void updateDeclaration(Declaration updateDeclaration);
}
