package com.example.springboot_crashcourse.session2.calculator_tdd_style;

public class Calculator {
    public <T> Number sum(T firstNum, T secondNum) {
        if (firstNum instanceof Integer) return Integer.parseInt(firstNum.toString()) + Integer.parseInt(secondNum.toString());
        else if (firstNum instanceof Double) return Double.parseDouble(firstNum.toString()) + Double.parseDouble(secondNum.toString());
        else if (firstNum instanceof Float) return Float.parseFloat(firstNum.toString()) + Float.parseFloat(secondNum.toString());
        else if (firstNum instanceof Long) return Long.parseLong(firstNum.toString()) + Long.parseLong(secondNum.toString());
        else if (firstNum instanceof Short) return (short) (Short.parseShort(firstNum.toString()) + Short.parseShort(secondNum.toString()));

        return null;
    }

    public <T> Number difference(T firstNum, T secondNum) {
        if (firstNum instanceof Integer) return Integer.parseInt(firstNum.toString()) - Integer.parseInt(secondNum.toString());
        else if (firstNum instanceof Double) return Double.parseDouble(firstNum.toString()) - Double.parseDouble(secondNum.toString());
        else if (firstNum instanceof Float) return Float.parseFloat(firstNum.toString()) - Float.parseFloat(secondNum.toString());
        else if (firstNum instanceof Long) return Long.parseLong(firstNum.toString()) - Long.parseLong(secondNum.toString());
        else if (firstNum instanceof Short) return (short) (Short.parseShort(firstNum.toString()) - Short.parseShort(secondNum.toString()));

        return null;
    }

    public <T> Number multiply(T firstNum, T secondNum) {
        if (firstNum instanceof Integer) return Integer.parseInt(firstNum.toString()) * Integer.parseInt(secondNum.toString());
        else if (firstNum instanceof Double) return Double.parseDouble(firstNum.toString()) * Double.parseDouble(secondNum.toString());
        else if (firstNum instanceof Float) return Float.parseFloat(firstNum.toString()) * Float.parseFloat(secondNum.toString());
        else if (firstNum instanceof Long) return Long.parseLong(firstNum.toString()) * Long.parseLong(secondNum.toString());
        else if (firstNum instanceof Short) return (short) (Short.parseShort(firstNum.toString()) * Short.parseShort(secondNum.toString()));

        return null;
    }

    public <T> Number divide(T firstNum, T secondNum) {
        if (firstNum instanceof Integer) return Integer.parseInt(firstNum.toString()) / Integer.parseInt(secondNum.toString());
        else if (firstNum instanceof Double) return Double.parseDouble(firstNum.toString()) / Double.parseDouble(secondNum.toString());
        else if (firstNum instanceof Float) return Float.parseFloat(firstNum.toString()) / Float.parseFloat(secondNum.toString());
        else if (firstNum instanceof Long) return Long.parseLong(firstNum.toString()) / Long.parseLong(secondNum.toString());
        else if (firstNum instanceof Short) return (short) (Short.parseShort(firstNum.toString()) / Short.parseShort(secondNum.toString()));

        return null;
    }
}
