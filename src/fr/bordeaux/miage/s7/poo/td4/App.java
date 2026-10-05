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

        Product yaourt = new ConsumerProduct("Yaourt", 0.5);
        Product lotAlimentaire = new LotDecorator(new FoodDecorator(yaourt), 6, 0.15);

        System.out.println(lotAlimentaire.getDescription());
        System.out.println("HT : " + lotAlimentaire.getPriceExclVat());
        System.out.println("TTC : " + lotAlimentaire.getPriceInclVat());
    }
}

//Product : c'est le même pour tous les décorateurs, ça ne change pas puisqu'ils gardent la référence.
//getDescription : Il change en fonction des décorateurs mais on garde toujours les précédents, ça imbrique le précédent avec le nouveau,
//getPriceExtrVat : identique à ConsumerProduct sauf si ça doit changer avec des promos,
//getVAT : idem mais avec TVA différente,
//getPriceInclVat : même fonction mais le résultat change en fonction des deux autres méthodes getPriceExtrVAT et getVAT;
