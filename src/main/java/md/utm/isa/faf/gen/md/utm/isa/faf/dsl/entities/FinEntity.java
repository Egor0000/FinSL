package md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities;

import lombok.Data;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.enums.Currency;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.enums.FinTypes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class FinEntity {
    String name;
    Currency currency;
    FinTypes finTypes;
    Map<String, Double> vars = new HashMap<>();

}
