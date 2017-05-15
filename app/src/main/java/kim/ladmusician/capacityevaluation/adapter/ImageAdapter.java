package kim.ladmusician.capacityevaluation.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kim.ladmusician.capacityevaluation.R;
import kim.ladmusician.capacityevaluation.adapter.model.AdapterDataModel;
import kim.ladmusician.capacityevaluation.adapter.view.AdapterDataView;
import kim.ladmusician.capacityevaluation.adapter.viewholder.ImageViewHolder;
import kim.ladmusician.capacityevaluation.entity.Image;
import kim.ladmusician.capacityevaluation.interfaces.OnRecyclerItemClickListener;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public class ImageAdapter extends RecyclerView.Adapter<ImageViewHolder>
        implements AdapterDataModel<Image>, AdapterDataView {
    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(mContext).inflate(R.layout.item_image, parent, false);
//        return new ImageViewHolder(view, mContext);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void addItem(Image item) {

    }

    @Override
    public void deleteItem(int position) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void setOnRecyclerItemClickListener(OnRecyclerItemClickListener onRecyclerItemClickListener) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Image getItem(int position) {
        return null;
    }

    @Override
    public void updateItem(int position, Image item) {

    }

    @Override
    public void updateItems(List<Image> items) {

    }

    @Override
    public void onClickedState(boolean state) {

    }

    @Override
    public void refresh() {

    }
}
