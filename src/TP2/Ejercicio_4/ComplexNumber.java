package TP2.Ejercicio_4;

public class ComplexNumber {

    private double a, b;

    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double re(){
        return a;
    }
    public double im(){
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    //Modifiers
    public void sum(ComplexNumber c1){
        //Suma el número actual con otro, c1.
        setA(re()+c1.re());
        setB(im()+c1.im());
    }

    public void substract(ComplexNumber c1){
        //Resta c1 del número actual.
        setA(re()-c1.re());
        setB(im()-c1.im());
    }
    public void product(ComplexNumber c1){
        //Multiplica el número actual con otro, c1.
        setA(( re()*c1.re() ) - ( im()*c1.im()) );
        setB(( re()*c1.im() ) + ( im()*c1.re()) );
    }

    public ComplexNumber quotient(ComplexNumber c1){
        if (c1.re() == 0 || c1.im() == 0 ){
            throw new IllegalArgumentException("Los coeficientes del divisor deben ser distintos a 0");
        }
        else{
            double a_coef = (re()*c1.re() + im()*c1.im())/(Math.pow(c1.re(),2)+Math.pow(c1.im(),2));
            double b_coef = (im()*c1.re()-re()*c1.im())/((Math.pow(c1.re(),2)+Math.pow(c1.im(),2)));
            return new ComplexNumber(a_coef, b_coef);
        }
    }

    public double modulus(){
         return Math.sqrt( Math.pow(re(),2) + Math.pow(im(),2) );
    }


}
