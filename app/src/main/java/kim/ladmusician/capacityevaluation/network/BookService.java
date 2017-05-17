package kim.ladmusician.capacityevaluation.network;

import io.reactivex.Observable;
import kim.ladmusician.capacityevaluation.entity.Book;
import kim.ladmusician.capacityevaluation.entity.ResultDTO;
import retrofit2.http.GET;

/**
 * Created by ladmusician on 2017. 5. 17..
 */

public class BookService {
    public BookApi getApi() {
        return RetrofitCreator.getInstance()
                .getRetrofitInstance().create(BookApi.class);
    }

    public interface BookApi {
        @GET("book?query=\"김동진\"")
        Observable<ResultDTO<Book>> getItems();
    }
}
