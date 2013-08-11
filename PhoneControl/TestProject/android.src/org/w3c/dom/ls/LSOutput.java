package org.w3c.dom.ls;

import java.io.OutputStream;
import java.io.Writer;

public abstract interface LSOutput
{
  public abstract Writer getCharacterStream();

  public abstract void setCharacterStream(Writer paramWriter);

  public abstract OutputStream getByteStream();

  public abstract void setByteStream(OutputStream paramOutputStream);

  public abstract String getSystemId();

  public abstract void setSystemId(String paramString);

  public abstract String getEncoding();

  public abstract void setEncoding(String paramString);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.ls.LSOutput
 * JD-Core Version:    0.6.2
 */