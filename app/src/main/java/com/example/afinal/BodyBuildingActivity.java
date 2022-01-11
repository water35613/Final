package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class BodyBuildingActivity extends AppCompatActivity {

    class Data{
        int photo;
        String name;
    }
    public class MyAdapter extends BaseAdapter{
        private BodyBuildingActivity.Data[] data;
        private int view;

        public MyAdapter(BodyBuildingActivity.Data[] data,int view){
            this.data=data;
            this.view=view;
        }

        @Override
        public int getCount() {return data.length;}

        @Override
        public Object getItem(int position) {
            return 0;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){

            convertView = getLayoutInflater().inflate(view, parent, false);
            TextView name = convertView.findViewById(R.id.name);
            name.setText(data[position].name);
            return convertView;
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_building);

       // @Override
        //protected void onCreate(Bundle savedInstanceState) {
        //    super.onCreate(savedInstanceState);
          //  setContentView(R.layout.activity_main);

            String[] transNameArray = new String[]{"第一天", "第二天", "第三天", "結算"};


            Data[] transData = new Data[transNameArray.length];
            for(int i=0; i<transData.length; i++) {
                transData[i] = new Data();
                transData[i].name = transNameArray[i];

            }

            MyAdapter transAdapter = new MyAdapter(transData, R.layout.trans_list);

            Spinner spinner = findViewById(R.id.spinner);
            spinner.setAdapter(transAdapter);


    }
}


















