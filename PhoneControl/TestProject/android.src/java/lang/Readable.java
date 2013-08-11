package java.lang;

import java.io.IOException;
import java.nio.CharBuffer;

public abstract interface Readable
{
  public abstract int read(CharBuffer paramCharBuffer)
    throws IOException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.Readable
 * JD-Core Version:    0.6.2
 */