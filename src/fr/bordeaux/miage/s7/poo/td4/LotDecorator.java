package fr.bordeaux.miage.s7.poo.td4;

public class LotDecorator extends ProductDecorator{
    private int quantite;
    private double lotReduction;

    public LotDecorator(Product product, int quantite, double lotReduction){
        super(product);
        this.quantite = quantite;
        this.lotReduction = lotReduction;
    }

    @Override 
    public String getExtraDescription(){
        return "en lot de " + quantite ;
    }

    @Override
    public double getPriceExclVat(){
        return ((this.product.getPriceExclVat())*quantite)*(1-lotReduction);
    }
}
