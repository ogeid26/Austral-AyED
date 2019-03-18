package TP2.Ejercicio_4;

public class ComplexNumber {

    private double a, b;

    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getRealPart(){
        return a;
    }
    public double getImaginaryPart(){
        return b;
    }

    public ComplexNumber sum(ComplexNumber c1){
        //Suma el número actual con otro, c1.
        ComplexNumber returnValue = new ComplexNumber(getRealPart()+c1.getRealPart(), getImaginaryPart()+c1.getImaginaryPart());
        return returnValue;
    }

    public ComplexNumber substract(ComplexNumber c1){
        //Resta c1 del número actual.
        ComplexNumber returnValue = new ComplexNumber(getRealPart()-c1.getRealPart(), getImaginaryPart()-c1.getImaginaryPart());
        return returnValue;
    }
    public ComplexNumber product(ComplexNumber c1){
        //Multiplica el número actual con otro, c1.
        double a_coef = getRealPart()*c1.getRealPart() - getImaginaryPart()*c1.getImaginaryPart();
        double b_coef = getRealPart()*c1.getImaginaryPart() + getImaginaryPart()*c1.getRealPart();
        ComplexNumber returnValue = new ComplexNumber(a_coef, b_coef);
        return returnValue;
    }

    public ComplexNumber quotient(ComplexNumber c1){
        if (c1.getRealPart() == 0  )
    }


}
