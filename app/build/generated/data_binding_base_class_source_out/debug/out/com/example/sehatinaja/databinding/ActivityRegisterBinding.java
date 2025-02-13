// Generated by view binder compiler. Do not edit!
package com.example.sehatinaja.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sehatinaja.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backBtn2;

  @NonNull
  public final EditText editTextEmail;

  @NonNull
  public final EditText editTextPassword;

  @NonNull
  public final EditText editTextUsername;

  @NonNull
  public final AppCompatButton loginEmailBtn;

  @NonNull
  public final AppCompatButton loginTeleponBtn;

  @NonNull
  public final RadioButton rbFemale;

  @NonNull
  public final RadioButton rbMale;

  @NonNull
  public final AppCompatButton registerBtn;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView tvLogin;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton backBtn2,
      @NonNull EditText editTextEmail, @NonNull EditText editTextPassword,
      @NonNull EditText editTextUsername, @NonNull AppCompatButton loginEmailBtn,
      @NonNull AppCompatButton loginTeleponBtn, @NonNull RadioButton rbFemale,
      @NonNull RadioButton rbMale, @NonNull AppCompatButton registerBtn,
      @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView tvLogin) {
    this.rootView = rootView;
    this.backBtn2 = backBtn2;
    this.editTextEmail = editTextEmail;
    this.editTextPassword = editTextPassword;
    this.editTextUsername = editTextUsername;
    this.loginEmailBtn = loginEmailBtn;
    this.loginTeleponBtn = loginTeleponBtn;
    this.rbFemale = rbFemale;
    this.rbMale = rbMale;
    this.registerBtn = registerBtn;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.tvLogin = tvLogin;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_btn2;
      ImageButton backBtn2 = ViewBindings.findChildViewById(rootView, id);
      if (backBtn2 == null) {
        break missingId;
      }

      id = R.id.editTextEmail;
      EditText editTextEmail = ViewBindings.findChildViewById(rootView, id);
      if (editTextEmail == null) {
        break missingId;
      }

      id = R.id.editTextPassword;
      EditText editTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextPassword == null) {
        break missingId;
      }

      id = R.id.editTextUsername;
      EditText editTextUsername = ViewBindings.findChildViewById(rootView, id);
      if (editTextUsername == null) {
        break missingId;
      }

      id = R.id.loginEmail_btn;
      AppCompatButton loginEmailBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginEmailBtn == null) {
        break missingId;
      }

      id = R.id.loginTelepon_btn;
      AppCompatButton loginTeleponBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginTeleponBtn == null) {
        break missingId;
      }

      id = R.id.rb_female;
      RadioButton rbFemale = ViewBindings.findChildViewById(rootView, id);
      if (rbFemale == null) {
        break missingId;
      }

      id = R.id.rb_male;
      RadioButton rbMale = ViewBindings.findChildViewById(rootView, id);
      if (rbMale == null) {
        break missingId;
      }

      id = R.id.register_btn;
      AppCompatButton registerBtn = ViewBindings.findChildViewById(rootView, id);
      if (registerBtn == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.tv_login;
      TextView tvLogin = ViewBindings.findChildViewById(rootView, id);
      if (tvLogin == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, backBtn2, editTextEmail,
          editTextPassword, editTextUsername, loginEmailBtn, loginTeleponBtn, rbFemale, rbMale,
          registerBtn, textView4, textView5, tvLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
