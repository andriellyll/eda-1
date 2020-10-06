package testes;
/*
 * 
 * Para ser possivel utilizar essa classe de testes a classe do algoritmo que deseja ser testado deve implementar a interface 
 * 'Implementacao'(disponivel no pacote interfaces) para executar a verificacao com os testes fornecidos basta utilixar a classe 
 * desejada no construtor forncedido no comeco dos testes.
 * ex: Implementacao ordenador = new BubbleSort() para testar a classe BubbleSort onde o algoritmo bubble sort foi implementado.
 * 
 * o algoritimo de ordenacao deve ser implementado dentro do metodo Sort().
 * 
 */
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interfaces.Implementacao;
import padrao.BubbleSort;
import padrao.InsertionSort;
import padrao.SelectionSort;

class TestesDeOrdenação {

	private int [] vetorOrdenado;
	private int [] vetorDesordenado;
	private int [] vetorParcialmenteOrdenado;
	//private int [] vetorVazio;
	private int [] vetorElementosIguais;
	private int [] vetorComUmElemento;
	private int [] vetorQtdElementosImpares;
	private int[] vetorQtdElementosPares;
	@BeforeEach
	public void iniciarVetoresParaComparacao() {
		populaVetorOrdenado(new int []{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14});
		populaVetorDesordenado(new int [] {8,9,3,4,7,5,8,2,5,9,1});
		populaVetorParcialmenteOrdenado(new int[] { 0,1,2,3,4,5,8,3,6,2,79,0,4});
		populaVetorElementosIguais(new int[] {12,12,12,12,12,12,12});
		populaVetorComUmElemento(new int[] {21});
		populaVetorQtdElementosImpares(new int[] {5,8,3,7,4,6,0});
		populaVetorQtdElementosPares(new int[] {5,8,32,2,90,4,5,1});
		
	}
	//auxiliadores para popular os vetores
	public void populaVetorOrdenado(int [] vetor) {
		this.vetorOrdenado = Arrays.copyOf(vetor,vetor.length);
	}
	public void populaVetorDesordenado(int [] vetor) {
		this.vetorDesordenado = Arrays.copyOf(vetor,vetor.length);
	}
	public void populaVetorParcialmenteOrdenado(int [] vetor) {
		this.vetorParcialmenteOrdenado = Arrays.copyOf(vetor,vetor.length);
	}
	public void populaVetorElementosIguais(int [] vetor) {
		this.vetorElementosIguais = Arrays.copyOf(vetor,vetor.length);
	}
	public void populaVetorComUmElemento(int [] vetor) {
		this.vetorComUmElemento = Arrays.copyOf(vetor,vetor.length);
	}
	public void populaVetorQtdElementosImpares(int [] vetor) {
		this.vetorQtdElementosImpares = Arrays.copyOf(vetor,vetor.length);
	}
	public void populaVetorQtdElementosPares(int [] vetor) {
		this.vetorQtdElementosPares = Arrays.copyOf(vetor,vetor.length);
	}
	
	/* Testes para o algoritmo de ordenacao */

	Implementacao ordenador = new BubbleSort();
	
	@Test
	void testBubbleComVetorOrdenado() {
		int [] vetorCopia = Arrays.copyOf(vetorOrdenado,vetorOrdenado.length);
		Arrays.sort(vetorCopia);
		ordenador.Sort(vetorOrdenado);
		Assert.assertArrayEquals(vetorCopia,vetorOrdenado);
	}
	@Test
	void testBubbleComVetorDesordenado() {
		int [] vetorCopia = Arrays.copyOf(vetorDesordenado,vetorDesordenado.length);
		Arrays.sort(vetorCopia);
		ordenador.Sort(vetorDesordenado);
		Assert.assertArrayEquals(vetorCopia,vetorDesordenado);
	}
	@Test
	void testBubbleComVetorParcilamenteOrdenao() {
		int [] vetorCopia = Arrays.copyOf(vetorParcialmenteOrdenado,vetorParcialmenteOrdenado.length);
		Arrays.sort(vetorCopia);
		ordenador.Sort(vetorParcialmenteOrdenado);
		Assert.assertArrayEquals(vetorCopia,vetorParcialmenteOrdenado);
	}
	@Test
	void testBubbleComVetorElementosIguais() {
		int [] vetorCopia = Arrays.copyOf(vetorElementosIguais,vetorElementosIguais.length);
		Arrays.sort(vetorCopia);
		ordenador.Sort(vetorElementosIguais);
		Assert.assertArrayEquals(vetorCopia,vetorElementosIguais);
	}
	@Test
	void testBubbleComVetorComUmElemento() {
		int [] vetorCopia = Arrays.copyOf(vetorComUmElemento,vetorComUmElemento.length);
		Arrays.sort(vetorCopia);
		ordenador.Sort(vetorComUmElemento);
		Assert.assertArrayEquals(vetorCopia,vetorComUmElemento);
	}
	@Test
	void testBubbleComVetorComQtdDeElementosImpares() {
		int [] vetorCopia = Arrays.copyOf(vetorQtdElementosImpares,vetorQtdElementosImpares.length);
		Arrays.sort(vetorCopia);
		ordenador.Sort(vetorQtdElementosImpares);
		Assert.assertArrayEquals(vetorCopia,vetorQtdElementosImpares);
	}
	@Test
	void testBubbleComVetorComQtdDeElementosPares() {
		int [] vetorCopia = Arrays.copyOf(vetorQtdElementosPares,vetorQtdElementosPares.length);
		Arrays.sort(vetorCopia);
		ordenador.Sort(vetorQtdElementosPares);
		Assert.assertArrayEquals(vetorCopia,vetorQtdElementosPares);
	}
	@Test
	void testBubbleComVetorNulo() {
		assertEquals(true,ordenador.testeDeEntrada(null));
	}
	@Test
	void testBubbleComVetorVazio() {
		assertEquals(true,ordenador.testeDeEntrada(new int [] {}));
	}

}
