package com.xushuzhan.theonedemo.utils.ContentConverter;

import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;
import com.xushuzhan.theonedemo.model.data.bean.SerializedContentBean;

/**
 * Created by xushuzhan on 2017/12/5.
 */

public class SerialzedContenConverter {
    public static String convert(SerializedContentBean content){
        String title = "<p style=\"font-size: 25px;font-weight: bold;\">" + content.getTitle()+"</p>";
        String author = "<p style=\"font-size: 13px;\">文／"+content.getAuthor().getUser_name()+"</p>";
        return title+author+content.getContent();
    }
}
