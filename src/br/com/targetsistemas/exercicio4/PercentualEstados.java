package br.com.targetsistemas.exercicio4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentualEstados {
	public static void main(String[] args) {
		BigDecimal valorSp = new BigDecimal(67836.43).setScale(4, RoundingMode.HALF_EVEN);
		BigDecimal valorRj = new BigDecimal(36678.66).setScale(4, RoundingMode.HALF_EVEN);
		BigDecimal valorMg = new BigDecimal(29229.88).setScale(4, RoundingMode.HALF_EVEN);
		BigDecimal valorEs = new BigDecimal(27165.48).setScale(4, RoundingMode.HALF_EVEN);
		BigDecimal valorOutros = new BigDecimal(19849.53).setScale(4, RoundingMode.HALF_EVEN);

		BigDecimal valorTotal = new BigDecimal(0).setScale(4, RoundingMode.HALF_EVEN);
		BigDecimal porcentagemMaxima = new BigDecimal(100);

		valorTotal = valorTotal.add(valorSp).add(valorRj).add(valorMg).add(valorEs).add(valorOutros);
		System.out.println("Valor total em R$: " + valorTotal);

		System.out.println("O percentual de cada estado são os seguintes: ");

		System.out.println(
				"Sao Paulo: " + (valorSp.multiply(porcentagemMaxima)).divide(valorTotal, RoundingMode.HALF_EVEN) + "%");
		System.out.println("Rio de Janeiro: "
				+ (valorRj.multiply(porcentagemMaxima)).divide(valorTotal, RoundingMode.HALF_EVEN) + "%");
		System.out.println("Minas Gerais: "
				+ (valorMg.multiply(porcentagemMaxima)).divide(valorTotal, RoundingMode.HALF_EVEN) + "%");
		System.out.println("Espirito Santo: "
				+ (valorEs.multiply(porcentagemMaxima)).divide(valorTotal, RoundingMode.HALF_EVEN) + "%");
		System.out.println("Outros estados: "
				+ (valorOutros.multiply(porcentagemMaxima)).divide(valorTotal, RoundingMode.HALF_EVEN) + "%");

	}
}
