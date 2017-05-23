package uimethods;

import java.io.IOException;

import library.CommonLibrary;
import org.testng.Assert;

public class Home_page extends CommonLibrary {
    protected static void Click_video_image() throws InterruptedException, IOException {
        Web_Element_wait("xpath", Get_properties_value("Home_Video_image"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("Home_Video_image"));
        String text = Get_text("xpath", Get_properties_value("Home_Video_image_text"));
        Send_value_to_Normal_properties("image_home", text);
        String assert_word;
        assert_word = Get_Attribue_text("xpath", Get_properties_value("play"), "aria-label");
        Assert.assertEquals(assert_word, "Pause");
        closeApplication();
    }

    protected static void Click_video_name() throws InterruptedException, IOException {
        Web_Element_wait("Xpath", Get_properties_value("Home_Video_name"), 5);
        Element_to_be_clicked("Xpath", Get_properties_value("Home_Video_name"));
        String text = Get_text("xpath", Get_properties_value("Home_Video_name_text"));
        Send_value_to_Normal_properties("name_home", text);
        String assert_word;
        assert_word = Get_Attribue_text("xpath", Get_properties_value("play"), "aria-label");
        Assert.assertEquals(assert_word, "Pause");
        closeApplication();
    }
}
