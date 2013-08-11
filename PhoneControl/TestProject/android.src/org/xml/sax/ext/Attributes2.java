package org.xml.sax.ext;

import org.xml.sax.Attributes;

public abstract interface Attributes2 extends Attributes
{
  public abstract boolean isDeclared(int paramInt);

  public abstract boolean isDeclared(String paramString);

  public abstract boolean isDeclared(String paramString1, String paramString2);

  public abstract boolean isSpecified(int paramInt);

  public abstract boolean isSpecified(String paramString1, String paramString2);

  public abstract boolean isSpecified(String paramString);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.xml.sax.ext.Attributes2
 * JD-Core Version:    0.6.2
 */