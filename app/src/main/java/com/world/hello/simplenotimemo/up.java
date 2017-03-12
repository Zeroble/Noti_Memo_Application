package com.world.hello.simplenotimemo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upup);

        Intent intent = getIntent();
        String T = intent.getStringExtra("title");
        String N = intent.getStringExtra("neyong");

// 일반 알림.
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, up.class), PendingIntent.FLAG_UPDATE_CURRENT);

            Notification.Builder builder = new Notification.Builder(this);

            // 작은 아이콘 이미지.
            builder.setSmallIcon(R.mipmap.ic_launcher);

            // 알림이 출력될 때 상단에 나오는 문구.
            builder.setTicker("Simple Noti memo");

            // 알림 제목.
            builder.setContentTitle(T);

            // 알림 내용.
            builder.setContentText(N);

            // 알림 터치시 반응 후 알림 삭제 여부.
            builder.setAutoCancel(true);



            // 고유ID로 알림을 생성.
            NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            nm.notify(123456, builder.build());
        finish();
        }
    }


