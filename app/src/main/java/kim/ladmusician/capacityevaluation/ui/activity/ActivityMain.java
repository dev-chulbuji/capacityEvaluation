package kim.ladmusician.capacityevaluation.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import kim.ladmusician.capacityevaluation.R;
import kim.ladmusician.capacityevaluation.adapter.BookAdapter;
import kim.ladmusician.capacityevaluation.presenter.Impl.MainPresenterImpl;
import kim.ladmusician.capacityevaluation.ui.base.BaseActivity;

public class ActivityMain extends BaseActivity implements MainPresenterImpl.View {
    private static final String TAG = ActivityMain.class.getSimpleName();

    private BookAdapter mAdatper = null;

    @BindView(R.id.item_container)
    RecyclerView mContainer;

    @Override
    public int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initView() {
        mAdatper = new BookAdapter(this);
        mContainer.setHasFixedSize(true);
        mContainer.setLayoutManager(new GridLayoutManager(this, 3));
        mContainer.setAdapter(mAdatper);

        mAdatper.setOnRecyclerItemClickListener((adapter1, position) -> {
            //mainPresenter.onPhotoItemClick(position);
        });

        basePresenter = new MainPresenterImpl(this, mAdatper);
        getPresenter().loadItems();
    }

    @Override
    public void refresh() {
        mAdatper.refresh();
    }

    public MainPresenterImpl getPresenter() {
        return (MainPresenterImpl)basePresenter;
    }
}
