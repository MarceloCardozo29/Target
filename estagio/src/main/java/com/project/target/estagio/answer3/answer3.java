package com.project.target.estagio.answer3;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class answer3 {
    @SneakyThrows
    public static void main(String[] args) throws IOException {
        File file = new File( "C:\\Users\\Marcelo\\Desktop\\Processo\\generated.json");

        Comparator<Dia> comparator = (j1, j2) -> j1.getValor().compareTo(j2.getValor());

        ObjectMapper mapper = new ObjectMapper();
        Dia[] dias = mapper.readValue(file.toURI().toURL(), Dia[].class);

            Dia min = Arrays.stream(dias).filter(m -> m.getValor() > 0).min(comparator).get();
            Dia max = Arrays.stream(dias).filter(s -> s.getValor() > 0).max(comparator).get();
            System.out.println("O menor dia de faturamento foi: " + min);
            System.out.printf("O maior dia de faturamento foi: " + max);

        double average = Arrays.stream(dias).filter(z -> z.getValor() > 0).mapToDouble(Dia::getValor).average().getAsDouble();
        System.out.printf("\nA média do faturamento diário foi de: %.2f", average);

        List<Dia> itensAcimaMedia = Arrays.stream(dias).filter(d -> d.getValor() > average)
                .collect(Collectors.toList());

        //imprime todos acima da média
       // itensAcimaMedia.stream().forEach(System.out::println);

        int size = itensAcimaMedia.size();
        System.out.println("\nO número de dias no mês em que o valor de faturamento diário foi " +
                                 "superior à média mensal foi: " + size);

    }

    }



    /*3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
    • O menor valor de faturamento ocorrido em um dia do mês;
    • O maior valor de faturamento ocorrido em um dia do mês;
    • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

    IMPORTANTE:
    a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
    b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;  */