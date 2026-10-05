package fr.bordeaux.miage.s7.poo.td4;

public class FoodDecorator extends ProductDecorator{
    private final static double VAT = 0.055;

    public FoodDecorator(Product product){
        super(product);
    }

    @Override 
    public String getExtraDescription(){
        return "(produit alimentaire). ";
    }

    @Override 
    public double getVat(){
        return VAT;
    }
}
