package com.gs.myceshi.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.RemoteViews;

import com.gs.myceshi.R;

public class NotificationChannelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.database);
        setProgressNotification();
    }

    /**
     * 创建通知栏管理工具
     */
    private NotificationManager getManger() {
        NotificationManager notificationManager = (NotificationManager) getSystemService
                (Context.NOTIFICATION_SERVICE);
        return notificationManager;
    }

    private NotificationCompat.Builder senNotification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
            NotificationChannel channel = new NotificationChannel("channel_id", "channel_name", NotificationManager.IMPORTANCE_DEFAULT);
            channel.canBypassDnd();//绕过请勿打扰模式
            channel.enableLights(true);//是否闪光
            channel.setLightColor(Color.parseColor("#ffffff"));//闪光颜色
            channel.canShowBadge();//桌面laucher 角标
            channel.setLockscreenVisibility(Notification.VISIBILITY_SECRET);//锁屏显示通知
            channel.enableVibration(true);//震动
            channel.setVibrationPattern(new long[]{100, 200, 100});//震动频率

            channel.getAudioAttributes();//获取系统通知响铃的配置
            channel.getGroup();//获取通知渠道组
            getManger().createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        /**
         *  设置Builder
         */
        //设置标题
        builder.setContentTitle("我是标题")
                .setChannelId("channel_id")
                //设置内容
                .setContentText("我是内容")
                //设置大图标
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                //设置小图标
                .setSmallIcon(R.mipmap.ic_launcher_round)
                //设置通知时间
                .setWhen(System.currentTimeMillis())
                //首次进入时显示效果
                .setTicker("我是测试内容")
                //设置通知方式，声音，震动，呼吸灯等效果，这里通知方式为声音
                .setDefaults(Notification.DEFAULT_SOUND);

//        notificationManager.notify(1, builder.build());
        return builder;
    }


    private void setProgressNotification() {
        final NotificationCompat.Builder builder = senNotification();
        builder.setDefaults(Notification.FLAG_ONLY_ALERT_ONCE);//没有声音
        getManger().notify(1, builder.build());
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(1000);
                        builder.setDefaults(Notification.FLAG_ONLY_ALERT_ONCE);//没有声音
                        builder.setProgress(100, i, false);
                        getManger().notify(1, builder.build());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();
    }


    //自定义通知
    private void customNotification() {
        final NotificationCompat.Builder builder = senNotification();
        RemoteViews view = new RemoteViews(getPackageName(), R.layout.activity_notification);
        view.setTextViewText(R.id.id_tv, "信息。。。");
        //PendingIntent 即将发生的意图，可以被取消，更新
        PendingIntent pi = PendingIntent.getActivity(this, -1, new Intent(this, NotificationChannelActivity.class), PendingIntent.FLAG_UPDATE_CURRENT);

        view.setOnClickPendingIntent(R.id.btns, pi);//点击按钮跳转到某个页面
        builder.setCustomContentView(view);

        getManger().notify(3, builder.build());
//        getManger().cancel(2);//取消id =2 的通知
    }
}
