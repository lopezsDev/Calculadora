package Model;

/**
 *
 * @author samir
 */
public class Model {
    int num1, num2;

    public Model() {
    }

    public Model(int num1, int num2) {
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
    
    public void Sumar(){
    int Resultado = num1 + num2;
    }
    
    public void Restar(){
    int Resultado = num1 - num2;
    }
    
    public void Multiplicar(){
    int Resultado = num1 * num2;
    }
    
    public void Dividir(){
    int Resultado = num1 / num2;
    }
}