package builder;

/*
* moderate way - Telescoping constructor
* Hard to use if we want something this is not already defined as constructor
* immutable
* */

public class LunchOrderV2 {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderV2() {
    }
    public LunchOrderV2(String bread) {
        this.bread = bread;
    }

    public LunchOrderV2(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderV2(String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderV2(String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
