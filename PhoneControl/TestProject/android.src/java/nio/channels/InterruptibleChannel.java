package java.nio.channels;

import java.io.IOException;

public abstract interface InterruptibleChannel extends Channel
{
  public abstract void close()
    throws IOException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.nio.channels.InterruptibleChannel
 * JD-Core Version:    0.6.2
 */