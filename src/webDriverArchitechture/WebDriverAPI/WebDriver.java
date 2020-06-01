package webDriverArchitechture.WebDriverAPI;

public interface WebDriver {

    void get(String url);

    public String getTitle();

    public void click();

    public void close();
}
