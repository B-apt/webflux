package org.demo.webflux.demo.data;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "shipwrecks")
public class Shipwreck {

    @Id
    private String id;
    private String recrd;
    private String vesslterms;
    private String feature_type;
    private String chart;
    private Double latdec;
    private Double londec;
    private String gp_quality;
//    private Double depth;
    private String sounding_type;
    private String history;
    private String quasou;
    private String watlev;
    private double[] coordinates;


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Shipwreck{");
        sb.append("id='").append(id).append('\'');
        sb.append(", recrd='").append(recrd).append('\'');
        sb.append(", vesslterms='").append(vesslterms).append('\'');
        sb.append(", feature_type='").append(feature_type).append('\'');
        sb.append(", chart='").append(chart).append('\'');
        sb.append(", latdec=").append(latdec);
        sb.append(", londec=").append(londec);
        sb.append(", gp_quality='").append(gp_quality).append('\'');
//        sb.append(", depth=").append(depth);
        sb.append(", sounding_type='").append(sounding_type).append('\'');
        sb.append(", history='").append(history).append('\'');
        sb.append(", quasou='").append(quasou).append('\'');
        sb.append(", watlev='").append(watlev).append('\'');
        sb.append(", coordinates=");
        if (coordinates == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < coordinates.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(coordinates[i]);
            sb.append(']');
        }
        sb.append('}');
        return sb.toString();
    }
}
