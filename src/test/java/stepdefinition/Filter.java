package stepdefinition;

import cucumber.api.java.en.Then;
import uimethods.Filter_method;

public class Filter extends Filter_method {
	@Then("^the user searched for video$")
	public void the_user_searched_for_video() throws Throwable {
		search_for_video();
	}

	@Then("^the user click on filters$")
	public void the_user_click_on_filters() throws Throwable {
		Click_on_Filter();
	}

	@Then("^Select the Last hour tag$")
	public void select_the_Last_hour_tag() throws Throwable {
		the_Last_hour();
	}

	@Then("^Select the By today tag$")
	public void select_the_By_today_tag() throws Throwable {
		the_today();
	}

	@Then("^Select This week tag$")
	public void select_This_week_tag() throws Throwable {
		This_week();
	}

	@Then("^Select the This month tag$")
	public void select_the_This_month_tag() throws Throwable {
		This_month();
	}

	@Then("^Select  This year tag$")
	public void select_This_year_tag() throws Throwable {
		This_year();
	}

	@Then("^Select the video tag$")
	public void select_the_video_tag() throws Throwable {
		the_video();
	}

	@Then("^Select the by Channel tag$")
	public void select_the_by_Channel_tag() throws Throwable {
		by_Channel();
	}

	@Then("^Select by Playlist tag$")
	public void select_by_Playlist_tag() throws Throwable {
		by_Playlist();
	}

	@Then("^Select by Film tag$")
	public void select_by_Film_tag() throws Throwable {
		by_movie();
	}

	@Then("^Select by Programme tag$")
	public void select_by_Programme_tag() throws Throwable {
		by_show();
	}

	@Then("^Select by short tag$")
	public void select_by_short_tag() throws Throwable {
		by_short();

	}

	@Then("^Select by long tag$")
	public void select_by_long_tag() throws Throwable {
		by_long();
	}

	@Then("^Select the <4K> tag$")
	public void select_the_K_tag() throws Throwable {
		by_4k();
	}

	@Then("^Select by HD tag$")
	public void select_by_HD_tag() throws Throwable {
		by_HD();
	}

	@Then("^Select by Subtitles/CC tag$")
	public void select_by_Subtitles_CC_tag() throws Throwable {
		by_Subtitles();
	}

	@Then("^Select by Creative Commons tag$")
	public void select_by_Creative_Commons_tag() throws Throwable {
		by_Creative_commons();
	}

	@Then("^Select by <3D> tag$")
	public void select_by_D_tag() throws Throwable {
		by_3D();
	}

	@Then("^Select by Live tag$")
	public void select_by_Live_tag() throws Throwable {
		by_Live();
	}

	@Then("^Select by Purchased tag$")
	public void select_by_Purchased_tag() throws Throwable {
		by_Purchased();
	}

	@Then("^Select by 360 tag$")
	public void select_by_tag() throws Throwable {
		by_360();
	}

	@Then("^Select the Relevance tag$")
	public void select_the_Relevance_tag() throws Throwable {
		by_Relevance();
	}

	@Then("^Select the by Upload date tag$")
	public void select_the_by_Upload_date_tag() throws Throwable {
		by_Upload_date();
	}

	@Then("^Select by View count tag$")
	public void select_by_View_count_tag() throws Throwable {
		by_View_count();
	}

	@Then("^Select by Rating tag$")
	public void select_by_Rating_tag() throws Throwable {
		by_Rating();
	}
}
