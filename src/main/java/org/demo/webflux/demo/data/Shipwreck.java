package org.demo.webflux.demo.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Shipwreck {

    @Id
    private String id;
    private String feature_type;
    private String chart;
    private double latdec;
    private double londec;

    public String getChart() {
        return chart;
    }

    public void setChart(String chart) {
        this.chart = chart;
    }

    public double getLatdec() {
        return latdec;
    }

    public void setLatdec(double latdec) {
        this.latdec = latdec;
    }

    public double getLondec() {
        return londec;
    }

    public void setLondec(double londec) {
        this.londec = londec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFeature_type() {
        return feature_type;
    }

    public void setFeature_type(String feature_type) {
        this.feature_type = feature_type;
    }
}
