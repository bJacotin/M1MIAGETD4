package fr.bordeaux.miage.s7.poo.td4;

public class PromotionDecorator extends ProductDecorator{
    private double promotion;

    public PromotionDecorator(Product product, double promotion){
        super(product);
        this.promotion = promotion;
    }

    @Override
    public String getExtraDescription(){
        return "Actuellement en réduction de : " + promotion*100 + "%.";
    }

    @Override 
    public double getPriceExclVat(){
        return this.product.getPriceExclVat()*(1-promotion);
    }
}
