package android.view;

import android.graphics.drawable.Drawable;

public abstract interface SubMenu extends Menu
{
  public abstract SubMenu setHeaderTitle(int paramInt);

  public abstract SubMenu setHeaderTitle(CharSequence paramCharSequence);

  public abstract SubMenu setHeaderIcon(int paramInt);

  public abstract SubMenu setHeaderIcon(Drawable paramDrawable);

  public abstract SubMenu setHeaderView(View paramView);

  public abstract void clearHeader();

  public abstract SubMenu setIcon(int paramInt);

  public abstract SubMenu setIcon(Drawable paramDrawable);

  public abstract MenuItem getItem();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.SubMenu
 * JD-Core Version:    0.6.2
 */