package com.ctakesoft.lwwssample.model;

import java.util.List;

public class Forecast {

    /**
     * link : http://weather.livedoor.com/area/forecast/130010
     * forecasts : [{"dateLabel":"今日","telop":"曇のち晴","date":"2016-06-05","temperature":{"min":null,"max":null},"image":{"width":50,"url":"http://weather.livedoor.com/img/icon/12.gif","title":"曇のち晴","height":31}},{"dateLabel":"明日","telop":"曇り","date":"2016-06-06","temperature":{"min":{"celsius":"17","fahrenheit":"62.6"},"max":{"celsius":"23","fahrenheit":"73.4"}},"image":{"width":50,"url":"http://weather.livedoor.com/img/icon/8.gif","title":"曇り","height":31}},{"dateLabel":"明後日","telop":"曇時々雨","date":"2016-06-07","temperature":{"min":null,"max":null},"image":{"width":50,"url":"http://weather.livedoor.com/img/icon/10.gif","title":"曇時々雨","height":31}}]
     * location : {"city":"東京","area":"関東","prefecture":"東京都"}
     * publicTime : 2016-06-05T17:00:00+0900
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
    private String title;
    /**
     * text :
     * publicTime : 2016-06-05T16:40:00+0900
     */

    private DescriptionBean description;
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

    @Override
    public String toString() {
        return "Forecast{" +
                "link='" + link + '\'' +
                ", location=" + location +
                ", publicTime='" + publicTime + '\'' +
                ", title='" + title + '\'' +
                ", description=" + description +
                ", forecasts=" + forecasts +
                '}';
    }
}
