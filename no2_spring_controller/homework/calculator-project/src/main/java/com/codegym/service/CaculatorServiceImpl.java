package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CaculatorServiceImpl implements CaculatorService {
    @Override
    public double doAddiction(double operand1, double operand2) {
        return operand1 + operand2;
    }

    @Override
    public double doSubtraction(double operand1, double operand2) {
        return operand1 - operand2;
    }

    @Override
    public double doMultiplication(double operand1, double operand2) {
        return operand1 * operand2;
    }

    @Override
    public double doDivision(double operand1, double operand2) {
        return operand1 / operand2;
    }
}
