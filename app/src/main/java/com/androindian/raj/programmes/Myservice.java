package com.androindian.raj.programmes;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class Myservice extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),
                "Ondesstroy",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(getApplicationContext(),
                "create",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Toast.makeText(getApplicationContext(),
                "Rebind",Toast.LENGTH_LONG).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);

    }
}
