package md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities;

import lombok.Data;

@Data
public class BalanceSheet {
    Asset asset;
    Liability liability;
    Equity equity;
}
