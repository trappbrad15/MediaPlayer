package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpResponseInterceptor;

public abstract interface HttpResponseInterceptorList
{
  public abstract void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor);

  public abstract void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor, int paramInt);

  public abstract int getResponseInterceptorCount();

  public abstract HttpResponseInterceptor getResponseInterceptor(int paramInt);

  public abstract void clearResponseInterceptors();

  public abstract void removeResponseInterceptorByClass(Class paramClass);

  public abstract void setInterceptors(List paramList);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.protocol.HttpResponseInterceptorList
 * JD-Core Version:    0.6.2
 */