package webDriverArchitechture.firefoxDriver;

import webDriverArchitechture.WebDriverAPI.WebDriver;

public class FirefoxDriver implements WebDriver {

    public FirefoxDriver(){
        System.out.println("Opening Firefox Browser");
    }

    public void get(String url){
        System.out.println("Navigating to URL in Firefox");
    }

    public String getTitle(){
        return "Getting Firefox webpage title";

    }

    public void click(){
        System.out.println("Clicking in Firefox browser");
    }

    public void close(){
        System.out.println("Closing Firefox browser");
    }

}
