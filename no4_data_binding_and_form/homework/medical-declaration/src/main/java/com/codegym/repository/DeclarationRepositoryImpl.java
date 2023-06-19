package com.codegym.repository;

import com.codegym.model.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeclarationRepositoryImpl implements DeclarationRepository {
    private static Declaration declaration;

    static {
        declaration = new Declaration(new Infomation("Truong Thanh Truong", "06-03-1999", true, "Viet Nam", "3102948567","O to", null, null, new Date("01", "02", "2023"), new Date("02", "02", "2023"), "Da Nang"),
                new ContactAddress("Da Nang", "Hai Chau", "Hoa Cuong Bac", "133 Nui Thanh", "0375318149", "thanhtruong0123@gmail.com"),
                new SymptomsPast14Days(true, true, false, true, false, false, false, false),
                new ExposureHistory(false, true));
    }

    @Override
    public Declaration showDeclaration() {
        return declaration;
    }

    @Override
    public void updateDeclaration(Declaration updateDeclaration) {
        declaration = updateDeclaration;
    }
}
