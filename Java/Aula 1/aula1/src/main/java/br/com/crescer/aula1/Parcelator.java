package br.com.crescer.aula1;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

public interface Parcelator {
    Map<String, BigDecimal> calcular(BigDecimal valorParcelar, int numeroParcelas, double taxaJuros, Date dataPrimeiroVencimento);    
}
