package android.text.method;

import android.graphics.Rect;
import android.view.View;

public abstract interface TransformationMethod
{
  public abstract CharSequence getTransformation(CharSequence paramCharSequence, View paramView);

  public abstract void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.method.TransformationMethod
 * JD-Core Version:    0.6.2
 */