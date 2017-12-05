package com.xushuzhan.theonedemo.utils.ContentConverter;

import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class OneStoryConverter {
    public static String convert(ReadingBean content){
        String title = "<p style=\"font-size: 28px;font-weight: bold;\">" + content.getHp_title()+"</p>";
        String author = "<p style=\"font-size: 13px;\">文／"+content.getHp_author()+"</p>";
        return title+author+content.getHp_content();
    }
}
