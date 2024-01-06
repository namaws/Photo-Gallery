package edu.vt.cs5254.fancygallery.api

//retrofit API interface is a standard Kotlin interface that use retrofit annotation to define API calls
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "893dc6ab74765c0690b8ba1d8b63946c"
//
interface FlickrApi {
    //mark with "suspend" modifier, Retrofit will able to perform networking request within a coroutine scope and suspend while waiting server respond
    //@GET is annotation for HTTP request method
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s,geo"
    )
    suspend fun fetchPhotos(@Query("per_page") pageLimit:Int): FlickrResponse
}