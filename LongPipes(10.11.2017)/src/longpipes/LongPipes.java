package longpipes;

import java.lang.Math;

public class LongPipes {

    private int plasticGrade, quantity, colourAmount;
    private boolean innerInsulation, outerReinforcement, chemicalResistance;
    private double length, diameter, radius, cost;
    private static double[] costPerInch = {0.4, 0.6, 0.75, 0.8, 0.95};

    public LongPipes(int plasticGrade, int quantity, int colourAmount,
            boolean innerInsulation, boolean outerReinforcement,
            boolean chemicalResistance, double length, double diameter) {

        this.plasticGrade = plasticGrade;
        this.quantity = quantity;
        this.colourAmount = colourAmount;
        this.innerInsulation = innerInsulation;
        this.outerReinforcement = outerReinforcement;
        this.chemicalResistance = chemicalResistance;
        this.length = length;
        this.diameter = diameter;
    }

    public int getPlasticGrade() {
        return plasticGrade;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean getChemicalResistance() {
        return chemicalResistance;
    }

    public double getLength() {
        return length;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setPlasticGrade(int plasticGrade) {
        this.plasticGrade = plasticGrade;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setChemicalResistance(boolean chemicalResistance) {
        this.chemicalResistance = chemicalResistance;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double calculateVolume() {
        radius = diameter / 2;
        return Math.PI * (radius * radius) * length;
    }
    
    public double getCostPerInch(int plasticGrade)
    {
        return costPerInch[plasticGrade];
    }
    
    //Needs to be edited later
    public double calculateCost()
    {
        return cost;
    }
}
