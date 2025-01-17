// Generated by view binder compiler. Do not edit!
package com.app.blingy.reauty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.blingy.reauty.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPostGridviewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView profPostImg;

  private ItemPostGridviewBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView profPostImg) {
    this.rootView = rootView;
    this.profPostImg = profPostImg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPostGridviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPostGridviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_post_gridview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPostGridviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.prof_postImg;
      ImageView profPostImg = ViewBindings.findChildViewById(rootView, id);
      if (profPostImg == null) {
        break missingId;
      }

      return new ItemPostGridviewBinding((ConstraintLayout) rootView, profPostImg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
