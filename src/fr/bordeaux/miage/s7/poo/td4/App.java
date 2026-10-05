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

        Product fromage = new ConsumerProduct("Fromage", 1.45);
        Product fromageAlimentaireAuPoids = new WeightDecorator(new FoodDecorator(fromage), 0.3);
        System.out.print(fromageAlimentaireAuPoids.getDescription());
        System.out.println("HT : " + fromageAlimentaireAuPoids.getPriceExclVat());
        System.out.println("TTC : " + fromageAlimentaireAuPoids.getPriceInclVat());

    }
}

//Product : c'est le même pour tous les décorateurs, ça ne change pas puisqu'ils gardent la référence.
//getDescription : Il change en fonction des décorateurs mais on garde toujours les précédents, ça imbrique le précédent avec le nouveau,
//getPriceExtrVat : identique à ConsumerProduct sauf si ça doit changer avec des promos,
//getVAT : idem mais avec TVA différente,
//getPriceInclVat : même fonction mais le résultat change en fonction des deux autres méthodes getPriceExtrVAT et getVAT;


//1. Quelles parties du code sont maintenant factorisées dans ProductDecorator ?
//Les classes ne déclarent plus l'attribut Product, certaines méthodes comme getVat() et getPriceInclVat() de même ainsi que l'assemblage de la description est réalisé par ProductDecorator

//2. Pourquoi l’ajout d’un nouveau décorateur ne nécessite-t-il pas de modifier les classes existantes ?
//Puisque chaque decorateur a une seule et unique responsabilité, il a juste à modifier au sein de sa propre classe par un Override les méthodes à adapter à son comportement. Elles n'ont que l'interface Product en commun.

//3. 3. Pourquoi cette solution évite-t-elle de créer une classe pour chaque combinaison de comportements ?
// Puisqu'on a juste a empiler les décorateurs pour ajouter une promotion à un produit alimentaire par exemple.. On a pas besoin de créer une classe qui fait la promo pour les produits alimentaires. 