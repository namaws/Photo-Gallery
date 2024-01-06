package edu.vt.cs5254.fancygallery;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MapFragmentDirections {
  private MapFragmentDirections() {
  }

  @NonNull
  public static ShowPhotoFromMarker showPhotoFromMarker(@NonNull Uri photoPageUri) {
    return new ShowPhotoFromMarker(photoPageUri);
  }

  public static class ShowPhotoFromMarker implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ShowPhotoFromMarker(@NonNull Uri photoPageUri) {
      if (photoPageUri == null) {
        throw new IllegalArgumentException("Argument \"photoPageUri\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("photoPageUri", photoPageUri);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ShowPhotoFromMarker setPhotoPageUri(@NonNull Uri photoPageUri) {
      if (photoPageUri == null) {
        throw new IllegalArgumentException("Argument \"photoPageUri\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("photoPageUri", photoPageUri);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("photoPageUri")) {
        Uri photoPageUri = (Uri) arguments.get("photoPageUri");
        if (Parcelable.class.isAssignableFrom(Uri.class) || photoPageUri == null) {
          __result.putParcelable("photoPageUri", Parcelable.class.cast(photoPageUri));
        } else if (Serializable.class.isAssignableFrom(Uri.class)) {
          __result.putSerializable("photoPageUri", Serializable.class.cast(photoPageUri));
        } else {
          throw new UnsupportedOperationException(Uri.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.show_photo_from_marker;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Uri getPhotoPageUri() {
      return (Uri) arguments.get("photoPageUri");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ShowPhotoFromMarker that = (ShowPhotoFromMarker) object;
      if (arguments.containsKey("photoPageUri") != that.arguments.containsKey("photoPageUri")) {
        return false;
      }
      if (getPhotoPageUri() != null ? !getPhotoPageUri().equals(that.getPhotoPageUri()) : that.getPhotoPageUri() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getPhotoPageUri() != null ? getPhotoPageUri().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ShowPhotoFromMarker(actionId=" + getActionId() + "){"
          + "photoPageUri=" + getPhotoPageUri()
          + "}";
    }
  }
}
