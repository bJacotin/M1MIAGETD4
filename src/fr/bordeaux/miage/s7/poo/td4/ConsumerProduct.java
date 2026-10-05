package fr.bordeaux.miage.s7.poo.td4;
import java.util.UUID;

public class ConsumerProduct implements Product{
    private String name;
    private double price;
    private static final double VAT = 0.2;
    private UUID uuid;

    public ConsumerProduct(String name, double price){
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public String getDescription(){
        return "Nom du produit : " + this.name + ". ";
    }

    public double getPriceExclVat(){
        return this.price;
    }

    public double getVat(){
        return VAT;
    }  

    public double getPriceInclVat(){
        return this.price*(1+VAT);
    } 
}
