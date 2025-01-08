// Generated by view binder compiler. Do not edit!
package com.app.blingy.reauty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.blingy.reauty.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCreateReviewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout abLayout;

  @NonNull
  public final TextView cSwitchTextView;

  @NonNull
  public final SwitchCompat customSwitch;

  @NonNull
  public final ImageView scanIc;

  @NonNull
  public final ConstraintLayout switchLayout;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final PreviewView viewFinder;

  private FragmentCreateReviewBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout abLayout, @NonNull TextView cSwitchTextView,
      @NonNull SwitchCompat customSwitch, @NonNull ImageView scanIc,
      @NonNull ConstraintLayout switchLayout, @NonNull MaterialToolbar toolbar,
      @NonNull PreviewView viewFinder) {
    this.rootView = rootView;
    this.abLayout = abLayout;
    this.cSwitchTextView = cSwitchTextView;
    this.customSwitch = customSwitch;
    this.scanIc = scanIc;
    this.switchLayout = switchLayout;
    this.toolbar = toolbar;
    this.viewFinder = viewFinder;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCreateReviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCreateReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_create_review, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCreateReviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ab_layout;
      AppBarLayout abLayout = ViewBindings.findChildViewById(rootView, id);
      if (abLayout == null) {
        break missingId;
      }

      id = R.id.cSwitch_textView;
      TextView cSwitchTextView = ViewBindings.findChildViewById(rootView, id);
      if (cSwitchTextView == null) {
        break missingId;
      }

      id = R.id.custom_switch;
      SwitchCompat customSwitch = ViewBindings.findChildViewById(rootView, id);
      if (customSwitch == null) {
        break missingId;
      }

      id = R.id.scan_ic;
      ImageView scanIc = ViewBindings.findChildViewById(rootView, id);
      if (scanIc == null) {
        break missingId;
      }

      id = R.id.switch_layout;
      ConstraintLayout switchLayout = ViewBindings.findChildViewById(rootView, id);
      if (switchLayout == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.view_finder;
      PreviewView viewFinder = ViewBindings.findChildViewById(rootView, id);
      if (viewFinder == null) {
        break missingId;
      }

      return new FragmentCreateReviewBinding((ConstraintLayout) rootView, abLayout, cSwitchTextView,
          customSwitch, scanIc, switchLayout, toolbar, viewFinder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
