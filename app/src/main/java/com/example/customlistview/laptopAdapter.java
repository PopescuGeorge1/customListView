package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class laptopAdapter extends ArrayAdapter<laptop> {

    private final Context context;
    public ArrayList<laptop> devices;
    TextView tvTitle, tvModel, tvDescription;


    public laptopAdapter(@NonNull Context context, ArrayList<laptop> list) {
        super(context, R.layout.row_layout, list);
        this.context = context;
        this.devices=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = layoutInflater.inflate(R.layout.row_layout,parent,false);

        tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);
        tvModel = (TextView) rowView.findViewById(R.id.tvModel);
        tvDescription = (TextView) rowView.findViewById(R.id.tvDescription);

        tvTitle.setText(devices.get(position).getName());
        tvModel.setText(devices.get(position).getModel());
        tvDescription.setText(devices.get(position).getDescription());


        return rowView;

    }
}
