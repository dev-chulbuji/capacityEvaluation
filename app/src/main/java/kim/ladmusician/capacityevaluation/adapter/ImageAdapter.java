package kim.ladmusician.capacityevaluation.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import kim.ladmusician.capacityevaluation.R;
import kim.ladmusician.capacityevaluation.adapter.viewholder.ImageViewHolder;
import kim.ladmusician.capacityevaluation.entity.Image;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public class ImageAdapter extends BaseAdapter<Image, ImageViewHolder> {
    public ImageAdapter(Context ctx) {
        this.mContext = ctx;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImageViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false));
    }

    @NonNull
    @Override
    protected Object getModelId(@NonNull Image model) {
        return null;
    }
}
