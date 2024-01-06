// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package edu.vt.cs5254.fancygallery.api

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.`internal`.Util
import edu.vt.cs5254.fancygallery.GalleryItem
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class PhotoResponseJsonAdapter(
  moshi: Moshi
) : JsonAdapter<PhotoResponse>() {
  private val options: JsonReader.Options = JsonReader.Options.of("photo")

  private val listOfGalleryItemAdapter: JsonAdapter<List<GalleryItem>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, GalleryItem::class.java),
      emptySet(), "galleryItems")

  public override fun toString(): String = buildString(35) {
      append("GeneratedJsonAdapter(").append("PhotoResponse").append(')') }

  public override fun fromJson(reader: JsonReader): PhotoResponse {
    var galleryItems: List<GalleryItem>? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> galleryItems = listOfGalleryItemAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("galleryItems", "photo", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return PhotoResponse(
        galleryItems = galleryItems ?: throw Util.missingProperty("galleryItems", "photo", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: PhotoResponse?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("photo")
    listOfGalleryItemAdapter.toJson(writer, value_.galleryItems)
    writer.endObject()
  }
}
