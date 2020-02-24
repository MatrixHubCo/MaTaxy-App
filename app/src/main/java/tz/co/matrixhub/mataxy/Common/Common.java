package tz.co.matrixhub.mataxy.Common;

import tz.co.matrixhub.mataxy.Remote.IGoogleAPI;
import tz.co.matrixhub.mataxy.Remote.RetrofitClient;

/**
 * Created by lawrance on 20/11/2018.
 * © 2018
 */
public class Common {
    public static final String baseURL="https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
