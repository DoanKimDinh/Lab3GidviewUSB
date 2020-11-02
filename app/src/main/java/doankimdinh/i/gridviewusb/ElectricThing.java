package doankimdinh.i.gridviewusb;

public class ElectricThing {
    private String name;
    private int rate;
    private int newPrice;
    private int peopleRate;
    private int imageThing;
    private int reducePercent;

    public ElectricThing(String name, int rate, int newPrice, int peopleRate, int imageThing, int reducePercent) {
        this.name = name;
        this.rate = rate;
        this.newPrice = newPrice;
        this.peopleRate = peopleRate;
        this.imageThing = imageThing;
        this.reducePercent = reducePercent;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public int getPeopleRate() {
        return peopleRate;
    }

    public int getImageThing() {
        return imageThing;
    }

    public int getReducePercent() {
        return reducePercent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
    }

    public void setPeopleRate(int peopleRate) {
        this.peopleRate = peopleRate;
    }

    public void setImageThing(int imageThing) {
        this.imageThing = imageThing;
    }

    public void setReducePercent(int reducePercent) {
        this.reducePercent = reducePercent;
    }
}
