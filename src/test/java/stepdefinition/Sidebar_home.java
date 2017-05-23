package stepdefinition;

import com.cucumber.listener.Reporter;
import cucumber.api.java8.En;
import uimethods.Home_page;

import java.io.IOException;

/**
 * Created by bhanu_000 on 18-05-2017.
 */
public class Sidebar_home extends Home_page implements En {
    public Sidebar_home() {
        Given("^The user is opened into youtube$", () -> {
            Browser_Launch("chrome");
        });
        Then("^the user is sign in into youtube$", () -> {
            try {
                sign_in();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Then("^Click image of the video in home page$", () -> {
            try {
                Click_video_image();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        });
        Then("^Click name of the video in home page$", () -> {
            try {
                Click_video_name();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        });
    }
}
