package org.apache.commons.logging;

public abstract interface Log
{
  public abstract boolean isDebugEnabled();

  public abstract boolean isErrorEnabled();

  public abstract boolean isFatalEnabled();

  public abstract boolean isInfoEnabled();

  public abstract boolean isTraceEnabled();

  public abstract boolean isWarnEnabled();

  public abstract void trace(Object paramObject);

  public abstract void trace(Object paramObject, Throwable paramThrowable);

  public abstract void debug(Object paramObject);

  public abstract void debug(Object paramObject, Throwable paramThrowable);

  public abstract void info(Object paramObject);

  public abstract void info(Object paramObject, Throwable paramThrowable);

  public abstract void warn(Object paramObject);

  public abstract void warn(Object paramObject, Throwable paramThrowable);

  public abstract void error(Object paramObject);

  public abstract void error(Object paramObject, Throwable paramThrowable);

  public abstract void fatal(Object paramObject);

  public abstract void fatal(Object paramObject, Throwable paramThrowable);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.commons.logging.Log
 * JD-Core Version:    0.6.2
 */