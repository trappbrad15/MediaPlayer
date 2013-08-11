package javax.net.ssl;

import java.util.EventListener;

public abstract interface HandshakeCompletedListener extends EventListener
{
  public abstract void handshakeCompleted(HandshakeCompletedEvent paramHandshakeCompletedEvent);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.net.ssl.HandshakeCompletedListener
 * JD-Core Version:    0.6.2
 */