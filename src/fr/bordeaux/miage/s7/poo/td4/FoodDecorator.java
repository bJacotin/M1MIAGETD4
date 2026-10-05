package fr.bordeaux.miage.s7.poo.td4;

public class FoodDecorator implements Product{
    private Product product;
    private final static double VAT = 0.055;

    public FoodDecorator(Product product){
        this.product = product;
    }

    public String getDescription(){
        return this.product.getDescription() + "(produit alimentaire). ";
    }

    public double getPriceExclVat(){
        return this.product.getPriceExclVat();
    }

    public double getPriceInclVat(){
        return this.getPriceExclVat()*(1+this.getVat());
    }

    public double getVat(){
        return VAT;
    }
}
