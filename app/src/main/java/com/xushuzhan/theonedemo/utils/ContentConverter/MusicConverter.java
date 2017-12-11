package com.xushuzhan.theonedemo.utils.ContentConverter;

import com.xushuzhan.theonedemo.model.data.bean.MusicBean;
import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;

/**
 * Created by xushuzhan on 2017/12/10.
 */

public class MusicConverter {
    public static String convert(MusicBean content){

        String pic = "<div style=\"position: relative; \">\n" +
                "\n" +
                "<img src=\""+content.getCover()+"\" style=\"width: 130px;position: absolute;\n" +
                "    top: 50%;\n" +
                "    left: 50%;\n" +
                "    margin-left: -65px;\n" +
                "    margin-top: -65px;\n" +
                "    z-index: 1;\" >\n" +
                "\n" +
                " <img src=\""+content.getCover()+"\" style=\" \n" +
                "    height: 230px;\n" +
                "    display: block;\n" +
                "    width: -webkit-fill-available;\n" +
                "     -webkit-filter: blur(10px);\n" +
                "       -moz-filter: blur(10px);\n" +
                "        -ms-filter: blur(10px);    \n" +
                "            filter: blur(10px);  \">\n" +
                " </div>";
        String title = "<p style=\"font-size: 28px;font-weight: bold;\">" + content.getStory_title()+"</p>";
        String author = "<p style=\"font-size: 13px;\">文／"+content.getStory_author().getUser_name()+"</p>";
        return pic+title+author+content.getStory();
    }
}
