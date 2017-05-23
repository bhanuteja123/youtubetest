package uimethods;

import java.io.IOException;

import library.CommonLibrary;
import org.testng.Assert;

public class Trending_page extends CommonLibrary {
    protected static void Open_Trending_page() throws InterruptedException, IOException {
        Web_Element_wait("xpath", Get_properties_value("Trending"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("Trending"));
    }

    protected static void Click_video_image() throws InterruptedException, IOException {
        Web_Element_wait("XpAth", Get_properties_value("Trending_Video_image"), 5);
        Element_to_be_clicked("XpAth", Get_properties_value("Trending_Video_image"));
        String text = Get_text("xpath", Get_properties_value("Home_Video_tile_name"));
        Send_value_to_Normal_properties("image_trending", text);
        String assert_word = Get_Attribue_text("xpath", Get_properties_value("play"), "aria-label");
        Assert.assertEquals(assert_word, "Pause");
        closeApplication();
    }

    protected static void Click_video_name() throws InterruptedException, IOException {
        Web_Element_wait("XpAth", Get_properties_value("Trending_Video_name"), 5);
        Element_to_be_clicked("XpAth", Get_properties_value("Trending_Video_name"));
        String text = Get_text("xpath", Get_properties_value("Home_Video_tile_name"));
        Send_value_to_Normal_properties("name_trending", text);
        String assert_word = Get_Attribue_text("xpath", Get_properties_value("play"), "aria-label");
        Assert.assertEquals(assert_word, "Pause");
        closeApplication();

    }

}
