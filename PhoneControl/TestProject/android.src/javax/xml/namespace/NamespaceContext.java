package javax.xml.namespace;

import java.util.Iterator;

public abstract interface NamespaceContext
{
  public abstract String getNamespaceURI(String paramString);

  public abstract String getPrefix(String paramString);

  public abstract Iterator getPrefixes(String paramString);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.xml.namespace.NamespaceContext
 * JD-Core Version:    0.6.2
 */