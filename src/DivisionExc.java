class DivisionExc extends Exception {
    double firstNum;
    double secondNum;

    public DivisionExc(double firsNum, double secondNum) {
        this.firstNum = firsNum;
        this.secondNum = secondNum;
    }

    @Override
    public String toString() {
        return "Результат деления " + String.format("%.2f", firstNum) +
                " на " + String.format("%.2f", secondNum) +
                " меньше 1";
    }
}
