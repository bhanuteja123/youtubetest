package stepdefinition;

import cucumber.api.java.en.Then;
import uimethods.Trending_page;

public class Sidebar_trending extends Trending_page {
	@Then("^the user opened the trending page$")
	public void the_user_opened_the_trending_page() throws Throwable {
		Open_Trending_page();
	}

	@Then("^Click image of the video in trending page$")
	public void click_image_of_the_video_in_trending_page() throws Throwable {
		Click_video_image();
	}

	@Then("^Click name of the video in trending page$")
	public void click_name_of_the_video_in_trending_page() throws Throwable {
		Click_video_name();
	}
}
