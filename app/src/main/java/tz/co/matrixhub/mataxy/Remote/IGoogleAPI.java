package tz.co.matrixhub.mataxy.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by lawrance on 20/11/2018.
 * © 2018
 */
public interface IGoogleAPI {
    @GET
    Call<String> getPath(@Url String URL);
}

