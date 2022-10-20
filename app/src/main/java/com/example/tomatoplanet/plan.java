package com.example.tomatoplanet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

/**
 *
 * 主页面
 */
public class plan extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
        ImageButton time = (ImageButton)findViewById(R.id.imageButton4);
        time.setOnClickListener(this);
        ImageButton add = (ImageButton) findViewById(R.id.imageButton2);
        add.setOnClickListener(this);
        ImageButton more = (ImageButton) findViewById(R.id.imageButton3);
        more.setOnClickListener(this);
        ImageButton change = (ImageButton) findViewById(R.id.imageButton6);
        change.setOnClickListener(this);
        ConstraintLayout constraintLayout_1 = (ConstraintLayout) findViewById(R.id.frame_1);
        constraintLayout_1.setOnLongClickListener(this);
        /**
         * 为这些控件实例化对象并且设置监听
         */
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton4: show_menu(view);break;
            case R.id.imageButton2: show_build(view);break;
            case R.id.imageButton3: show_more(view);break;
            case R.id.imageButton6: change_activity(view);break;
        }
    }

    /**
     * 设置监后执行对应方法
     * @param view
     */
    private void change_activity(View view) {
        Intent intent = new Intent(this,Data_activity.class);
        startActivity(intent);
         this.finish();
    }

    /**
     * 切换页面到统计页面
     * @param view
     */
    private void show_more(View view) {
        More_option more_option = new More_option(this);
        more_option.show();

    }

    /**
     * 更多的dialog
     * @param view
     */
    private void show_build(View view) {
        Add_plan add_plan =new Add_plan(this);
        add_plan.setCancelable(false);
        add_plan.show();
    }

    /**
     * 添加待办项的dialog
     *
     * @param view
     */
    private void show_menu(View view) {
        PopupMenu popupMenu = new PopupMenu(this,view);//实例化这个对象
        getMenuInflater().inflate(R.menu.menu_time,popupMenu.getMenu());//加载menu资源
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.option_normal_1:
                        Toast.makeText(getBaseContext(),"早起打卡",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.option_normal_2:
                        Toast.makeText(getBaseContext(),"专注时长打卡",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.option_normal_3:
                        Toast.makeText(getBaseContext(),"睡眠打卡",Toast.LENGTH_LONG).show();
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });


    }
    /**
     * 打卡的menu菜单
     */



    @Override
    public boolean onLongClick(View view) {
        switch (view.getId()){
            case R.id.frame_1:
                Frame frame = new Frame(this);
                frame.show();

        }
        return false;
    }
}
