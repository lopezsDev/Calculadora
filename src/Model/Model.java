package Model;

/**
 *
 * @author samir
 */
public class ModelOperaciones {

    int num1, num2;

    public ModelOperaciones() {
    }

    public ModelOperaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    

    public int sumar() {
        int sumar = num1 + num2;

        return sumar;
    }

    public int restar() {

        int restar = num1 - num2;
        return restar;
    }

    public int multiplicar() {

        int multi = num1 * num2;
        return multi;
    }

    public int division() {

        int division = num1 / num2;

        return division;
    }

}
