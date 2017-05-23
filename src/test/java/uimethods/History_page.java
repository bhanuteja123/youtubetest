package uimethods;

import java.io.IOException;

import library.CommonLibrary;

public class History_page extends CommonLibrary {

    protected static void Open_History_page() throws InterruptedException, IOException {
        Web_Element_wait("xpath", Get_properties_value("History"), 10);
        Element_to_be_clicked("xpath", Get_properties_value("History"));
    }

    protected static void Verify_video(String cha) throws InterruptedException, IOException {
        Find_elements("xpath", Get_properties_value("History_page_all_video"), Get_properties_value(cha));
        closeApplication();
    }

}
