package factory;


public class WebsiteFactory {
    public static Website getWebsite(WebsiteType type) {
        switch (type) {
            case BLOG:
                return new Blog();
            case SHOPPING:
                return new Shopping();
            default:
                return null;
        }
    }
}
