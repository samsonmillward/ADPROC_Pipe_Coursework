package longpipes;
import java.lang.Math;
public class LongPipes {
    protected int plasticGrade, quantity;
    protected boolean chemicalResistance;
    protected double length, diameter, radius, costPerInch, cost, totalCost;
    
  public LongPipes(int plasticGrade, int quantity, boolean chemicalResistance, double length, double diameter) {
      this.plasticGrade = plasticGrade;
      this.quantity = quantity;
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
}