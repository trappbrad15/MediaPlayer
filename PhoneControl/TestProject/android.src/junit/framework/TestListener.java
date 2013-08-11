package junit.framework;

public abstract interface TestListener
{
  public abstract void addError(Test paramTest, Throwable paramThrowable);

  public abstract void addFailure(Test paramTest, AssertionFailedError paramAssertionFailedError);

  public abstract void endTest(Test paramTest);

  public abstract void startTest(Test paramTest);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     junit.framework.TestListener
 * JD-Core Version:    0.6.2
 */