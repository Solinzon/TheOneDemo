package com.xushuzhan.theonedemo.model.data.bean;

import java.util.List;

/**
 * Created by xushuzhan on 2017/12/5.
 */

public class SerializedContentBean {

    /**
     * id : 485
     * serial_id : 52
     * number : 10
     * title : 黑黑的故乡·后山怪物（4）
     * excerpt : 你要试着为别人全力付出一次，这样，你就知道什么是朋友。
     * content :
     <p><strong>第四章 酸角粉、地下河与马达</strong></p>
     <p>这股味道，让我想起了自己也是在马通那个喜欢吃酸角粉的年纪，因为酸坏了肚子又不敢让爸妈看见，偷偷跑去野外草地拉稀的日子。</p>
     <p>“马通。”我突然有了主意：“酸角粉在你裤兜里么，撒出来。”</p>
     <p>“干吗？”马通充满怀疑的回答透过重重叠叠塌落的肠壁传回我耳朵。</p>
     <p>“不想死就酸它，快。”</p>
     <p>都是大肠，灼了热的都该溃疡，粘了酸的都该反胃。到了这个时刻，我只能拜托这个怪物像我期盼的一样，有一条敏感的肠子。</p>
     <p>半天没有收到马通的回答，我以为他要么把我当傻逼，要么临死了还把酸粉当宝贝把自己弄成傻逼，准备开骂。只听见一阵虹吸声骤起，周遭的肠壁陡然收缩，堵住了我的鼻孔。好像被忽然装进了真空袋里一般。</p>
     <p>慌乱间都来不及深吸一口气往肺里的存储一点活路，我感觉自己的血槽在迅速下降，过不了几秒就要玩完。我手中马唱的手也变得僵直，带着难以察觉却令人不安的颤抖。不知道为什么，我下意识地握紧了她，等待着最后一刻的到来。</p>
     * charge_edt : 责任编辑：阿芙拉
     * read_num : 3600
     * maketime : 2017-12-05 06:00:00
     * last_update_date : 2017-12-03 11:33:12
     * hide_flag : 0
     * audio :
     * web_url : http://m.wufazhuce.com/serial/485
     * input_name : 10035
     * last_update_name : Afra
     * anchor :
     * editor_email : afra@wufazhuce.com
     * top_media_type : 0
     * top_media_file :
     * top_media_image :
     * start_video :
     * copyright :
     * audio_duration : 0
     * cover : 0
     * author : {"user_id":"6356695","user_name":"大给","desc":"《心理罪》《黑洞故事》《有爱我们床上谈》。微信公众号：大给坏趣味。","wb_name":"@坏趣味大给","is_settled":"0","settled_type":"0","summary":"写点字、编点剧。","fans_total":"2582","web_url":"http://image.wufazhuce.com/Fhh9KilxETeebKzlOhF1AQfs0p7j"}
     * lastid : 482
     * nextid : 0
     * author_list : [{"user_id":"6356695","user_name":"大给","desc":"《心理罪》《黑洞故事》《有爱我们床上谈》。微信公众号：大给坏趣味。","wb_name":"@坏趣味大给","is_settled":"0","settled_type":"0","summary":"写点字、编点剧。","fans_total":"2582","web_url":"http://image.wufazhuce.com/Fhh9KilxETeebKzlOhF1AQfs0p7j"}]
     * tag_list : []
     * share_list : {"wx":{"title":"连载 | 黑黑的故乡·后山怪物（4）","desc":"文/大给 你要试着为别人全力付出一次，这样，你就知道什么是朋友。","link":"http://m.wufazhuce.com/serial/485?channel=singlemessage","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""},"wx_timeline":{"title":"连载 | 黑黑的故乡·后山怪物（4）","desc":"文/大给 你要试着为别人全力付出一次，这样，你就知道什么是朋友。","link":"http://m.wufazhuce.com/serial/485?channel=timeline","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""},"weibo":{"title":"ONE一个《连载 | 黑黑的故乡·后山怪物（4）》 文/大给： 你要试着为别人全力付出一次，这样，你就知道什么是朋友。 阅读全文：http://m.wufazhuce.com/serial/485?channel=weibo 下载ONE一个APP:http://weibo.com/p/100404157874","desc":"","link":"http://m.wufazhuce.com/serial/485?channel=weibo","imgUrl":"","audio":""},"qq":{"title":"黑黑的故乡·后山怪物（4）","desc":"你要试着为别人全力付出一次，这样，你就知道什么是朋友。","link":"http://m.wufazhuce.com/serial/485?channel=qq","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""}}
     * praisenum : 180
     * sharenum : 12
     * commentnum : 34
     */

    private String id;
    private String serial_id;
    private String number;
    private String title;
    private String excerpt;
    private String content;
    private String charge_edt;
    private String read_num;
    private String maketime;
    private String last_update_date;
    private String hide_flag;
    private String audio;
    private String web_url;
    private String input_name;
    private String last_update_name;
    private String anchor;
    private String editor_email;
    private String top_media_type;
    private String top_media_file;
    private String top_media_image;
    private String start_video;
    private String copyright;
    private String audio_duration;
    private String cover;
    private AuthorBean author;
    private String lastid;
    private int nextid;
    private ShareListBean share_list;
    private int praisenum;
    private int sharenum;
    private int commentnum;
    private List<AuthorListBean> author_list;
    private List<?> tag_list;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSerial_id() {
        return serial_id;
    }

    public void setSerial_id(String serial_id) {
        this.serial_id = serial_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCharge_edt() {
        return charge_edt;
    }

    public void setCharge_edt(String charge_edt) {
        this.charge_edt = charge_edt;
    }

    public String getRead_num() {
        return read_num;
    }

    public void setRead_num(String read_num) {
        this.read_num = read_num;
    }

    public String getMaketime() {
        return maketime;
    }

    public void setMaketime(String maketime) {
        this.maketime = maketime;
    }

    public String getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(String last_update_date) {
        this.last_update_date = last_update_date;
    }

    public String getHide_flag() {
        return hide_flag;
    }

    public void setHide_flag(String hide_flag) {
        this.hide_flag = hide_flag;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public String getInput_name() {
        return input_name;
    }

    public void setInput_name(String input_name) {
        this.input_name = input_name;
    }

    public String getLast_update_name() {
        return last_update_name;
    }

    public void setLast_update_name(String last_update_name) {
        this.last_update_name = last_update_name;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public String getEditor_email() {
        return editor_email;
    }

    public void setEditor_email(String editor_email) {
        this.editor_email = editor_email;
    }

    public String getTop_media_type() {
        return top_media_type;
    }

    public void setTop_media_type(String top_media_type) {
        this.top_media_type = top_media_type;
    }

    public String getTop_media_file() {
        return top_media_file;
    }

    public void setTop_media_file(String top_media_file) {
        this.top_media_file = top_media_file;
    }

    public String getTop_media_image() {
        return top_media_image;
    }

    public void setTop_media_image(String top_media_image) {
        this.top_media_image = top_media_image;
    }

    public String getStart_video() {
        return start_video;
    }

    public void setStart_video(String start_video) {
        this.start_video = start_video;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getAudio_duration() {
        return audio_duration;
    }

    public void setAudio_duration(String audio_duration) {
        this.audio_duration = audio_duration;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public AuthorBean getAuthor() {
        return author;
    }

    public void setAuthor(AuthorBean author) {
        this.author = author;
    }

    public String getLastid() {
        return lastid;
    }

    public void setLastid(String lastid) {
        this.lastid = lastid;
    }

    public int getNextid() {
        return nextid;
    }

    public void setNextid(int nextid) {
        this.nextid = nextid;
    }

    public ShareListBean getShare_list() {
        return share_list;
    }

    public void setShare_list(ShareListBean share_list) {
        this.share_list = share_list;
    }

    public int getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(int praisenum) {
        this.praisenum = praisenum;
    }

    public int getSharenum() {
        return sharenum;
    }

    public void setSharenum(int sharenum) {
        this.sharenum = sharenum;
    }

    public int getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(int commentnum) {
        this.commentnum = commentnum;
    }

    public List<AuthorListBean> getAuthor_list() {
        return author_list;
    }

    public void setAuthor_list(List<AuthorListBean> author_list) {
        this.author_list = author_list;
    }

    public List<?> getTag_list() {
        return tag_list;
    }

    public void setTag_list(List<?> tag_list) {
        this.tag_list = tag_list;
    }

    public static class AuthorBean {
        /**
         * user_id : 6356695
         * user_name : 大给
         * desc : 《心理罪》《黑洞故事》《有爱我们床上谈》。微信公众号：大给坏趣味。
         * wb_name : @坏趣味大给
         * is_settled : 0
         * settled_type : 0
         * summary : 写点字、编点剧。
         * fans_total : 2582
         * web_url : http://image.wufazhuce.com/Fhh9KilxETeebKzlOhF1AQfs0p7j
         */

        private String user_id;
        private String user_name;
        private String desc;
        private String wb_name;
        private String is_settled;
        private String settled_type;
        private String summary;
        private String fans_total;
        private String web_url;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getWb_name() {
            return wb_name;
        }

        public void setWb_name(String wb_name) {
            this.wb_name = wb_name;
        }

        public String getIs_settled() {
            return is_settled;
        }

        public void setIs_settled(String is_settled) {
            this.is_settled = is_settled;
        }

        public String getSettled_type() {
            return settled_type;
        }

        public void setSettled_type(String settled_type) {
            this.settled_type = settled_type;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getFans_total() {
            return fans_total;
        }

        public void setFans_total(String fans_total) {
            this.fans_total = fans_total;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }
    }

    public static class ShareListBean {
        /**
         * wx : {"title":"连载 | 黑黑的故乡·后山怪物（4）","desc":"文/大给 你要试着为别人全力付出一次，这样，你就知道什么是朋友。","link":"http://m.wufazhuce.com/serial/485?channel=singlemessage","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""}
         * wx_timeline : {"title":"连载 | 黑黑的故乡·后山怪物（4）","desc":"文/大给 你要试着为别人全力付出一次，这样，你就知道什么是朋友。","link":"http://m.wufazhuce.com/serial/485?channel=timeline","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""}
         * weibo : {"title":"ONE一个《连载 | 黑黑的故乡·后山怪物（4）》 文/大给： 你要试着为别人全力付出一次，这样，你就知道什么是朋友。 阅读全文：http://m.wufazhuce.com/serial/485?channel=weibo 下载ONE一个APP:http://weibo.com/p/100404157874","desc":"","link":"http://m.wufazhuce.com/serial/485?channel=weibo","imgUrl":"","audio":""}
         * qq : {"title":"黑黑的故乡·后山怪物（4）","desc":"你要试着为别人全力付出一次，这样，你就知道什么是朋友。","link":"http://m.wufazhuce.com/serial/485?channel=qq","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""}
         */

        private WxBean wx;
        private WxTimelineBean wx_timeline;
        private WeiboBean weibo;
        private QqBean qq;

        public WxBean getWx() {
            return wx;
        }

        public void setWx(WxBean wx) {
            this.wx = wx;
        }

        public WxTimelineBean getWx_timeline() {
            return wx_timeline;
        }

        public void setWx_timeline(WxTimelineBean wx_timeline) {
            this.wx_timeline = wx_timeline;
        }

        public WeiboBean getWeibo() {
            return weibo;
        }

        public void setWeibo(WeiboBean weibo) {
            this.weibo = weibo;
        }

        public QqBean getQq() {
            return qq;
        }

        public void setQq(QqBean qq) {
            this.qq = qq;
        }

        public static class WxBean {
            /**
             * title : 连载 | 黑黑的故乡·后山怪物（4）
             * desc : 文/大给 你要试着为别人全力付出一次，这样，你就知道什么是朋友。
             * link : http://m.wufazhuce.com/serial/485?channel=singlemessage
             * imgUrl : http://image.wufazhuce.com/ONE_logo_120_square.png
             * audio :
             */

            private String title;
            private String desc;
            private String link;
            private String imgUrl;
            private String audio;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public String getAudio() {
                return audio;
            }

            public void setAudio(String audio) {
                this.audio = audio;
            }
        }

        public static class WxTimelineBean {
            /**
             * title : 连载 | 黑黑的故乡·后山怪物（4）
             * desc : 文/大给 你要试着为别人全力付出一次，这样，你就知道什么是朋友。
             * link : http://m.wufazhuce.com/serial/485?channel=timeline
             * imgUrl : http://image.wufazhuce.com/ONE_logo_120_square.png
             * audio :
             */

            private String title;
            private String desc;
            private String link;
            private String imgUrl;
            private String audio;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public String getAudio() {
                return audio;
            }

            public void setAudio(String audio) {
                this.audio = audio;
            }
        }

        public static class WeiboBean {
            /**
             * title : ONE一个《连载 | 黑黑的故乡·后山怪物（4）》 文/大给： 你要试着为别人全力付出一次，这样，你就知道什么是朋友。 阅读全文：http://m.wufazhuce.com/serial/485?channel=weibo 下载ONE一个APP:http://weibo.com/p/100404157874
             * desc :
             * link : http://m.wufazhuce.com/serial/485?channel=weibo
             * imgUrl :
             * audio :
             */

            private String title;
            private String desc;
            private String link;
            private String imgUrl;
            private String audio;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public String getAudio() {
                return audio;
            }

            public void setAudio(String audio) {
                this.audio = audio;
            }
        }

        public static class QqBean {
            /**
             * title : 黑黑的故乡·后山怪物（4）
             * desc : 你要试着为别人全力付出一次，这样，你就知道什么是朋友。
             * link : http://m.wufazhuce.com/serial/485?channel=qq
             * imgUrl : http://image.wufazhuce.com/ONE_logo_120_square.png
             * audio :
             */

            private String title;
            private String desc;
            private String link;
            private String imgUrl;
            private String audio;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public String getAudio() {
                return audio;
            }

            public void setAudio(String audio) {
                this.audio = audio;
            }
        }
    }

    public static class AuthorListBean {
        /**
         * user_id : 6356695
         * user_name : 大给
         * desc : 《心理罪》《黑洞故事》《有爱我们床上谈》。微信公众号：大给坏趣味。
         * wb_name : @坏趣味大给
         * is_settled : 0
         * settled_type : 0
         * summary : 写点字、编点剧。
         * fans_total : 2582
         * web_url : http://image.wufazhuce.com/Fhh9KilxETeebKzlOhF1AQfs0p7j
         */

        private String user_id;
        private String user_name;
        private String desc;
        private String wb_name;
        private String is_settled;
        private String settled_type;
        private String summary;
        private String fans_total;
        private String web_url;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getWb_name() {
            return wb_name;
        }

        public void setWb_name(String wb_name) {
            this.wb_name = wb_name;
        }

        public String getIs_settled() {
            return is_settled;
        }

        public void setIs_settled(String is_settled) {
            this.is_settled = is_settled;
        }

        public String getSettled_type() {
            return settled_type;
        }

        public void setSettled_type(String settled_type) {
            this.settled_type = settled_type;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getFans_total() {
            return fans_total;
        }

        public void setFans_total(String fans_total) {
            this.fans_total = fans_total;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }
    }
}
