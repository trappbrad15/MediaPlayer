package org.xml.sax;

public abstract interface Attributes
{
  public abstract int getLength();

  public abstract String getURI(int paramInt);

  public abstract String getLocalName(int paramInt);

  public abstract String getQName(int paramInt);

  public abstract String getType(int paramInt);

  public abstract String getValue(int paramInt);

  public abstract int getIndex(String paramString1, String paramString2);

  public abstract int getIndex(String paramString);

  public abstract String getType(String paramString1, String paramString2);

  public abstract String getType(String paramString);

  public abstract String getValue(String paramString1, String paramString2);

  public abstract String getValue(String paramString);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.xml.sax.Attributes
 * JD-Core Version:    0.6.2
 */