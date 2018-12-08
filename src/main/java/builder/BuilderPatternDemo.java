package builder;


public class BuilderPatternDemo {
    public static void main(String[] args) {

        LunchOrderV1 orderV1 = new LunchOrderV1();

        orderV1.setBread("Wheat");
        orderV1.setCondiments("Lettuce");
        orderV1.setDressing("Mustard");
        orderV1.setMeat("Ham");

        System.out.println(orderV1.getBread());
        System.out.println(orderV1.getCondiments());
        System.out.println(orderV1.getDressing());
        System.out.println(orderV1.getMeat());
        System.out.println();


        LunchOrderV2 orderV2 = new LunchOrderV2("Wheat", "Lettuce", "Mustard", "Ham");

        System.out.println(orderV2.getBread());
        System.out.println(orderV2.getCondiments());
        System.out.println(orderV2.getDressing());
        System.out.println(orderV2.getMeat());
        System.out.println();

        LunchOrderFinal.Builder builder = new LunchOrderFinal.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");
        LunchOrderFinal order = builder.build();

        System.out.println(order.getBread());
        System.out.println(order.getCondiments());
        System.out.println(order.getDressing());
        System.out.println(order.getMeat());

    }
}
