package com.ashazar.tabdrawer;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ashazar.tabdrawer.model.TabListItem;

import java.util.ArrayList;

/**
 * Adapter for Tab's item list.
 * <p>
 * Created by Serdar Hazar on 12/7/16.
 */
public class TabDrawerListAdapter extends ArrayAdapter<TabListItem> {
    private int layoutResourceId = 0;
    private boolean customItemLayout;

    /**
     * Instantiates a new Tab list adapter.
     *
     * @param context the context
     * @param list    the list
     */
    public TabDrawerListAdapter(Context context, ArrayList<TabListItem> list) {
        super(context, 0, list);
        layoutResourceId = R.layout.tabdrawer_tab_list_item;
        customItemLayout = false;
    }

    public TabDrawerListAdapter(Context context, int layoutId, ArrayList<TabListItem> list) {
        super(context, layoutId, list);
        layoutResourceId = layoutId;
        customItemLayout = true;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(layoutResourceId, parent, false);
        }

        /*
        TabListItem item = getItem(position);
        String title = item.getTitle();
        int imgDrawableId = item.getDrawableId();
        boolean isSelected = item.isSelected();

        ImageView imageView = null;
        TextView titleView = null;

        imageView = (ImageView) convertView.findViewById(R.id.list_item_img);
        titleView = (TextView) convertView.findViewById(R.id.list_item_title);

        if (imgDrawableId == -1) {
            if (!customItemLayout)
                imageView.setVisibility(View.GONE);
        }
        else {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(imgDrawableId);

            if (isSelected)
                imageView.getLayoutParams().width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, item.getTextSize() + 10, getContext().getResources().getDisplayMetrics());
            else
                imageView.getLayoutParams().width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, item.getTextSize() + 8, getContext().getResources().getDisplayMetrics());

            imageView.requestLayout();
        }

        if (title != null) {
            titleView.setText(title);
            titleView.setTextColor(item.getTextColor());
            if (isSelected) {
                titleView.setTypeface(null, Typeface.BOLD);
                titleView.setTextSize(TypedValue.COMPLEX_UNIT_SP, item.getTextSize() + 1);
            } else {
                titleView.setTypeface(null, Typeface.NORMAL);
                titleView.setTextSize(TypedValue.COMPLEX_UNIT_SP, item.getTextSize());
            }

            titleView.requestLayout();

            if (imgDrawableId != -1)
                imageView.setContentDescription(title);
        }
        */

        return convertView;
    }
}
