package lesson6;

public class CoffeeMachine {
    private static final int MAX_USAGE_COUNT = 7;
    private int sugar;
    private int beans;
    private int water;
    private int milk;
    private int usageCount;

    public CoffeeMachine(int sugar, int beans, int water, int milk) {
        this.sugar = sugar;
        this.beans = beans;
        this.water = water;
        this.milk = milk;
    }

    public void refill(int sugar, int beans, int water, int milk) {
        if (sugar >= 0) {
            this.sugar += sugar;
        }
        if (beans >= 0) {
            this.beans += beans;
        }
        if (water >= 0) {
            this.water += water;
        }
        if (milk >= 0) {
            this.milk += milk;
        }
    }

    public void makeCoffee(String coffeeType) {
        if (this.usageCount == MAX_USAGE_COUNT) {
            System.out.println("Time to clean");
            return;
        }

        switch (coffeeType.toLowerCase()) {
            case "black":
                this.makeBlack();
                break;
            case "latte":
                this.makeLatte();
                break;
            case "espresso":
                this.makeEspresso();
                break;
            default:
                System.out.println("Wrong choice");
        }
    }

    public void clean() {
        this.usageCount = 0;
    }

    private void makeEspresso() {
        int requiredBeans = 3;
        int requiredWater = 1;
        int requiredSugar = 1;

        if (this.beans < requiredBeans ||
                this.water < requiredWater ||
                this.sugar < requiredSugar) {
            System.out.println("Not enough produce");
            return;
        }

        this.beans -= requiredBeans;
        this.water -= requiredWater;
        this.sugar -= requiredSugar;
        this.usageCount++;
    }

    private void makeLatte() {
        int requiredBeans = 2;
        int requiredWater = 1;
        int requiredSugar = 1;
        int requiredMilk = 1;

        if (this.beans < requiredBeans ||
                this.water < requiredWater ||
                this.sugar < requiredSugar ||
                this.milk < requiredMilk) {
            System.out.println("Not enough produce");
            return;
        }

        this.beans -= requiredBeans;
        this.water -= requiredWater;
        this.sugar -= requiredSugar;
        this.milk -= requiredMilk;
        this.usageCount++;
    }

    private void makeBlack() {
        int requiredBeans = 2;
        int requiredWater = 2;
        int requiredSugar = 1;

        if (this.beans < requiredBeans ||
                this.water < requiredWater ||
                this.sugar < requiredSugar) {
            System.out.println("Not enough produce");
            return;
        }

        this.beans -= requiredBeans;
        this.water -= requiredWater;
        this.sugar -= requiredSugar;
        this.usageCount++;
    }

    public String getProductStatus() {
        return "sugar=" + sugar +
                ", beans=" + beans +
                ", water=" + water +
                ", milk=" + milk;
    }

    public String getStatus() {
        int timesUntilCleaning = MAX_USAGE_COUNT - this.usageCount;

        return ("sugar=" + sugar +
                ", beans=" + beans +
                ", water=" + water +
                ", milk=" + milk +
                "times until cleaning =" + timesUntilCleaning);
    }


}
