package com.xushuzhan.theonedemo.utils.ContentConverter;

import com.xushuzhan.theonedemo.model.data.bean.MusicBean;
import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;

/**
 * Created by xushuzhan on 2017/12/10.
 */

public class MusicConverter {
    public static String convert(MusicBean content){

        String pic = "<div style=\"style=\"position: relative; width: 200px; height: 200px;\"\">\n" +
                "<img src=\""+content.getCover()+"\" style=\"width: 130px;position: absolute; top: 50%; left: 50%; margin-left: -50px; margin-top: -50px;z-index: 1;\" >\n" +
                " <img src=\""+content.getCover()+"\" style=\"width: 130px;width: -webkit-fill-available;\n" +
                "    height: -webkit-fill-available;-webkit-filter: blur(15px);\n" +
                "     -moz-filter: blur(15px);\n" +
                "     -o-filter: blur(15px);\n" +
                "     -ms-filter: blur(15px);\n" +
                "     filter: blur(15px); \">\n" +
                " </div>";
        String title = "<p style=\"font-size: 28px;font-weight: bold;\">" + content.getStory_title()+"</p>";
        String author = "<p style=\"font-size: 13px;\">文／"+content.getStory_author().getUser_name()+"</p>";
        return pic+title+author+content.getStory();
    }
}
