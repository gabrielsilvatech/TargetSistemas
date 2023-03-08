package br.com.targetsistemas.exercicio3;

import java.io.File;
import java.math.BigDecimal;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Vetor {

	public static void main(String[] args) throws Exception {

		File jsonFile = new File("dados.json");
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootnode = mapper.readTree(jsonFile);
		BigDecimal soma = BigDecimal.ZERO;
		int contador = 0;
		// Media mensal sem contar com os dias em que não teve faturamento.
		for (JsonNode node : rootnode) {
			BigDecimal valor = new BigDecimal(node.get("valor").asText());
			if (valor.compareTo(BigDecimal.ZERO) == 0) {
				contador = contador;
			} else {
				soma = soma.add(valor);
				contador++;
			}
		}
		BigDecimal media = soma.divide(BigDecimal.valueOf(contador), 4, BigDecimal.ROUND_HALF_EVEN);
		System.out.println("Media diaria: " + media);

		// Numero de dias do mes em que o faturamento foi maior que a media diaria.
		int contador2 = 0;
		for (JsonNode node : rootnode) {
			BigDecimal valor = new BigDecimal(node.get("valor").asText());
			if (valor.compareTo(media) > 0) {
				contador2++;
			} else {
				contador2 = contador2;
			}
		}
		System.out.println("Numero de dias do mes em que o faturamento foi maior que a media diaria: " + contador2);

		// O maior valor de faturamento ocorrido no mes
		BigDecimal valorAntigo = BigDecimal.ZERO;
		BigDecimal maiorValor = BigDecimal.ZERO;
		for (JsonNode node : rootnode) {
			BigDecimal valor = new BigDecimal(node.get("valor").asText());
			if (valor.compareTo(valorAntigo) > 0) {
				maiorValor = valor;
				valorAntigo = valor;
			}
		}
		System.out.println("Maior Valor de faturamento ocorrido no mes: " + maiorValor);

		// O menor valor de faturamento ocorrido no mes
		BigDecimal menorValor = BigDecimal.ZERO;
		for (JsonNode node : rootnode) {
			BigDecimal valor = new BigDecimal(node.get("valor").asText());
			if (!(valor.compareTo(BigDecimal.ZERO) == 0)) {
				if (valor.compareTo(maiorValor) < 0) {
					menorValor = valor;
					maiorValor = valor;
				}
			}
		}
		System.out.println("Menor Valor de faturamento ocorrido no mes: " + menorValor);

	}
}
