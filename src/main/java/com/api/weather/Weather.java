package com.api.weather;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by Pratik Acharya on 6/23/2017.
 */

@XmlRootElement(name = "dwml")
@XmlAccessorType(XmlAccessType.FIELD)
public class Weather {

    @XmlElement(name="data")
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Weather{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
