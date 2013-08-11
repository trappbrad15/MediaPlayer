package android.webkit;

import android.content.Context;
import android.view.View;

public abstract interface PluginStub
{
  public abstract View getEmbeddedView(int paramInt, Context paramContext);

  public abstract View getFullScreenView(int paramInt, Context paramContext);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.webkit.PluginStub
 * JD-Core Version:    0.6.2
 */