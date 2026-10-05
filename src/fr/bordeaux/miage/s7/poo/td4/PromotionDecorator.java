package fr.bordeaux.miage.s7.poo.td4;

public class PromotionDecorator implements Product{
    private Product product;
    private double promotion;

    public PromotionDecorator(Product product, double promotion){
        this.product = product;
        this.promotion = promotion;
    }

    public String getDescription(){
        return this.product.getDescription() + "Actuellement en réduction de : " + promotion*100 + "%.";
    }

    public double getPriceExclVat(){
        return this.product.getPriceExclVat()*(1-promotion);
    }

    public double getPriceInclVat(){
        return this.getPriceExclVat()*(1+this.product.getVat());
    }

    public double getVat(){
        return this.product.getVat();
    }
}
