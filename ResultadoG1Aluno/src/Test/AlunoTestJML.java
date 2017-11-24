package Test;

import Grau.Aluno;

public class AlunoTestJML {

	public static void main (String args[]){
		testConstrutor();
		//testConstrutor2();
		//testConstrutor3();
		testNotasG1();
		testResultadoFinalFaltas();
		testResultadoFinalMenorG1();
		testResultadoFinalMaiorG1();
		testResultadoFinalG1G2();
		testResultadoFinalReprovado();
	}
	
	/*
		Metodo que testa o construtor com condições verdadeiras
		Resultado esperado = true;
	*/
	public static  void testConstrutor(){
		System.out.println("Teste 1");
		Aluno teste = new Aluno ("Teste construtor","32895678",9,6,7,9.5,0);
	
	}
	
	/*
		Metodo que testa o construtor com condições falsas
		Resultado esperado = false;
	*/
	public static  void testConstrutor2(){
		System.out.println("Teste 2");
		Aluno teste = new Aluno ("Teste","3295678",11,12,14,44,19);
	
	}
	
	/*
		Metodo que testa invariante para valores negativos
		Resultado esperado = false;
	*/
	public static  void testConstrutor3(){
		System.out.println("Teste 3");
		Aluno teste = new Aluno ("Teste T3","32956781",-9,-1,-2,-4,-9);
	
	}
	
	/*
		Metodo que testa nota dos G1
	*/
	public static  void testNotasG1(){
		System.out.println("Teste 4");
		Aluno teste = new Aluno ("Teste Notas","13295678",10,10,10,10,0);
	
	}
	
	/*
		Metodo que testa resultadoFinal por faltas
		resultado esperado = true;
	*/
	public static  void testResultadoFinalFaltas(){
		System.out.println("Teste 5");
		Aluno teste = new Aluno ("Teste Notas","13295678",10,10,10,10,16);
	
	}
	
	/*
		Metodo que testa resultadoFinal por G1 < 4
		resultado esperado = true;
	*/
	public static  void testResultadoFinalMenorG1(){
		System.out.println("Teste 6");
		Aluno teste = new Aluno ("Teste Notas","13295678",3,3,3,3,0);
	
	}
	
	/*
		Metodo que testa resultadoFinal por G1 >= 7
		resultado esperado = true;
	*/
	public static  void testResultadoFinalMaiorG1(){
		System.out.println("Teste 7");
		Aluno teste = new Aluno ("Teste Notas","13295678",7,7,7,7,0);
	
	}
	
	/*
		Metodo que testa resultadoFinal por G1+G2 >= 5
		resultado esperado = true;
	*/
	public static  void testResultadoFinalG1G2(){
		System.out.println("Teste 8");
		Aluno teste = new Aluno ("Teste Notas","13295678",4,4,4,4,0);
		teste.setG2(6);
	
	}
	
	/*
		Metodo que testa resultadoFinal reprovado
		resultado esperado = true;
	*/
	public static  void testResultadoFinalReprovado(){
		System.out.println("Teste 9");
		Aluno teste = new Aluno ("Teste Notas","13295678",4,4,4,4,0);
		teste.setG2(5);
	}
}
