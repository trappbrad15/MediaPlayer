package android.text;

public abstract interface TextWatcher extends NoCopySpan
{
  public abstract void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3);

  public abstract void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3);

  public abstract void afterTextChanged(Editable paramEditable);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.TextWatcher
 * JD-Core Version:    0.6.2
 */