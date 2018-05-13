// Generated code from Butter Knife. Do not modify!
package com.khilman.www.aplikasidatasiswa;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131230792;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.rvDaftarSiswa = Utils.findRequiredViewAsType(source, R.id.rvDaftarSiswa, "field 'rvDaftarSiswa'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.fabAdd, "field 'fabAdd' and method 'onViewClicked'");
    target.fabAdd = Utils.castView(view, R.id.fabAdd, "field 'fabAdd'", FloatingActionButton.class);
    view2131230792 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvDaftarSiswa = null;
    target.fabAdd = null;

    view2131230792.setOnClickListener(null);
    view2131230792 = null;
  }
}
