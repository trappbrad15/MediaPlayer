package android.content;

import android.content.res.Configuration;

public abstract interface ComponentCallbacks
{
  public abstract void onConfigurationChanged(Configuration paramConfiguration);

  public abstract void onLowMemory();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.ComponentCallbacks
 * JD-Core Version:    0.6.2
 */