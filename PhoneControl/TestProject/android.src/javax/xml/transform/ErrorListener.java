package javax.xml.transform;

public abstract interface ErrorListener
{
  public abstract void warning(TransformerException paramTransformerException)
    throws TransformerException;

  public abstract void error(TransformerException paramTransformerException)
    throws TransformerException;

  public abstract void fatalError(TransformerException paramTransformerException)
    throws TransformerException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.xml.transform.ErrorListener
 * JD-Core Version:    0.6.2
 */