package android.widget;

import android.database.Cursor;

public abstract interface FilterQueryProvider
{
  public abstract Cursor runQuery(CharSequence paramCharSequence);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.FilterQueryProvider
 * JD-Core Version:    0.6.2
 */