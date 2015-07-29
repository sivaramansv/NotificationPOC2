package ssivaram.cmu.notificationpoc2.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by user on 7/29/2015.
 */

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            Intent serviceIntent = new Intent("ssivaram.cmu.notificationpoc2.service.MyService");
            context.startService(serviceIntent);
        }
    }
}
