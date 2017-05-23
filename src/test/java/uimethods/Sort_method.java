package uimethods;

import java.io.IOException;

import library.CommonLibrary;

public class Sort_method extends CommonLibrary {
    protected static void click_any_video() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("Home_Video_image"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("Home_Video_image"));
    }

    protected static void scroll_down_to_comments() throws IOException {
        Scroll_to_element(Get_properties_value("Scroll1"));
        Scroll_to_element(Get_properties_value("Scroll2"));
    }

    protected static void Top_Comments() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("Selection_button"), 10);
        Element_to_be_clicked("xpath", Get_properties_value("Selection_button"));
        Get_text("xpath", Get_properties_value("Top_comments"));
        Web_Element_wait("xpath", Get_properties_value("Top_comments"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("Top_comments"));
        closeApplication();
    }

    protected static void Newest_First() throws IOException, InterruptedException {
        Web_Element_wait("xpath", Get_properties_value("Selection_button"), 10);
        Element_to_be_clicked("xpath", Get_properties_value("Selection_button"));
        Web_Element_wait("xpath", Get_properties_value("Newest_first"), 5);
        Element_to_be_clicked("xpath", Get_properties_value("Newest_first"));
        closeApplication();
    }
}
