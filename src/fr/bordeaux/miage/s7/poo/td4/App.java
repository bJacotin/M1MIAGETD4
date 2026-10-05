package fr.bordeaux.miage.s7.poo.td4;
public class App {
    public static void main(String[] args) throws Exception {
        Product bottes = new ConsumerProduct("Bottes", 100);
        Product bottesEnPromo = new PromotionDecorator(bottes, 0.2);

        System.out.println(bottesEnPromo.getDescription());
        System.out.println("HT : " + bottesEnPromo.getPriceExclVat());
        System.out.println("TTC : " + bottesEnPromo.getPriceInclVat());

        Product pain = new ConsumerProduct("Pain", 2);
        Product painAlimentaire = new FoodDecorator(pain);
        Product painAlimentaireEnPromo = new PromotionDecorator(painAlimentaire, 0.1);

        System.out.println(painAlimentaireEnPromo.getDescription());
        System.out.println("HT : " + painAlimentaireEnPromo.getPriceExclVat());
        System.out.println("TVA : " + painAlimentaireEnPromo.getVat());
        System.out.println("TTC : " + painAlimentaireEnPromo.getPriceInclVat());
    }
}
