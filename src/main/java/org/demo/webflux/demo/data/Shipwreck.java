package org.demo.webflux.demo.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shipwrecks")
public class Shipwreck {

    @Id
    private String id;
    private String recrd;
    private String vesslterms;
    private String feature_type;
    private String chart;
//    private Double latdec;
//    private Double londec;
//    private String gp_quality;
//    private Float depth;
//    private String sounding_type;
//    private String history;
//    private String quasou;
//    private String watlev;
//    private double[] coordinates;

    public Shipwreck() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRecrd() {
        return recrd;
    }

    public void setRecrd(String recrd) {
        this.recrd = recrd;
    }

    public String getVesslterms() {
        return vesslterms;
    }

    public void setVesslterms(String vesslterms) {
        this.vesslterms = vesslterms;
    }

    public String getFeature_type() {
        return feature_type;
    }

    public void setFeature_type(String feature_type) {
        this.feature_type = feature_type;
    }

    public String getChart() {
        return chart;
    }

    public void setChart(String chart) {
        this.chart = chart;
    }
//
//    public double getLatdec() {
//        return latdec;
//    }
//
//    public void setLatdec(double latdec) {
//        this.latdec = latdec;
//    }
//
//    public double getLondec() {
//        return londec;
//    }
//
//    public void setLondec(double londec) {
//        this.londec = londec;
//    }
//
//    public String getGp_quality() {
//        return gp_quality;
//    }
//
//    public void setGp_quality(String gp_quality) {
//        this.gp_quality = gp_quality;
//    }
//
//    public float getDepth() {
//        return depth;
//    }
//
//    public void setDepth(float depth) {
//        this.depth = depth;
//    }
//
//    public String getSounding_type() {
//        return sounding_type;
//    }
//
//    public void setSounding_type(String sounding_type) {
//        this.sounding_type = sounding_type;
//    }
//
//    public String getHistory() {
//        return history;
//    }
//
//    public void setHistory(String history) {
//        this.history = history;
//    }
//
//    public String getQuasou() {
//        return quasou;
//    }
//
//    public void setQuasou(String quasou) {
//        this.quasou = quasou;
//    }
//
//    public String getWatlev() {
//        return watlev;
//    }
//
//    public void setWatlev(String watlev) {
//        this.watlev = watlev;
//    }
//
//    public double[] getCoordinates() {
//        return coordinates;
//    }
//
//    public void setCoordinates(double[] coordinates) {
//        this.coordinates = coordinates;
//    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Shipwreck{");
        sb.append("id='").append(id).append('\'');
        sb.append(", recrd='").append(recrd).append('\'');
        sb.append(", vesslterms='").append(vesslterms).append('\'');
        sb.append(", feature_type='").append(feature_type).append('\'');
        sb.append(", chart='").append(chart).append('\'');
//        sb.append(", latdec=").append(latdec);
//        sb.append(", londec=").append(londec);
//        sb.append(", gp_quality='").append(gp_quality).append('\'');
//        sb.append(", depth=").append(depth);
//        sb.append(", sounding_type='").append(sounding_type).append('\'');
//        sb.append(", history='").append(history).append('\'');
//        sb.append(", quasou='").append(quasou).append('\'');
//        sb.append(", watlev='").append(watlev).append('\'');
//        sb.append(", coordinates=");
//        if (coordinates == null) sb.append("null");
//        else {
//            sb.append('[');
//            for (int i = 0; i < coordinates.length; ++i)
//                sb.append(i == 0 ? "" : ", ").append(coordinates[i]);
//            sb.append(']');
//        }
        sb.append('}');
        return sb.toString();
    }
}
