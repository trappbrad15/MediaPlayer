package javax.net.ssl;

import java.util.EventListener;

public abstract interface SSLSessionBindingListener extends EventListener
{
  public abstract void valueBound(SSLSessionBindingEvent paramSSLSessionBindingEvent);

  public abstract void valueUnbound(SSLSessionBindingEvent paramSSLSessionBindingEvent);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.net.ssl.SSLSessionBindingListener
 * JD-Core Version:    0.6.2
 */