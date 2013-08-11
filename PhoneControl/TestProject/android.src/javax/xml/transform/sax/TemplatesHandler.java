package javax.xml.transform.sax;

import javax.xml.transform.Templates;
import org.xml.sax.ContentHandler;

public abstract interface TemplatesHandler extends ContentHandler
{
  public abstract Templates getTemplates();

  public abstract void setSystemId(String paramString);

  public abstract String getSystemId();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.xml.transform.sax.TemplatesHandler
 * JD-Core Version:    0.6.2
 */