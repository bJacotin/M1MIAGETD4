package fr.bordeaux.miage.s7.poo.td4;

public class LotDecorator implements Product{
    private Product product;
    private int quantite;
    private double lotReduction;

    public LotDecorator(Product product, int quantite, double lotReduction){
        this.product = product;
        this.quantite = quantite;
        this.lotReduction = lotReduction;
    }

    public String getDescription(){
        return this.product.getDescription() + " en lot de " + quantite ;
    }

    public double getPriceExclVat(){
        return ((this.product.getPriceExclVat())*quantite)*(1-lotReduction);
    }

    public double getPriceInclVat(){
        return this.getPriceExclVat()*(1+this.getVat());
    }

    public double getVat(){
        return this.product.getVat();
    }

}
