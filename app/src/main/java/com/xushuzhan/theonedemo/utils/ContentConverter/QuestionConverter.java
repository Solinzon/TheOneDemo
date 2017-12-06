package com.xushuzhan.theonedemo.utils.ContentConverter;

import com.xushuzhan.theonedemo.model.data.bean.QuestionBean;

/**
 * Created by xushuzhan on 2017/12/6.
 */

public class QuestionConverter {
    public static String convert(QuestionBean content){
        String title = "<p style=\"font-size: 26px;font-weight: bold;\">" + content.getQuestion_title()+"</p>";
        String asker = "<p style=\"font-size: 13px;\">"+content.getAsker().getUser_name()+"问</p> <p>---------------</p>";
        String answer = "<p style=\"font-size: 13px;\">"+content.getAnswerer().getUser_name()+"答:</p>";
        return title+asker+answer+content.getAnswer_content();
    }
}
