package javax.xml.transform;

public abstract interface SourceLocator
{
  public abstract String getPublicId();

  public abstract String getSystemId();

  public abstract int getLineNumber();

  public abstract int getColumnNumber();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.xml.transform.SourceLocator
 * JD-Core Version:    0.6.2
 */