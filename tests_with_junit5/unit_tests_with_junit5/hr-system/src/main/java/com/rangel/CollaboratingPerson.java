package com.rangel;

public class CollaboratingPerson {
    
    private double grossSalary;

    public double calculateNetSalary() {
        return getGrossSalary() * (80 / 100.0);
      }
    
      public double calculateAnnualGrossValueReceived(int ano) {
        return ano * getGrossSalary() * 12;
      }
    
      public double calculateAnnualNetValueReceived(int ano) {
        return calculateNetSalary() * 12 * ano;
      }
    
      public double calculateAnnualTaxValue(int ano) {
        return calculateAnnualGrossValueReceived(ano) - calculateAnnualNetValueReceived(ano);
      }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
}
