package webDriverArchitechture.chromeDriver;

import webDriverArchitechture.WebDriverAPI.WebDriver;

public class ChromeDriver implements WebDriver {

    public ChromeDriver(){
        System.out.println("Opening Chrome Browser");

    }

    public void get(String url){
        System.out.println("Navigating to URL in Chrome");
    }

    public String getTitle(){
        return "Getting Chrome webpage title";
    }

    @Override
    public void click() {
        System.out.println("Clicking in Chrome browser");
    }

    public void close(){
        System.out.println("Closing Chrome browser");
    }
}
