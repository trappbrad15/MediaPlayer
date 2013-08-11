package android.nfc.tech;

import android.nfc.Tag;
import java.io.Closeable;
import java.io.IOException;

public abstract interface TagTechnology extends Closeable
{
  public abstract Tag getTag();

  public abstract void connect()
    throws IOException;

  public abstract void close()
    throws IOException;

  public abstract boolean isConnected();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.nfc.tech.TagTechnology
 * JD-Core Version:    0.6.2
 */