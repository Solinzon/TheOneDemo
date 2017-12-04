package com.xushuzhan.theonedemo.utils.ContentConverter;

import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class OneStoryConverter {
    public static String convert(ReadingBean content){


        return content.getHp_content();
    }
}
