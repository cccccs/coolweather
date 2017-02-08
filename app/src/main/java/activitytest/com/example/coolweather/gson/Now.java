package activitytest.com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pc on 2017/2/7.
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }
}
