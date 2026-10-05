package fr.bordeaux.miage.s7.poo.td4;

public class WeightDecorator extends ProductDecorator{
    private double weight;

    public WeightDecorator(Product product, double weight){
        super(product);
        this.weight = weight;
    }

    @Override 
    public String getExtraDescription(){
        return "produit avec un prix au kilo : poids de : " + this.weight + "kg. ";
    }

    @Override
    public double getPriceExclVat(){
        return this.product.getPriceExclVat()*weight;
    } 

}
