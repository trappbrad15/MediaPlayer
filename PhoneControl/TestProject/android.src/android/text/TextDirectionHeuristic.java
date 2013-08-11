package android.text;

public abstract interface TextDirectionHeuristic
{
  public abstract boolean isRtl(char[] paramArrayOfChar, int paramInt1, int paramInt2);

  public abstract boolean isRtl(CharSequence paramCharSequence, int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.TextDirectionHeuristic
 * JD-Core Version:    0.6.2
 */