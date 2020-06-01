package webDriverArchitechture.ieDriver;

import webDriverArchitechture.WebDriverAPI.WebDriver;

public class IEDriver implements WebDriver {

    public IEDriver(){
        System.out.println("Opening Internet Explorer Browser");
    }

    public void get(String url){
        System.out.println("Navigating to URL in Internet Explorer");
    }

    public String getTitle(){
        return "Getting Internet Explorer webpage title";
    }

    public void click(){
        System.out.println("Clicking in Internet Explorer browser");
    }

    public void close(){
        System.out.println("Closing Internet Explorer browser");
    }
}
