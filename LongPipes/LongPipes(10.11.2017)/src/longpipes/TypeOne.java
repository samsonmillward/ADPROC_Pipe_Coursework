package longpipes;

public class TypeOne extends LongPipes {

    public TypeOne(int plasticGrade, int quantity,
            boolean chemicalResistance, double length, double diameter) {

        super(plasticGrade, quantity, 0, false, false,
                chemicalResistance, length, diameter);
    }

    public double calculateCost() {
        return super.calculateVolume() * 0.4;
    }
}
