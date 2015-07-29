package ssivaram.cmu.notificationpoc2.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import ssivaram.cmu.notificationpoc2.HomeActivity;
import ssivaram.cmu.notificationpoc2.R;

/**
 * Created by user on 7/29/2015.
 */
public class MyService extends Service {

    private NotificationManager mNM;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mNM = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        showNotification();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {

        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    private void showNotification() {
        // In this sample, we'll use the same text for the ticker and the expanded notification
        CharSequence text = "Sivaraman";

        // Set the icon, scrolling text and timestamp
        Notification notification = new Notification(R.drawable.icon, text,
                System.currentTimeMillis());

        // The PendingIntent to launch our activity if the user selects this notification
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
                new Intent(this, HomeActivity.class), 0);

        // Set the info for the views that show in the notification panel.
        notification.setLatestEventInfo(this, "Srikrishnan",
                text, contentIntent);

        // Send the notification.
        mNM.notify(0, notification);
    }
}