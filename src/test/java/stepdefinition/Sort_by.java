package stepdefinition;

import cucumber.api.java.en.Then;
import uimethods.Sort_method;

public class Sort_by extends Sort_method {
	@Then("^the user click any video$")
	public void the_user_click_any_video() throws Throwable {
		click_any_video();

	}

	@Then("^the user scroll down to comments$")
	public void the_user_scroll_down_to_comments() throws Throwable {
		scroll_down_to_comments();
	}

	@Then("^Select the Top Comments tag$")
	public void select_the_Top_Comments_tag() throws Throwable {
		Top_Comments();
	}

	@Then("^Select by  Newest First tag$")
	public void select_by_Newest_First_tag() throws Throwable {
		Newest_First();
	}
}
