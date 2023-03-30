package com.example.customlistviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Student> {

    private ArrayList<Student> students;
    private int resource;
    private Context context;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Student> students) {
        super(context, resource, students);
        this.resource = resource; // Layout dùng để custom
        this.students = students; // Dữ liệu
        this.context = context; // Activity cần tạo listview
    }

    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        // convertView là cái dòng view mới tự custom (1 dòng có 2 txtView)
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(this.getContext()); // Muốn custom đc view (hay là file .xml)
                                                        // thì phải có context chứa nó
            v = vi.inflate(resource, null);  // Lấy layout cần custom qua View để lát return
        }

        Student s = getItem(position); // Vị trí của student trong mảng

        if (s != null){
            ViewHolder holder = new ViewHolder();
            holder.studentName = (TextView) v.findViewById(R.id.studentName);
            holder.studentDob = (TextView) v.findViewById(R.id.studentDob);

            if (holder.studentName != null)
                holder.studentName.setText(s.getName());
            if (holder.studentName != null)
                holder.studentDob.setText(s.getDob());
        }
        return v;
    }
}

class ViewHolder{
    TextView studentName, studentDob;
}
