package java.util.regex;

public abstract interface MatchResult
{
  public abstract int end();

  public abstract int end(int paramInt);

  public abstract String group();

  public abstract String group(int paramInt);

  public abstract int groupCount();

  public abstract int start();

  public abstract int start(int paramInt);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.regex.MatchResult
 * JD-Core Version:    0.6.2
 */