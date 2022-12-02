package Calculo;
import java.lang.Math;

public class Operacao {
	private double num1, num2, num3;

	public Operacao(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getNum3() {
		return num3;
	}

	public void setNum3(double num3) {
		this.num3 = num3;
	}
	
	public double Adicionar (double num1, double num2) {
		num3 = num1 + num2;		
		return num3;
	}	
	
	public double Multiplicar (double num1, double num2) {
		num3 = num1 * num2;	
		return num3;
	}
	
	public double Subtrair (double num1, double num2) {
		num3 = num1 - num2;		
		return num3;
	}
	
	public double Dividir (double num1, double num2) {
		num3 = num1 / num2;		
		return num3;
	}
	
	public double ExpoenteRaiz (double num1, double num2) {
		if (num2 == 0) {
			num3 = Math.sqrt(num1);		
		}else {
			num3 = Math.pow(num1, num2);
		}
		return num3;
	}
}
