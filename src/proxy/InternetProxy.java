package proxy;

import java.util.List;

public class InternetProxy implements Internet{
    private RealInternet realInternet = new RealInternet();
    private static final List<String> blockedSites = List.of("badwebsite.com");

    public void connectTo(String site){
        if (blockedSites.contains(site)){
            System.out.println("Access denied to " + site);
        } else{
            realInternet.connectTo(site);
        }
    }
}
