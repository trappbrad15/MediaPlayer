package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract interface WritableByteChannel extends Channel
{
  public abstract int write(ByteBuffer paramByteBuffer)
    throws IOException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.nio.channels.WritableByteChannel
 * JD-Core Version:    0.6.2
 */