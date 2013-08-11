package android.content;

import android.os.IBinder;

public abstract interface ServiceConnection
{
  public abstract void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder);

  public abstract void onServiceDisconnected(ComponentName paramComponentName);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.ServiceConnection
 * JD-Core Version:    0.6.2
 */