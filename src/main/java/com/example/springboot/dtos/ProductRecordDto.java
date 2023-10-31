package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

//passo como argumento o que o clinete irá enviar para ser salvo na base de dados. Lembrando que não há necessidade de passar o ID pois ele será automaticamente gerado
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {

}
