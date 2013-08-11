package java.util.logging;

import java.util.List;

public abstract interface LoggingMXBean
{
  public abstract String getLoggerLevel(String paramString);

  public abstract List<String> getLoggerNames();

  public abstract String getParentLoggerName(String paramString);

  public abstract void setLoggerLevel(String paramString1, String paramString2);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.logging.LoggingMXBean
 * JD-Core Version:    0.6.2
 */