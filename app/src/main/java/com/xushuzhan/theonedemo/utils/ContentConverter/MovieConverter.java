package com.xushuzhan.theonedemo.utils.ContentConverter;

import com.xushuzhan.theonedemo.model.data.bean.MovieBean;
import com.xushuzhan.theonedemo.model.data.bean.MovieDetailBean;
import com.xushuzhan.theonedemo.model.data.bean.MovieInfoBean;

/**
 * Created by xushuzhan on 2017/12/10.
 */

public class MovieConverter {
    public static String convert(MovieBean content){
        String css = "<style type=\"text/css\">\n" +
                "\t.fr-fil{\n" +
                "\t\twidth: -webkit-fill-available;\n" +
                "\t}\n" +
                "\n" +
                "</style>";
        String pic = "<div><img src=\""+content.getPicUrl()+"\" style=\"\n" +
                "    display: block;\n" +
                "    width: -webkit-fill-available;\"></div>";
        String title = "<p style=\"font-size: 28px;font-weight: bold;\">" + content.getTitle()+"</p>";
        String author = "<p style=\"font-size: 13px;\">文／"+content.getAuthor()+"</p>";

      return css+pic+title+author+content.getContent();
    }
}
