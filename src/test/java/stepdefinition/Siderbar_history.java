package stepdefinition;

import cucumber.api.java.en.Then;
import uimethods.History_page;

public class Siderbar_history extends History_page {
	@Then("^Click on history page$")
	public void click_on_history_page() throws Throwable {
		Open_History_page();
	}

	@Then("^Verify the video user saw in home page when clicking on image$")
	public void verify_the_video_user_saw_in_home_page_when_clicking_on_image() throws Throwable {
		Verify_video("image_home");
	}

	@Then("^Verify the video user saw in home page when clicking on name$")
	public void verify_the_video_user_saw_in_home_page_when_clicking_on_name() throws Throwable {
		Verify_video("name_home");
	}

	@Then("^Verify the video user saw in trending page when clicking on image$")
	public void verify_the_video_user_saw_in_trending_page_when_clicking_on_image() throws Throwable {
		Verify_video("image_trending");
	}

	@Then("^Verify the video user saw in trending page when clicking on name$")
	public void verify_the_video_user_saw_in_trending_page_when_clicking_on_name() throws Throwable {
		Verify_video("name_trending");
	}
}
