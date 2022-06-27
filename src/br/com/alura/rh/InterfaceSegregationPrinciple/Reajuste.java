package br.com.alura.rh.InterfaceSegregationPrinciple;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {
	BigDecimal valor();
	LocalDate data();
	BigDecimal valorImpostoDeRenda();
}
