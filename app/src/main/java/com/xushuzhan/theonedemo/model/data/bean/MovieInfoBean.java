package com.xushuzhan.theonedemo.model.data.bean;

import java.util.List;

/**
 * Created by xushuzhan on 2017/12/10.
 */

public class MovieInfoBean {

    /**
     * id : 1222
     * title : 白蚁
     * indexcover :
     * detailcover : http://image.wufazhuce.com/Fk8shf03v3Fc4807fOsMGSr5k-jm
     * video :
     * verse :
     * verse_en :
     * score : null
     * revisedscore : 0
     * review :
     * keywords : ;;;;
     * movie_id :
     * info : 导演: 朱贤哲
     编剧: 朱贤哲
     主演: 吴慷仁 / 于台烟 / 钟瑶 / 胡玮杰 / 芳婷
     类型: 剧情
     制片国家/地区: 台湾
     * officialstory : 反思人性與正義，探討單親家庭小孩的性行為偏差議題，以有戀物癖的內褲賊偷竊事件，展開以社會正義為名的一連串追尋。
     * hide_flag : 0
     * charge_edt : 责任编辑：高梦苒
     * web_url : http://m.wufazhuce.com/movie/1222
     * praisenum : 0
     * sort : 0
     * releasetime : 0000-00-00 00:00:00
     * scoretime : 0000-00-00 00:00:00
     * maketime : 2010-01-27 05:25:00
     * last_update_date : 2017-12-10 00:13:00
     * read_num : 12500
     * directors : 朱贤哲
     * editor_email : mengran@wufazhuce.com
     * related :
     * directors_id :
     * start_video :
     * media_type : 0
     * poster : http://image.wufazhuce.com/Fiuo4IWSjZrh8Pir2kGO4fvklaCF
     * photo : ["http://image.wufazhuce.com/FjDRICYEbjMd2IfOpdGXte1M967n","http://image.wufazhuce.com/FtEGFj1lxKf3y8Wg_ZwOCQpo7cOn"]
     * next_id : 965
     * previous_id : 964
     * tag_list : []
     * share_list : {"wx":{"title":"电影 | 这个恋母又偷内衣的怪物，让我看到了自己","desc":"文/固力果 正义感有时会欺骗人，事实上，正常人才是有病的。","link":"http://m.wufazhuce.com/movie/1222?channel=singlemessage","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""},"wx_timeline":{"title":"电影 | 这个恋母又偷内衣的怪物，让我看到了自己","desc":"文/固力果 正义感有时会欺骗人，事实上，正常人才是有病的。","link":"http://m.wufazhuce.com/movie/1222?channel=timeline","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""},"weibo":{"title":"ONE一个《电影 | 这个恋母又偷内衣的怪物，让我看到了自己》 文/固力果： 正义感有时会欺骗人，事实上，正常人才是有病的。 阅读全文：http://m.wufazhuce.com/movie/1222?channel=weibo 下载ONE一个APP:http://weibo.com/p/100404157874","desc":"","link":"http://m.wufazhuce.com/movie/1222?channel=weibo","imgUrl":"","audio":""},"qq":{"title":"这个恋母又偷内衣的怪物，让我看到了自己","desc":"正义感有时会欺骗人，事实上，正常人才是有病的。","link":"http://m.wufazhuce.com/movie/1222?channel=qq","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""}}
     * sharenum : 125
     * commentnum : 55
     * servertime : 1512892714
     */

    private String id;
    private String title;
    private String indexcover;
    private String detailcover;
    private String video;
    private String verse;
    private String verse_en;
    private Object score;
    private String revisedscore;
    private String review;
    private String keywords;
    private String movie_id;
    private String info;
    private String officialstory;
    private String hide_flag;
    private String charge_edt;
    private String web_url;
    private int praisenum;
    private String sort;
    private String releasetime;
    private String scoretime;
    private String maketime;
    private String last_update_date;
    private String read_num;
    private String directors;
    private String editor_email;
    private String related;
    private String directors_id;
    private String start_video;
    private String media_type;
    private String poster;
    private String next_id;
    private String previous_id;
    private ShareListBean share_list;
    private int sharenum;
    private int commentnum;
    private int servertime;
    private List<String> photo;
    private List<?> tag_list;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIndexcover() {
        return indexcover;
    }

    public void setIndexcover(String indexcover) {
        this.indexcover = indexcover;
    }

    public String getDetailcover() {
        return detailcover;
    }

    public void setDetailcover(String detailcover) {
        this.detailcover = detailcover;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVerse() {
        return verse;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }

    public String getVerse_en() {
        return verse_en;
    }

    public void setVerse_en(String verse_en) {
        this.verse_en = verse_en;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

    public String getRevisedscore() {
        return revisedscore;
    }

    public void setRevisedscore(String revisedscore) {
        this.revisedscore = revisedscore;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getOfficialstory() {
        return officialstory;
    }

    public void setOfficialstory(String officialstory) {
        this.officialstory = officialstory;
    }

    public String getHide_flag() {
        return hide_flag;
    }

    public void setHide_flag(String hide_flag) {
        this.hide_flag = hide_flag;
    }

    public String getCharge_edt() {
        return charge_edt;
    }

    public void setCharge_edt(String charge_edt) {
        this.charge_edt = charge_edt;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public int getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(int praisenum) {
        this.praisenum = praisenum;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(String releasetime) {
        this.releasetime = releasetime;
    }

    public String getScoretime() {
        return scoretime;
    }

    public void setScoretime(String scoretime) {
        this.scoretime = scoretime;
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

    public String getRead_num() {
        return read_num;
    }

    public void setRead_num(String read_num) {
        this.read_num = read_num;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getEditor_email() {
        return editor_email;
    }

    public void setEditor_email(String editor_email) {
        this.editor_email = editor_email;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    public String getDirectors_id() {
        return directors_id;
    }

    public void setDirectors_id(String directors_id) {
        this.directors_id = directors_id;
    }

    public String getStart_video() {
        return start_video;
    }

    public void setStart_video(String start_video) {
        this.start_video = start_video;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getNext_id() {
        return next_id;
    }

    public void setNext_id(String next_id) {
        this.next_id = next_id;
    }

    public String getPrevious_id() {
        return previous_id;
    }

    public void setPrevious_id(String previous_id) {
        this.previous_id = previous_id;
    }

    public ShareListBean getShare_list() {
        return share_list;
    }

    public void setShare_list(ShareListBean share_list) {
        this.share_list = share_list;
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

    public int getServertime() {
        return servertime;
    }

    public void setServertime(int servertime) {
        this.servertime = servertime;
    }

    public List<String> getPhoto() {
        return photo;
    }

    public void setPhoto(List<String> photo) {
        this.photo = photo;
    }

    public List<?> getTag_list() {
        return tag_list;
    }

    public void setTag_list(List<?> tag_list) {
        this.tag_list = tag_list;
    }

    public static class ShareListBean {
        /**
         * wx : {"title":"电影 | 这个恋母又偷内衣的怪物，让我看到了自己","desc":"文/固力果 正义感有时会欺骗人，事实上，正常人才是有病的。","link":"http://m.wufazhuce.com/movie/1222?channel=singlemessage","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""}
         * wx_timeline : {"title":"电影 | 这个恋母又偷内衣的怪物，让我看到了自己","desc":"文/固力果 正义感有时会欺骗人，事实上，正常人才是有病的。","link":"http://m.wufazhuce.com/movie/1222?channel=timeline","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""}
         * weibo : {"title":"ONE一个《电影 | 这个恋母又偷内衣的怪物，让我看到了自己》 文/固力果： 正义感有时会欺骗人，事实上，正常人才是有病的。 阅读全文：http://m.wufazhuce.com/movie/1222?channel=weibo 下载ONE一个APP:http://weibo.com/p/100404157874","desc":"","link":"http://m.wufazhuce.com/movie/1222?channel=weibo","imgUrl":"","audio":""}
         * qq : {"title":"这个恋母又偷内衣的怪物，让我看到了自己","desc":"正义感有时会欺骗人，事实上，正常人才是有病的。","link":"http://m.wufazhuce.com/movie/1222?channel=qq","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png","audio":""}
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
             * title : 电影 | 这个恋母又偷内衣的怪物，让我看到了自己
             * desc : 文/固力果 正义感有时会欺骗人，事实上，正常人才是有病的。
             * link : http://m.wufazhuce.com/movie/1222?channel=singlemessage
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
             * title : 电影 | 这个恋母又偷内衣的怪物，让我看到了自己
             * desc : 文/固力果 正义感有时会欺骗人，事实上，正常人才是有病的。
             * link : http://m.wufazhuce.com/movie/1222?channel=timeline
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
             * title : ONE一个《电影 | 这个恋母又偷内衣的怪物，让我看到了自己》 文/固力果： 正义感有时会欺骗人，事实上，正常人才是有病的。 阅读全文：http://m.wufazhuce.com/movie/1222?channel=weibo 下载ONE一个APP:http://weibo.com/p/100404157874
             * desc :
             * link : http://m.wufazhuce.com/movie/1222?channel=weibo
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
             * title : 这个恋母又偷内衣的怪物，让我看到了自己
             * desc : 正义感有时会欺骗人，事实上，正常人才是有病的。
             * link : http://m.wufazhuce.com/movie/1222?channel=qq
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
}
