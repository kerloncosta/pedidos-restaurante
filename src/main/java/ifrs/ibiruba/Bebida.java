package ifrs.ibiruba;

public class Bebida extends ItemCardapio {
    private String flavor;
    private String subcategory;
    private boolean isReturnable;
    private boolean returnedBottle;

    public String getFlavor() {
        return flavor;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public boolean isReturnable() {return isReturnable;}

    public boolean isReturnedBottle() {
        return returnedBottle;
    }

    public Bebida(String name, double price, String category, String subcategory, String flavor, boolean isReturnable, boolean returnedBottle) {
        super(name, price, category);
        this.subcategory = subcategory;
        this.flavor = flavor;
        this.isReturnable = isReturnable;
        this.returnedBottle = returnedBottle;
    }

    public Bebida(String name, double price, String category, String subcategory) {
        super(name, price, category);
        this.subcategory = subcategory;
        this.flavor = "";
        this.isReturnable = false;
        this.returnedBottle = false;
    }

    @Override
    public double calculateFinalPrice() {
        double finalPrice = getPrice();

        if (isReturnable && returnedBottle) {
            finalPrice -= 2.50;
        }

        return finalPrice;
    }

    @Override
    public String toString() {
        String textFlavor = "";
        String returnableText = "";

        if (flavor != null && !flavor.isEmpty()) {
            textFlavor = " (" + flavor + ")";
        }

        if (isReturnable) {
            returnableText = " Retornável";
        }

        return getName() + textFlavor + returnableText +
                " - R$ " + String.format("%.2f", calculateFinalPrice());
    }
}
