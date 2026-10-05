package fr.bordeaux.miage.s7.poo.td4;

public abstract class ProductDecorator implements Product{
    protected Product product;

    public ProductDecorator(Product product){
        this.product = product;
    }

    protected abstract String getExtraDescription();

    @Override 
    public String getDescription(){
        return this.product.getDescription() + " " + this.getExtraDescription();
    }

    @Override 
    public double getPriceExclVat(){
        return this.product.getPriceExclVat();
    }

    @Override 
    public double getVat(){
        return this.product.getVat();
    }  

    @Override 
    public double getPriceInclVat(){
        return this.getPriceExclVat()*(1+this.getVat());
    } 

}
