package md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities;

import lombok.Data;

@Data
public class Asset {
    private Double cash;
    private Double expenses;
    private Double inventory;
    private Double accounts;
    private Double longTerm;
}
