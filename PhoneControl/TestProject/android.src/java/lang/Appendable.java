package java.lang;

import java.io.IOException;

public abstract interface Appendable
{
  public abstract Appendable append(char paramChar)
    throws IOException;

  public abstract Appendable append(CharSequence paramCharSequence)
    throws IOException;

  public abstract Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    throws IOException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.Appendable
 * JD-Core Version:    0.6.2
 */