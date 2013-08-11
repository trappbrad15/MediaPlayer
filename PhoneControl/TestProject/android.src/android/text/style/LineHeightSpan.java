package android.text.style;

import android.graphics.Paint.FontMetricsInt;
import android.text.TextPaint;

public abstract interface LineHeightSpan extends ParagraphStyle, WrapTogetherSpan
{
  public abstract void chooseHeight(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint.FontMetricsInt paramFontMetricsInt);

  public static abstract interface WithDensity extends LineHeightSpan
  {
    public abstract void chooseHeight(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint.FontMetricsInt paramFontMetricsInt, TextPaint paramTextPaint);
  }
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.style.LineHeightSpan
 * JD-Core Version:    0.6.2
 */