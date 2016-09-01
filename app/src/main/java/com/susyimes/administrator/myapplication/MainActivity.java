package com.susyimes.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import org.json.JSONArray;
import org.json.JSONException;

public class MainActivity extends AppCompatActivity {
    private ImageView img1,img2,img3,img4,img5
,img6;
    private TextView tv1,tv2,tv3,tv4,tv5,tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1= (ImageView) findViewById(R.id.img1);
        img2= (ImageView) findViewById(R.id.img2);
        img3= (ImageView) findViewById(R.id.img3);
        img4= (ImageView) findViewById(R.id.img4);
        img5= (ImageView) findViewById(R.id.img5);
        img6= (ImageView) findViewById(R.id.img6);
        tv1= (TextView) findViewById(R.id.tv1);
        tv2= (TextView) findViewById(R.id.tv2);
        tv1= (TextView) findViewById(R.id.tv3);
        tv1= (TextView) findViewById(R.id.tv4);
        tv1= (TextView) findViewById(R.id.tv1);
        tv1= (TextView) findViewById(R.id.tv1);

        try {
            JSONArray jsonArray=new JSONArray("[\"http://img.masala-sg.goldenmob.com/img/29dd5de3924e8812e55c9063f79e00e7/i_0_imagesqtbn:ANd9GcT2gQBQYYgl5aM503CLxGXa0OHj3Q6-216.webp\"," +
                    "\"http://img.masala-sg.goldenmob.com/img/29dd5de3924e8812e55c9063f79e00e7/i_1_LRReconnaissance-216.webp\"," +
                    "\"http://img.masala-sg.goldenmob.com/img/29dd5de3924e8812e55c9063f79e00e7/i_2_9477360960_95c1edf376-216.webp\"," +
                    "\"http://img.masala-sg.goldenmob.com/img/29dd5de3924e8812e55c9063f79e00e7/i_3_hqdefault-216.webp\"," +
                    "\"http://img.masala-sg.goldenmob.com/img/29dd5de3924e8812e55c9063f79e00e7/i_4_13-216.webp\"," +
                    "\"http://img.masala-sg.goldenmob.com/img/29dd5de3924e8812e55c9063f79e00e7/i_5_hacker_cleanup2-216.webp\"]");
           long time1= System.currentTimeMillis();
            Glide.with(this).load(jsonArray.get(0)).listener(new RequestListener<Object, GlideDrawable>() {
                @Override
                public boolean onException(Exception e, Object model, Target<GlideDrawable> target, boolean isFirstResource) {
                    return false;
                }

                @Override
                public boolean onResourceReady(GlideDrawable resource, Object model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                    long time2= System.currentTimeMillis();
                    return false;
                }
            })
                    .into(img1);
            Glide.with(this).load(jsonArray.get(1))
                    .into(img2);
            Glide.with(this).load(jsonArray.get(2))
                    .into(img3);
            Glide.with(this).load(jsonArray.get(3))
                    .into(img4);
            Glide.with(this).load(jsonArray.get(4))
                    .into(img5);
            Glide.with(this).load(jsonArray.get(5))
                    .into(img6);
        } catch (JSONException e) {
            e.printStackTrace();
        }




    }
}
