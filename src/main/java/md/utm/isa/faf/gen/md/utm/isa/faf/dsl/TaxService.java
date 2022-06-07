package md.utm.isa.faf.gen.md.utm.isa.faf.dsl;

import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities.FinEntity;

public class TaxService {
    static void calculateTax(double ti, FinEntity entity, Double taxVal) {
        double tax=0,cess=0;
        if(ti > 10000 && ti < 20000)
            tax = (ti-3000)*0.1*taxVal/2;
        else if(ti > 50000 && ti < 100000)
            tax = 2000 + (ti-5000)*0.2*taxVal/2;
        else if(ti > 100000)
            tax = 12000 + (ti-100000)*0.3*taxVal/2;

        cess = tax * 0.03*taxVal/2;
        System.out.println("Total tax: "+tax);
        System.out.println("Tax payable:"+(tax+cess));
    }

    static double calcIndividualTax(double userIncome)
    {
        double federalExemption= 11327.0; // temp
        double provincialExemption= 9863.0; // temp
        double federalTax =  (userIncome- federalExemption) * 0.15; // temp
        double provincialTax= (userIncome - provincialExemption) * 0.0505; // temp
        double totalTax= federalTax + provincialTax;

        return userIncome - totalTax;
    }
}
