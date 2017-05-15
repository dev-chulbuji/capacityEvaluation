package kim.ladmusician.capacityevaluation.presenter;

import android.os.Bundle;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public class PresenterManager {
    private static final String KEY_PRESENTER_ID = "key_presenter_id";
    private static PresenterManager instance;
    private final AtomicLong currentId;
    private final Cache<Long, BasePresenter<?, ?>> presenters;

    PresenterManager(long maxSize, long expirationValue, TimeUnit expirationUnit) {
        currentId = new AtomicLong();

        presenters = CacheBuilder.newBuilder()
                .maximumSize(maxSize)
                .expireAfterWrite(expirationValue, expirationUnit)
                .build();
    }

    public static PresenterManager getInstance() {
        if (instance == null) {
            instance = new PresenterManager(10, 30, TimeUnit.SECONDS);
        }
        return instance;
    }

    public <P extends BasePresenter<?, ?>> P restorePresenter(Bundle savedInstanceState) {
        Long presenterId = savedInstanceState.getLong(KEY_PRESENTER_ID);
        P presenter = (P) presenters.getIfPresent(presenterId);
        presenters.invalidate(presenterId);
        return presenter;
    }

    public void savePresenter(BasePresenter<?, ?> presenter, Bundle outState) {
        long presenterId = currentId.incrementAndGet();
        presenters.put(presenterId, presenter);
        outState.putLong(KEY_PRESENTER_ID, presenterId);
    }
}
