public class DaoFactory {


    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
//            When you create an instance of MySQLAdsDao, create an instance of your Config class to pass to the MySQLAdsDao constructor
            adsDao = new MySQLAdsDao();
//            Config config = new Config();


        }
        return adsDao;
    }


}
