package br.com.verdeperene.cardapiovirtual.model;

import lombok.Data;

import java.time.DayOfWeek;
import java.util.List;

@Data
public class Congelado {
    private List<DayOfWeek> dias;
}
