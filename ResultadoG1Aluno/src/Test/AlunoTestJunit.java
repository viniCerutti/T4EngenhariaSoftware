package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Grau.Aluno;
import Grau.GrauFinal;

public class AlunoTestJunit {

	/*
	 * Testa se o calculo da nota do G1 esta correto
	 * formula do calculo = (P1+P2+T+E)/4
	 */
	@Test
	public void testG1() {
		Aluno aluno1 = new Aluno ("Henrique Soares","12821921",4,4,4,4,0);
		assertEquals(aluno1.getG1(), 4, 0.001);
	}
	
	/*
	 * Testa o grau de aprovacao do aluno conforme as faltas
	 */
	@Test
	public void testResultadoFaltas() {
		Aluno aluno1 = new Aluno ("Henrique Soares","12821921",7,7,7,7,16);
		assertEquals(aluno1.getResultado(),GrauFinal.REP);
	}
	
	/*
	 * Testa o grau de aprovacao do aluno conforme as notas de G1 < 4
	 */
	@Test
	public void testResultadoMenorG1() {
		Aluno aluno1 = new Aluno ("Henrique Soares","12821921",3,3,3,3,0);
		assertEquals(aluno1.getResultado(),GrauFinal.REP);
	}
	
	/*
	 * Testa o grau de aprovacao do aluno conforme as notas de G1 >= 7
	 */
	@Test
	public void testResultadoMaiorG1() {
		Aluno aluno1 = new Aluno ("Henrique Soares","12821921",7,7,7,7,0);
		assertEquals(aluno1.getResultado(),GrauFinal.APR);
	}
	
	/*
	 * Testa o grau de aprovacao do aluno conforme as notas de G1+G2 >= 5
	 */
	@Test
	public void testResultadoG1G2() {
		Aluno aluno1 = new Aluno ("Henrique Soares","12821921",4,4,4,4,0);
		aluno1.setG2(6);
		assertEquals(aluno1.getResultado(),GrauFinal.APR);
	}
	
	/*
	 * Testa o grau de aprovacao do aluno
	 */
	@Test
	public void testResultado() {
		Aluno aluno1 = new Aluno ("Henrique Soares","12821921",4,4,4,4,0);
		aluno1.setG2(5);
		assertEquals(aluno1.getResultado(),GrauFinal.REP);
	}

}
