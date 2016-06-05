package com.ctakesoft.lwwssample.model;

import java.util.List;

public class Forecast {
    @SuppressWarnings("unused")
    private static final String TAG = Forecast.class.getSimpleName();
    @SuppressWarnings("unused")
    private final Forecast self = this;

    /**
     * pinpointLocations : [{"link":"http://weather.livedoor.com/area/forecast/1310100","name":"千代田区"},{"link":"http://weather.livedoor.com/area/forecast/1310200","name":"中央区"},{"link":"http://weather.livedoor.com/area/forecast/1310300","name":"港区"},{"link":"http://weather.livedoor.com/area/forecast/1310400","name":"新宿区"},{"link":"http://weather.livedoor.com/area/forecast/1310500","name":"文京区"},{"link":"http://weather.livedoor.com/area/forecast/1310600","name":"台東区"},{"link":"http://weather.livedoor.com/area/forecast/1310700","name":"墨田区"},{"link":"http://weather.livedoor.com/area/forecast/1310800","name":"江東区"},{"link":"http://weather.livedoor.com/area/forecast/1310900","name":"品川区"},{"link":"http://weather.livedoor.com/area/forecast/1311000","name":"目黒区"},{"link":"http://weather.livedoor.com/area/forecast/1311100","name":"大田区"},{"link":"http://weather.livedoor.com/area/forecast/1311200","name":"世田谷区"},{"link":"http://weather.livedoor.com/area/forecast/1311300","name":"渋谷区"},{"link":"http://weather.livedoor.com/area/forecast/1311400","name":"中野区"},{"link":"http://weather.livedoor.com/area/forecast/1311500","name":"杉並区"},{"link":"http://weather.livedoor.com/area/forecast/1311600","name":"豊島区"},{"link":"http://weather.livedoor.com/area/forecast/1311700","name":"北区"},{"link":"http://weather.livedoor.com/area/forecast/1311800","name":"荒川区"},{"link":"http://weather.livedoor.com/area/forecast/1311900","name":"板橋区"},{"link":"http://weather.livedoor.com/area/forecast/1312000","name":"練馬区"},{"link":"http://weather.livedoor.com/area/forecast/1312100","name":"足立区"},{"link":"http://weather.livedoor.com/area/forecast/1312200","name":"葛飾区"},{"link":"http://weather.livedoor.com/area/forecast/1312300","name":"江戸川区"},{"link":"http://weather.livedoor.com/area/forecast/1320100","name":"八王子市"},{"link":"http://weather.livedoor.com/area/forecast/1320200","name":"立川市"},{"link":"http://weather.livedoor.com/area/forecast/1320300","name":"武蔵野市"},{"link":"http://weather.livedoor.com/area/forecast/1320400","name":"三鷹市"},{"link":"http://weather.livedoor.com/area/forecast/1320500","name":"青梅市"},{"link":"http://weather.livedoor.com/area/forecast/1320600","name":"府中市"},{"link":"http://weather.livedoor.com/area/forecast/1320700","name":"昭島市"},{"link":"http://weather.livedoor.com/area/forecast/1320800","name":"調布市"},{"link":"http://weather.livedoor.com/area/forecast/1320900","name":"町田市"},{"link":"http://weather.livedoor.com/area/forecast/1321000","name":"小金井市"},{"link":"http://weather.livedoor.com/area/forecast/1321100","name":"小平市"},{"link":"http://weather.livedoor.com/area/forecast/1321200","name":"日野市"},{"link":"http://weather.livedoor.com/area/forecast/1321300","name":"東村山市"},{"link":"http://weather.livedoor.com/area/forecast/1321400","name":"国分寺市"},{"link":"http://weather.livedoor.com/area/forecast/1321500","name":"国立市"},{"link":"http://weather.livedoor.com/area/forecast/1321800","name":"福生市"},{"link":"http://weather.livedoor.com/area/forecast/1321900","name":"狛江市"},{"link":"http://weather.livedoor.com/area/forecast/1322000","name":"東大和市"},{"link":"http://weather.livedoor.com/area/forecast/1322100","name":"清瀬市"},{"link":"http://weather.livedoor.com/area/forecast/1322200","name":"東久留米市"},{"link":"http://weather.livedoor.com/area/forecast/1322300","name":"武蔵村山市"},{"link":"http://weather.livedoor.com/area/forecast/1322400","name":"多摩市"},{"link":"http://weather.livedoor.com/area/forecast/1322500","name":"稲城市"},{"link":"http://weather.livedoor.com/area/forecast/1322700","name":"羽村市"},{"link":"http://weather.livedoor.com/area/forecast/1322800","name":"あきる野市"},{"link":"http://weather.livedoor.com/area/forecast/1322900","name":"西東京市"},{"link":"http://weather.livedoor.com/area/forecast/1330300","name":"瑞穂町"},{"link":"http://weather.livedoor.com/area/forecast/1330500","name":"日の出町"},{"link":"http://weather.livedoor.com/area/forecast/1330700","name":"檜原村"},{"link":"http://weather.livedoor.com/area/forecast/1330800","name":"奥多摩町"}]
     * link : http://weather.livedoor.com/area/forecast/130010
     * forecasts : [{"dateLabel":"今日","telop":"曇のち晴","date":"2016-06-05","temperature":{"min":null,"max":null},"image":{"width":50,"url":"http://weather.livedoor.com/img/icon/12.gif","title":"曇のち晴","height":31}},{"dateLabel":"明日","telop":"曇り","date":"2016-06-06","temperature":{"min":{"celsius":"17","fahrenheit":"62.6"},"max":{"celsius":"23","fahrenheit":"73.4"}},"image":{"width":50,"url":"http://weather.livedoor.com/img/icon/8.gif","title":"曇り","height":31}},{"dateLabel":"明後日","telop":"曇時々雨","date":"2016-06-07","temperature":{"min":null,"max":null},"image":{"width":50,"url":"http://weather.livedoor.com/img/icon/10.gif","title":"曇時々雨","height":31}}]
     * location : {"city":"東京","area":"関東","prefecture":"東京都"}
     * publicTime : 2016-06-05T17:00:00+0900
     * copyright : {"provider":[{"link":"http://tenki.jp/","name":"日本気象協会"}],"link":"http://weather.livedoor.com/","title":"(C) LINE Corporation","image":{"width":118,"link":"http://weather.livedoor.com/","url":"http://weather.livedoor.com/img/cmn/livedoor.gif","title":"livedoor 天気情報","height":26}}
     * title : 東京都 東京 の天気
     * description : {"text":" ","publicTime":"2016-06-05T16:40:00+0900"}
     */

    private String link;
    /**
     * city : 東京
     * area : 関東
     * prefecture : 東京都
     */

    private LocationBean location;
    private String publicTime;
    /**
     * provider : [{"link":"http://tenki.jp/","name":"日本気象協会"}]
     * link : http://weather.livedoor.com/
     * title : (C) LINE Corporation
     * image : {"width":118,"link":"http://weather.livedoor.com/","url":"http://weather.livedoor.com/img/cmn/livedoor.gif","title":"livedoor 天気情報","height":26}
     */

    private CopyrightBean copyright;
    private String title;
    /**
     * text :
     * publicTime : 2016-06-05T16:40:00+0900
     */

    private DescriptionBean description;
    /**
     * link : http://weather.livedoor.com/area/forecast/1310100
     * name : 千代田区
     */

    private List<PinpointLocationsBean> pinpointLocations;
    /**
     * dateLabel : 今日
     * telop : 曇のち晴
     * date : 2016-06-05
     * temperature : {"min":null,"max":null}
     * image : {"width":50,"url":"http://weather.livedoor.com/img/icon/12.gif","title":"曇のち晴","height":31}
     */

    private List<ForecastsBean> forecasts;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocationBean getLocation() {
        return location;
    }

    public void setLocation(LocationBean location) {
        this.location = location;
    }

    public String getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }

    public CopyrightBean getCopyright() {
        return copyright;
    }

    public void setCopyright(CopyrightBean copyright) {
        this.copyright = copyright;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DescriptionBean getDescription() {
        return description;
    }

    public void setDescription(DescriptionBean description) {
        this.description = description;
    }

    public List<PinpointLocationsBean> getPinpointLocations() {
        return pinpointLocations;
    }

    public void setPinpointLocations(List<PinpointLocationsBean> pinpointLocations) {
        this.pinpointLocations = pinpointLocations;
    }

    public List<ForecastsBean> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<ForecastsBean> forecasts) {
        this.forecasts = forecasts;
    }

    public static class LocationBean {
        private String city;
        private String area;
        private String prefecture;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getPrefecture() {
            return prefecture;
        }

        public void setPrefecture(String prefecture) {
            this.prefecture = prefecture;
        }
    }

    public static class CopyrightBean {
        private String link;
        private String title;
        /**
         * width : 118
         * link : http://weather.livedoor.com/
         * url : http://weather.livedoor.com/img/cmn/livedoor.gif
         * title : livedoor 天気情報
         * height : 26
         */

        private ImageBean image;
        /**
         * link : http://tenki.jp/
         * name : 日本気象協会
         */

        private List<ProviderBean> provider;

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
        }

        public List<ProviderBean> getProvider() {
            return provider;
        }

        public void setProvider(List<ProviderBean> provider) {
            this.provider = provider;
        }

        public static class ImageBean {
            private int width;
            private String link;
            private String url;
            private String title;
            private int height;

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }
        }

        public static class ProviderBean {
            private String link;
            private String name;

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class DescriptionBean {
        private String text;
        private String publicTime;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getPublicTime() {
            return publicTime;
        }

        public void setPublicTime(String publicTime) {
            this.publicTime = publicTime;
        }
    }

    public static class PinpointLocationsBean {
        private String link;
        private String name;

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ForecastsBean {
        private String dateLabel;
        private String telop;
        private String date;
        /**
         * min : null
         * max : null
         */

        private TemperatureBean temperature;
        /**
         * width : 50
         * url : http://weather.livedoor.com/img/icon/12.gif
         * title : 曇のち晴
         * height : 31
         */

        private ImageBean image;

        public String getDateLabel() {
            return dateLabel;
        }

        public void setDateLabel(String dateLabel) {
            this.dateLabel = dateLabel;
        }

        public String getTelop() {
            return telop;
        }

        public void setTelop(String telop) {
            this.telop = telop;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public TemperatureBean getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureBean temperature) {
            this.temperature = temperature;
        }

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
        }

        public static class TemperatureBean {
            private Object min;
            private Object max;

            public Object getIn() {
                return min;
            }

            public void setIn(Object in) {
                min = in;
            }

            public Object getAx() {
                return max;
            }

            public void setAx(Object ax) {
                max = ax;
            }
        }

        public static class ImageBean {
            private int width;
            private String url;
            private String title;
            private int height;

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }
        }
    }
}
