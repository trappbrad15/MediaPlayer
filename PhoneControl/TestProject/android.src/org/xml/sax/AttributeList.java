package org.xml.sax;

@Deprecated
public abstract interface AttributeList
{
  public abstract int getLength();

  public abstract String getName(int paramInt);

  public abstract String getType(int paramInt);

  public abstract String getValue(int paramInt);

  public abstract String getType(String paramString);

  public abstract String getValue(String paramString);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.xml.sax.AttributeList
 * JD-Core Version:    0.6.2
 */