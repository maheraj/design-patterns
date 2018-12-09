package factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blog);
        System.out.println(blog.pages);
        System.out.println();

        Website shopping = WebsiteFactory.getWebsite(WebsiteType.SHOPPING);
        System.out.println(shopping);
        System.out.println(shopping.pages);


    }
}
