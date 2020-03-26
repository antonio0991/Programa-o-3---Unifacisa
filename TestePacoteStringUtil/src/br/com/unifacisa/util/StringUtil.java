package br.com.unifacisa.util;

import java.util.Locale;
import java.lang.Integer;

/**
 * A classe StringUtil implementa funções para auxiliar no uso de string e
 * na formatação de alguns tipos de dados.
 * 
 * @author Antonio
 * @version 1.0
 * @since 2020-03-05
 */
public final class StringUtil {
	
	private static final Locale PTBR = new Locale("pt-BR");
	private static final int TAMANHO_CNPJ = 18;
	private static final int TAMANHO_CPF = 15;
	private static final int TAMANHO_CEP = 9;
	/**
	 * Construtor privado da classe
	 */
	private StringUtil() {};
	
	/**
	 * Deixa a string maiúscula
	 * @param str Recebe uma strings
	 * @return String Retorna a string com todas as letras maiúsculas
	 *localizada em português do Brasil
	 */
	public static String todasMaiusculas(String str)
	{
		return str.toUpperCase(PTBR);
	}
	
	
	/**
	 * Deixa a string minúscula
	 * @param str Recebe uma string
	 * @return String  Retorna a string com todas as letras minúsculas
	 * localizada em português do Brasil
	 */
	public static String todasMinusculas(String str)
	{
		return str.toLowerCase(PTBR);
	}
	
	/**
	 * Transforma a primeira letra da string em maiúscula
	 * @param str Recebe uma string
	 * @return String Retorna a string com a primeira letra maiúscula
	 */
	public static String primeiraLetraMaiuscula(String str)
	{
		String retorno = str.substring(0, 1).toUpperCase(PTBR) + str.substring(1);
		return retorno;
	}
	
	/**
	 * Transforma um array de strings em uma string
	 * @param strArr Recebe um array de strings
	 * @return String  Retorna uma string composta pelos elementos do array
	 */
	public static String arrayParaString(String[] strArr)
	{
		StringBuilder output = new StringBuilder();
		for(int i = 0; i<strArr.length; i++)
		{
			output.append(strArr[i]);
			output.append(" ");
		}
		
		return output.toString().strip();
	}
	
	/**
	 * Torna maiúscula a letra de cada palavra da string
	 * @param str Recebe uma string
	 * @return String Retorna uma string com a primeira letra de
	 * cada nome Maiúscula
	 */
	public static String formatarNome(String str)
	{
		String[] strArr = str.split(" ");
		StringBuilder output = new StringBuilder();
		
		for (int i = 0; i < strArr.length; i++) 
		{
			output.append(primeiraLetraMaiuscula(strArr[i]));
			output.append(" ");
		}
		
		return output.toString().strip();
	}
	
	/**
	 * Retorna as iniciais das palavras de uma string.
	 * @param str Recebe uma string
	 * @return Retorna uma string com as iniciais das palavras
	 */
	public static String getIniciais(String str)
	{
		String[] nomes = str.split(" ");
		StringBuilder output = new StringBuilder();
		
		for (int i = 0; i < nomes.length; i++) 
		{
			output.append(nomes[i].charAt(0));
		}
		
		return output.toString();
	}
	
	/**
	 * Este método procura um char em umas string
	 * @param c Char a ser procurado na string
	 * @param str String na qual o char vai ser procurado
	 * @return int Retorna o índice da string em que o char se encontra. Se o char não
	 * for encontrado retorna -1
	 */
	public static int acharNaString(char c, String str)
	{
		int posicao = -1;
		
		for (int i = 0; i < str.length(); i++)
		{
			if(c == str.charAt(i))
			{
				posicao = i;
				break;
			}
		}
		
		return posicao;
	}
	
	/**
	 * Este método procura uma string em outra
	 * @param busca String a ser procurada
	 * @param str String na qual irá ocorrer a busca
	 * @return int Retorna o índice da string str em que a string busca se encontra.
	 * Se não for encontrada o valor retornado é -1
	 *
	 */
	public static int acharNaString(String busca, String str)
	{
		return str.indexOf(busca);
	}

	/**
	 * Este método procura um char em uma string
	 * @param c Char a ser procurado
	 * @param str String na qual irá ocorrer a busca
	 * @return boolean Retorns true se o char estiver na string e false se não estiver.
	 */
	public static boolean temNaString(char c, String str)
	{
		boolean achou = false;
		if(acharNaString(c, str) != -1)
			achou = true;
		return achou;
	}
	
	/**
	 * Este método procura uma string em outra
	 * @param busca String a ser procurada
	 * @param str String na qual irá ocorrer a busca
	 * @return boolean Retorna true se busca estiver em str e false se não estiver.
	 */
	public static boolean temNaString(String busca, String str)
	{
		boolean achou = false;
		if(acharNaString(busca, str) != -1)
			achou = true;
		return achou;
	}
	
	/**
	 * Formata uma string no formato de um CPF:
	 *  XXX.XXX.XXX-XX
	 * @param str String com números do CPF
	 * @return String Retorna o cpf formatado
	 */
	public static String formatarCPF(String str)
	{
		StringBuilder output = new StringBuilder();
		int posStr = 0;
		for(int i = 0; i < TAMANHO_CPF; i++)
		{
			if(i%4 !=0)
			{
				output.append(str.charAt(posStr));
				posStr++;
			}
			else if (i != 12)
			{
				output.append('.');
			}
			else
			{
				output.append('-');
			}
		}
		output.deleteCharAt(0);
		
		return output.toString();
	}

	/**
	 * Formata uma string de números no formato de um CNPJ:
	 * XX.XXX.XXX/YYYY-ZZ
	 * @param str o CNPJ a ser formatado
	 * @return String Retorna o CNPJ formatado
	 */
	public static String formatarCNPJ(String str)
	{
		int posStr = 0;
		StringBuilder output = new StringBuilder();
		for(int i = 0; i<TAMANHO_CNPJ; i++)
		{
			if(i == 2 || i == 6)
			{
				output.append('.');
			}
			else if(i == 10)
			{
				output.append('/');
			}
			else if(i == 15)
			{
				output.append('-');
			}
			else
			{
				output.append(str.charAt(posStr));
				posStr++;
			}
		}
		return output.toString();

	}

	/**
	 * Formata uma string no formato de uma data:
	 * DD/MM/AAAA
	 * @param str Data a ser formatada
	 * @return String Data formatada
	 */
	public static String formatarData(String str)
	{
		StringBuilder output = new StringBuilder();
		int posStr = 0;
		int tamanhoData = str.length() + 2;
		
		for(int i = 0; i<tamanhoData; i++)
		{
			if(i == 2 || i == 5)
			{
				output.append('/');
			}
			else
			{
				output.append(str.charAt(posStr));
				posStr++;
			}
		}
		return output.toString();
	}

	/**
	 * Formata um int para uma string no formato de uma data:
	 * DD/MM/AAAA
	 * @param data Data a ser formatada
	 * @return String Data formatada
	 */
	public static String formatarData(int data)
	{
		String str = Integer.toString(data);
		return formatarData(str);
	}

	/**
	 * Formata uma string no formato de um CEP:
	 * XXXXX-YYY
	 * @param str String a ser formatada
	 * @return String CEP formatado
	 */
	public static String formatarCEP(String str)
	{
		StringBuilder output = new StringBuilder();
		int posStr = 0;
		
		for(int i = 0; i < TAMANHO_CEP; i++)
		{
			if(i == 5)
			{
				output.append('-');
			}
			else
			{
				output.append(str.charAt(posStr));
				posStr++;
			}
		}
		return output.toString();
	}
	
	/**
	 * Formata um inteiro no formato de um CEP:
	 * XXXXX-YYY
	 * @param cep Numero a ser formatado
	 * @return String CEP formatado
	 */
	public static String formatarCEP(int cep)
	{
		String str = Integer.toString(cep);
			return formatarCEP(str);
	}
	
	/**
	 * Converte um inteiro no formato decimal em uma string de um número binário
	 * @param dec Número a ser convertido
	 * @return String Número binário correspondente
	 */
	public static String decParaBinario(int dec)
	{
		return Integer.toBinaryString(dec);
	}
	
	/**
	 * Converte uma string de um número binário para um inteiro decimal
	 * @param binario Número binário a ser convertido
	 * @return int Número decimal correspondente
	 */
	public static int binarioParaDec(String binario)
	{
		return Integer.parseInt(binario, 2);
	}
	
	/**
	 * Adiciona zeros a esquerda de um número inteiro
	 * @param num Numero base a ter os zeros adicionados
	 * @param zeros Numero de zeros a serem adicionados
	 * @return String Numero com zeros adicionados
	 */
	public static String adcZerosEsquerda(int num, int zeros)
	{
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < zeros; i++)
		{
			output.append('0');
		}
		
		output.append(num);
		
		return output.toString();
	}
	
	/**
	 * Adiciona zeros a esquerda de um número inteiro
	 * @param num Numero base a ter os zeros adicionados
	 * @param zeros Numero de zeros a serem adicionados
	 * @return String Numero com zeros adicionados
	 */
	public static String adcZerosEsquerda(String num, int zeros)
	{
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < zeros; i++)
		{
			output.append('0');
		}
		
		output.append(num);
		
		return output.toString();
	}
	
	
}

