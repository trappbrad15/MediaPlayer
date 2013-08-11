package junit.runner;

public abstract interface TestSuiteLoader
{
  public abstract Class load(String paramString)
    throws ClassNotFoundException;

  public abstract Class reload(Class paramClass)
    throws ClassNotFoundException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     junit.runner.TestSuiteLoader
 * JD-Core Version:    0.6.2
 */