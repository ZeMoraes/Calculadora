package teste;

public class ModelControl{
	private static String operando = "";
	private static String operador = "";
	private static String lastOperato = "";
	public boolean isButom = false;
	private static Model calculadora = new Model();
	
public static void teclasPrecionadas(int tecla,boolean bork) {
		
		switch (tecla) {
		case 1:
			if(operador.equals("")) {
				operador = calculadora.realizarOperações(operando, operador, lastOperato);
			}
			else {
				operador = calculadora.realizarOperações(operador,operando,lastOperato);
			}
            operando=operador;
            //window.textField.setText(operando);/// aqui tenho que se comunicar com a interface....
            operador="";
            lastOperato = "=";
			break;
		case 2:
			lastOperato = "+";
			if(operador.equals("")) {
				operador = calculadora.realizarOperações(operando,operador,"+");
			}
			else {
				operador = calculadora.realizarOperações(operador,operando,"+");
			}
			operando = "";
			break;
		case 3:
			lastOperato = "*";
			if(operador.equals("")) {
				operador = calculadora.realizarOperações(operando,operador,"*");
			}
			else {
				operador = calculadora.realizarOperações(operador,operando,"*");
			}
			operando = "";
			break;
		case 4:
			lastOperato = "/";
			if(operador.equals("")) {
				operador = calculadora.realizarOperações(operando,operador,"/");
			}
			else {
				operador = calculadora.realizarOperações(operador,operando,"/");
			}
			operando = "";
			break;
		case 5:
			lastOperato = "-";
			if(operador.equals("")) {
				operador = calculadora.realizarOperações(operando,operador,"-");
			}
			else {
				operador = calculadora.realizarOperações(operador,operando,"-");
			}
			operando = "";
			break;
		case 6:
			if(lastOperato.equals("=")) {
				//window.textField.setText("");
				operando = "";
			}
			operando+='1';
			break;
		case 7:
			if(lastOperato.equals("=")) {
				//.textField.setText("");
				operando = "";
			}
			operando+='2';
			break;
		case 8:
			if(lastOperato.equals("=")) {
				//window.textField.setText("");
				operando = "";
			}
			operando+='3';
			break;
		case 9:
			if(lastOperato.equals("=")) {
				//window.textField.setText("");
				operando = "";
			}
			operando+='4';
			break;
		case 10:
			if(lastOperato.equals("=")) {
				//window.textField.setText("");
				operando = "";
			}
			operando+='5';
			break;
		case 11:
			if(lastOperato.equals("=")) {
				//window.textField.setText("");
				operando = "";
			}
			operando+='6';
			break;
		case 12:
			if(lastOperato.equals("=")) {
				//window.textField.setText("");
				operando = "";
			}
			if(bork) {
				//String temp = window.textField.getText()+'7';
				//window.textField.setText(temp);
			}
			operando+='7';
			break;
		case 13:
			if(lastOperato.equals("=")) {
				//window.textField.setText("");
				operando = "";
			}
			operando+='8';
			break;
		case 14:
			if(lastOperato.equals("=")) {
				//window.textField.setText("");
				operando = "";
			}
			operando+='9';
			break;
		case 15:
			if(lastOperato.equals("=")) {
				//window.textField.setText("");
				operando = "";
			}
			operando+='0';
			break;
		case 16:
	
			break;

		default:
			break;
		}
		
	}
}
