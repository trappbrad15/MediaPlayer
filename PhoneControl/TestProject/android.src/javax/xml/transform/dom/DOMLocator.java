package javax.xml.transform.dom;

import javax.xml.transform.SourceLocator;
import org.w3c.dom.Node;

public abstract interface DOMLocator extends SourceLocator
{
  public abstract Node getOriginatingNode();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.xml.transform.dom.DOMLocator
 * JD-Core Version:    0.6.2
 */