package edu.neusoft.a124team.dietitian.haoDengKe;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.neusoft.a124team.dietitian.R;

public class H_search extends AppCompatActivity {
    ListView listView;
    ArrayList<HashMap<String,Object>> data=new ArrayList<HashMap<String,Object>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_rearch);
        listView=(ListView)findViewById(R.id.listView1);
        HashMap<String,Object> map=new HashMap<>();
        map.put("img",R.drawable.h_iamgebutton_searchitem1);
        map.put("Title","煎火腿奶酪蛋饼");
        map.put("Content", "8步/<10分钟");
        map.put("details", "咸鲜味/煎");
        HashMap<String, Object> map2=new HashMap<String, Object>();
        data.add(map);
        map2.put("img", R.drawable.h_iamgebutton_searchitem2);
        map2.put("Title","墨西哥卷饼");
        map2.put("Content", "0步/<30分钟");
        map2.put("details","黑椒味/蒸");
        data.add(map2);
        HashMap<String, Object> map3=new HashMap<String, Object>();
        map3.put("img", R.drawable.h_iamgebutton_searchitem3);
        map3.put("Title","天津狗不理包子");
        map3.put("Content", "0步/<30分钟");
        map3.put("details","家常味/蒸");
        data.add(map3);
        HashMap<String, Object> map4=new HashMap<String, Object>();
        map4.put("img", R.drawable.h_iamgebutton_searchitem4);
        map4.put("Title","香葱小肉饼");
        map4.put("Content", "0步/<30分钟");
        map4.put("details","咸鲜味/蒸");
        data.add(map4);
        HashMap<String, Object> map5=new HashMap<String, Object>();
        map5.put("img", R.drawable.h_iamgebutton_searchitem5);
        map5.put("Title","鸡胸肉可乐饼");
        map5.put("Content", "0步/<15分钟");
        map5.put("details","家常味/煎");
        data.add(map5);


        MySimpleAdapter adapter=new MySimpleAdapter(
                this,
                data,
                R.layout.activity_h_breakfast_item1,
                new String[]{"img","Title","Content", "details"},
                new int[]{R.id.imageView2,R.id.text1,R.id.text2,R.id.text3}
        );

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent=new Intent();
                        intent.setClass(H_search.this,H_harm.class);
                        startActivity(intent);
                        break;
                    case 1:
                        expressItemClickOne(1);
                        break;

                    case 2:
                        expressItemClickTwo(2);
                        break;
                    case 3:
                        expressItemClickThree(3);
                        break;
                    case 4:
                        expressItemClickFour(4);
                        break;

                }

            }
        });


    }
    public void expressItemClickOne(int position){
        Intent intent = new Intent(this, H_breakfast_item2.class);
        int img=R.drawable.h_iamgebutton_searchitem2;
        intent.putExtra("Content", "所在区域：大连市甘井子区8号");
        intent.putExtra("Title", "墨西哥卷饼");
        intent.putExtra("img",img);
        startActivity(intent);
    }
    public void expressItemClickTwo(int position){
        Intent intent = new Intent(this, H_breakfast_item2.class);
        int img=R.drawable.h_iamgebutton_searchitem3;
        intent.putExtra("Content", "所在区域：大连市甘井子区8号");
        intent.putExtra("Title", "天津狗不理包子");
        intent.putExtra("img",img);
        startActivity(intent);
    }
    public void expressItemClickThree(int position){
        Intent intent = new Intent(this, H_breakfast_item2.class);
        int img=R.drawable.h_iamgebutton_searchitem4;
        intent.putExtra("Content", "所在区域：大连市甘井子区8号");
        intent.putExtra("Title", "香葱小肉饼");
        intent.putExtra("img",img);
        startActivity( intent);
    }
    public void expressItemClickFour(int position){
        Intent intent = new Intent(this, H_breakfast_item2.class);
        int img=R.drawable.h_iamgebutton_searchitem5;
        intent.putExtra("Content", "所在区域：大连市甘井子区8号");
        intent.putExtra("Title", "鸡胸肉可乐饼");
        intent.putExtra("img",img);
        startActivity( intent);
    }
    class MySimpleAdapter extends SimpleAdapter {
        public MySimpleAdapter(Context context, List<? extends Map<String,Object>> data, int  resource,
                               String[] from, int[] to){
            super(context,data,resource,from,to);}
        public View getView(int position,View convertView,ViewGroup parent){
            View result=super.getView(position, convertView,parent);
            TextView textView=(TextView)result.findViewById(R.id.text1);
            if (position%2==1) {
                textView.setTextColor(Color.BLACK);
                result.setBackgroundColor(Color.WHITE);
            }
            else {
                textView.setTextColor(Color.RED);
                result.setBackgroundColor(Color.GRAY);
            }
            return result;
        }

    }

    }

