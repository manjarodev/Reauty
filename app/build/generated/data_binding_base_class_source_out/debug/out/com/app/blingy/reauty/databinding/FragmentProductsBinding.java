// Generated by view binder compiler. Do not edit!
package com.app.blingy.reauty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.blingy.reauty.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout containerRv;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final RecyclerView rvBrands;

  @NonNull
  public final RecyclerView rvMatches;

  @NonNull
  public final RecyclerView rvSimilar;

  private FragmentProductsBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout containerRv, @NonNull ProgressBar progress,
      @NonNull RecyclerView rvBrands, @NonNull RecyclerView rvMatches,
      @NonNull RecyclerView rvSimilar) {
    this.rootView = rootView;
    this.containerRv = containerRv;
    this.progress = progress;
    this.rvBrands = rvBrands;
    this.rvMatches = rvMatches;
    this.rvSimilar = rvSimilar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_products, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container_rv;
      LinearLayout containerRv = ViewBindings.findChildViewById(rootView, id);
      if (containerRv == null) {
        break missingId;
      }

      id = R.id.progress;
      ProgressBar progress = ViewBindings.findChildViewById(rootView, id);
      if (progress == null) {
        break missingId;
      }

      id = R.id.rv_brands;
      RecyclerView rvBrands = ViewBindings.findChildViewById(rootView, id);
      if (rvBrands == null) {
        break missingId;
      }

      id = R.id.rv_matches;
      RecyclerView rvMatches = ViewBindings.findChildViewById(rootView, id);
      if (rvMatches == null) {
        break missingId;
      }

      id = R.id.rv_similar;
      RecyclerView rvSimilar = ViewBindings.findChildViewById(rootView, id);
      if (rvSimilar == null) {
        break missingId;
      }

      return new FragmentProductsBinding((ConstraintLayout) rootView, containerRv, progress,
          rvBrands, rvMatches, rvSimilar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
