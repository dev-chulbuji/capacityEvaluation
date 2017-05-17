package kim.ladmusician.capacityevaluation.network;

import io.reactivex.Observable;
import kim.ladmusician.capacityevaluation.entity.RecentPhoto;
import retrofit2.http.GET;

/**
 * Created by ladmusician on 2017. 5. 17..
 */

public class ImageService {
    public ImageApi getApi() {
        return RetrofitCreator.getInstance()
                .getRetrofitInstance().create(ImageApi.class);
    }

    public interface ImageApi {
        @GET("?format=json&nojsoncallback=1&method=flickr.interestingness.getList&api_key=d97ffd979528256e5813e821559d9fd1")
        Observable<RecentPhoto> getItems();
    }
}
