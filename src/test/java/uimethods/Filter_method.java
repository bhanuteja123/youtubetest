package uimethods;

import java.io.IOException;

import library.CommonLibrary;
import org.testng.Assert;

public class Filter_method extends CommonLibrary {
    protected static void search_for_video() throws InterruptedException, IOException {
        Element_to_be_Sent("xpath", Get_properties_value("Video_search"), "bahubali 2");
        Web_Element_wait("xpath", Get_properties_value("Video_search_button"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("Video_search_button"));

    }

    protected static void Click_on_Filter() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("Filter_button"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("Filter_button"));
    }

    protected static void the_Last_hour() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("last_hour"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("last_hour"));
        closeApplication();
    }

    protected static void the_today() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("today"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("today"));
        closeApplication();
    }

    protected static void This_month() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("this_month"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("this_month"));
        closeApplication();
    }

    protected static void This_week() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("this_week"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("this_week"));
        closeApplication();
    }

    protected static void This_year() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("this_year"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("this_year"));
        closeApplication();
    }

    protected static void the_video() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("video"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("video"));
        closeApplication();
    }

    protected static void by_Channel() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("channel"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("channel"));
        String Assert_word = Get_text("xpath", Get_properties_value("Filter_channel_assert"));
        Assert.assertEquals(Assert_word, "Channel");
        closeApplication();
    }

    protected static void by_Playlist() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("playlist"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("playlist"));
        closeApplication();
    }

    protected static void by_movie() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("movie"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("movie"));
        closeApplication();
    }

    protected static void by_show() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("show"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("show"));
        String Assert_word = Get_text("xpath", Get_properties_value("Filter_show_assert"));
        Assert.assertEquals(Assert_word, "Show");
        closeApplication();
    }

    protected static void by_short() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("short"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("short"));
        closeApplication();
    }

    protected static void by_long() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("long"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("long"));
        closeApplication();
    }

    protected static void by_4k() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("F_4K"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("F_4K"));
        String Assert_word = Get_text("xpath", Get_properties_value("Filter_4K_assert"));
        Assert.assertEquals(Assert_word, "4K");
        closeApplication();
    }

    protected static void by_HD() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("HD"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("HD"));
        closeApplication();
    }

    protected static void by_Subtitles() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("Subtitles"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("Subtitles"));
        String Assert_word = Get_text("xpath", Get_properties_value("Filter_cc_assert"));
        Assert.assertEquals(Assert_word, "CC");
        closeApplication();
    }

    protected static void by_Creative_commons() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("creative_commons"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("creative_commons"));
        closeApplication();
    }

    protected static void by_3D() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("3D"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("3D"));
        closeApplication();
    }

    protected static void by_Live() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("live"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("live"));
        String Assert_word = Get_text("xpath", Get_properties_value("Filter_live_assert"));
        Assert.assertEquals(Assert_word, "Live");
        closeApplication();
    }

    protected static void by_Purchased() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("purchased"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("purchased"));
        closeApplication();
    }

    protected static void by_360() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("360"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("360"));
        String Assert_word = Get_text("xpath", Get_properties_value("Filter_360_assert"));
        Assert.assertEquals(Assert_word, "360°");
        closeApplication();
    }

    protected static void by_Relevance() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("Relevance"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("Relevance"));
        closeApplication();
    }

    protected static void by_Upload_date() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("Upload_date"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("Upload_date"));
        closeApplication();
    }

    protected static void by_Rating() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("rating"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("rating"));
        closeApplication();
    }

    protected static void by_View_count() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("view_count"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("view_count"));

        closeApplication();
    }
}
