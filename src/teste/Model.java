package teste;

public class Model {
	
	/**
	 * Metodo para somar dois valores.
	 * @param num1 recebe o primeiro valor para soma.
	 * @param num2 recebe o segundo valor para soma.
	 * @return retorna o valor da soma.
	 * 
	 */
	private long somar(long num1, long num2) 
	{
		return num1+num2;
	}
	/**
	 * Metodo para multiplicar dois valores.
	 * @param num1 primeiro valor para a multiplicaxão 
	 * @param num2 segundo valor para a multiplicaxão 
	 * @return retorna o resultado.
	 */
	private long multiplicar(long num1, long num2)
	{
		return num1*num2;
	}
	/**
	 * Metodo para dividir dois valores
	 * @param num1 primeiro valor para a divisão
	 * @param num2 primeiro valor para a divisão
	 * @return retorna o resultado.
	 */
	private long dividir(long num1, long num2)
	{
		return num1/num2;
	}
	/**
	 * Metodo para subtrair dois valores
	 * @param num1 primeiro valor para a subtração
	 * @param num2 primeiro valor para a subtração
	 * @return retorna o resultado.
	 */
	private long subtrair(long num1, long num2) {
		return num1-num2;
	}
	
	/**
	 * Metodo que realiza uma operação(multipli,divide,subtrai,soma)
	 * @param num1 recebe o primeio valor da opração
	 * @param num2 recebe o segundo valor da opração
	 * @param operacao receber o timo de operação (* multipli, / divide, - subtrai, + soma)
	 * @return retorna o resultado, em string.
	 */
	public String realizarOperações(String num1, String num2, String operacao) {
		String resultado = "";
		
		if(operacao.equals("/")) 
		{
			if(num2.equals("0")) 
			{
				resultado = "Não é possivel dividir por 0";
			}
			else if(num2.equals("")) 
			{
				resultado = num1;
			}
			else 
			{
				long divisao = dividir(Long.parseLong(num1), Long.parseLong(num2));
				resultado += divisao;
			}
			
		}
		else if(operacao.equals("*")) 
		{
			if(num2.equals("")) 
			{
				resultado = num1;
			}
			else
			{
				long multiplicasao = multiplicar(Long.parseLong(num1), Long.parseLong(num2));
				resultado += multiplicasao;
			}
			
		}
		else if(operacao.equals("+")) 
		{
			if(num2.equals("")) 
			{
				resultado = num1;
			}
			else
			{
				long soma = somar(Long.parseLong(num1), Long.parseLong(num2));
				resultado += soma;
			}
		}
		else if(operacao.equals("-"))
		{
			if(num2.equals("")) 
			{
				resultado += num1;
			}
			else
			{
				long subtrasao = subtrair(Long.parseLong(num1), Long.parseLong(num2));
				resultado += subtrasao;
			}
		}
		
		return resultado; 
	}

}
