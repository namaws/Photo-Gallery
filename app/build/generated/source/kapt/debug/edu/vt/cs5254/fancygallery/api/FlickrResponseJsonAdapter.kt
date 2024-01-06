// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package edu.vt.cs5254.fancygallery.api

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class FlickrResponseJsonAdapter(
  moshi: Moshi
) : JsonAdapter<FlickrResponse>() {
  private val options: JsonReader.Options = JsonReader.Options.of("photos")

  private val photoResponseAdapter: JsonAdapter<PhotoResponse> =
      moshi.adapter(PhotoResponse::class.java, emptySet(), "photos")

  public override fun toString(): String = buildString(36) {
      append("GeneratedJsonAdapter(").append("FlickrResponse").append(')') }

  public override fun fromJson(reader: JsonReader): FlickrResponse {
    var photos: PhotoResponse? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> photos = photoResponseAdapter.fromJson(reader) ?: throw Util.unexpectedNull("photos",
            "photos", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return FlickrResponse(
        photos = photos ?: throw Util.missingProperty("photos", "photos", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: FlickrResponse?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("photos")
    photoResponseAdapter.toJson(writer, value_.photos)
    writer.endObject()
  }
}
